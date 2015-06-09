package game;

import java.security.AllPermission;
import java.util.ArrayList;

public class Board {
	Stone data[][] = new Stone[8][8];
	int black,white;
	Stone currentTurn;
	private int numberOfTurn;
	private ArrayList<Integer> kifu = new ArrayList<Integer>();

	public Board(Board b) {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				this.data[i][j] = b.data[i][j];
			}
		}
		this.black = b.black;
		this.white = b.white;
		this.currentTurn = b.currentTurn;
		this.numberOfTurn = b.numberOfTurn;
		this.kifu = new ArrayList<Integer>(b.kifu);
	}
	
	public Board() {
	}
	
	//ゲームの初期化
	public void initGame(){
		for(int count = 0;count < 8;count++){
			for(int count2 = 0;count2 < 8; count2++){
				data[count][count2] = Stone.EMPTY;
			}
		}
		data[3][4] = Stone.BLACK;
		data[4][3] = Stone.BLACK;
		data[3][3] = Stone.WHITE;
		data[4][4] = Stone.WHITE;
		numberOfTurn = 0;
	}
	
	//盤の情報を返す
	public Stone returnBoard(int x,int y){
		return data[y][x];
	}
	
	//debug用にコンソールへ表示する
	public void display(){
		for(int count = 0;count < 8;count++){
			for(int count2 = 0;count2 < 8; count2++){
				System.out.print(data[count][count2] + " ");
			}
			System.out.println("");
		}
		
	}
	
	//石がそこに置けるかどうか
	public boolean putCheck(int x,int y,Stone turn){
		if(!nonExistCheck(x,y,turn)){
			return false;
		}else{
			return reverseCheck(x,y,turn);
		}
	}
	
	//石をそこにおいて、ひっくり返せるかどうか
	private boolean reverseCheck(int x, int y,Stone turn){
		for(Direction d:Direction.values()){
			if(checkReverseLine(x, y, turn, d)){
				return true;
			}
		}
		
		return false;
	}
	
	//うたれたところに石がないか？
	private boolean nonExistCheck(int x,int y,Stone turn){
		if(isValidIndex(x, y) && data[y][x] == Stone.EMPTY){
			return true;
		}else{
			return false;
		}
	}
	
	
	//石を置く
	public void put(int x,int y,Stone turn){
		System.out.println(x+"  "+y);
		
		data[y][x] = turn;
		doReverse(x,y,turn);
		addNumberOfTurn();
		addKifu(x, y);
	//	currentTurn = currentTurn.reverse();
	}
	
	//石が置かれる時、ひっくり返す
	private void doReverse(int x,int y,Stone turn){
		for(Direction d : Direction.values()){
			if(checkReverseLine(x, y, turn, d)){
				int x0 = x + d.dx();
				int y0 = y + d.dy();
				while(data[y0][x0] != turn){
					data[y0][x0] = turn;
					x0 += d.dx();
					y0 += d.dy();
				}
				
			}
		}
	}
	
	//現在のターン数を返す(AIの序盤中盤終盤判定用)
	public int returnNumberOfTurn(){
		return numberOfTurn;
	}
	
	//ターン数増加
	private void addNumberOfTurn(){
		numberOfTurn++;
	}
	
	//その人のターンで置けるところがあるか？
	public boolean canPut(Stone turn){
		for(int x = 0;x < 8;x++){
			for(int y = 0;y<8;y++){
				if(returnBoard(x, y) == Stone.EMPTY && reverseCheck(x,y,turn)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	//置かれたところから1行ひっくり返せるかどうか判定
	private boolean checkReverseLine(int x,int y,Stone turn,Direction d){
		int x0 = x + d.dx();
		int y0 = y + d.dy(); 
		
		if(!isValidIndex(x0,y0)){
			return false;
		}
		if(data[y0][x0] == turn){
			return false;
		}
		
		while(isValidIndex(x0, y0) && data[y0][x0] != Stone.EMPTY){
			
			x0 += d.dx();
			y0 += d.dy();
			
			if(isValidIndex(x0, y0) && data[y0][x0] == turn){
				return true;
			}
		}
		return false;
	}
	
	
	//ゲームが終わったか？
	public boolean IsGameEnd(){
		if(allBlack() || allWhite() || isAllPutted()||(!canPut(Stone.BLACK)&&!canPut(Stone.WHITE))){
			return true;
		}		
		return false;
	}
	
	//白がまだ存在するか？
	private boolean allBlack(){
		for(int count = 0;count < 8;count++){
		   for(int count2 = 0;count2 < 8;count2++){
			   if(data[count][count2] == Stone.WHITE){
				   return false;
			   }
		   }
		}
		return true;
	}
	
	
	//黒がまだ存在するか？
	private boolean allWhite(){
		for(int count = 0;count < 8;count++){
		   for(int count2 = 0;count2 < 8;count2++){
			   if(data[count][count2] == Stone.BLACK){
				   return false;
			   }
		   }
		}
		return true;
	}
	
   //全てのマスが埋まったか？
	private boolean isAllPutted(){
		for(int count = 0;count < 8;count++){
			   for(int count2 = 0;count2 < 8;count2++){
				   if(data[count][count2] == Stone.EMPTY){
					   return false;
				   }
			   }	
			}	
			return true;
	}

	//最後の石の数を持ってくる、最後の勝敗判定に使う
	public int getNumber(Stone stone){
		int counter = 0;
		for(int count = 0;count < 8;count++){
			   for(int count2 = 0;count2 < 8;count2++){
				   if(data[count][count2] == stone){
					   counter++;
				   }
			   }	
			}	
		return counter;
	}

	public boolean isValidIndex(int x,int y){
		if(x >= 0 && x <= 7 && y >= 0 && y <= 7)
			return true;
		
		return false;
	}

	public int currentTurnNumber(){
		int count = -3;
		for(int x = 0;x < 8;x++){
			for(int y = 0;y < 8;y++){
				if(data[y][x] != Stone.EMPTY){
					count++;
				}
			}
		}
		
		return count;
	}
	
	//棋譜に情報を追加する
	private void addKifu(int x,int y){
		kifu.add(10*x+y);
	}
	
	//今までの棋譜情報を返す
	public ArrayList<Integer> returnKifu(){
		return kifu;
	}
	
	

}
