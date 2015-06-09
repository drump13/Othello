package ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import game.Board;
import game.Direction;
import game.Stone;

public class BoardWeight {
	Board b;
	Stone AIturn;
	private Stone boardArray[][] = new Stone[8][8];
	private int weightArray[][] = new int[8][8];
	public BoardWeight(Board b,Stone AIturn){
		this.b = b;
		this.AIturn = AIturn;
		for(int x = 0;x < 8;x++){
			for(int y = 0;y<8;y++){
				boardArray[y][x] = b.returnBoard(x, y);
			}
		}
	}
	
	private void initBoardArray(){
		BoardWeightData bwd = new BoardWeightData(AIturn,boardArray);
		for(int x = 0;x < 8;x++){
			for(int y = 0;y<8;y++){
				weightArray[y][x] = bwd.returnWeightarray(x, y); 
			}
		}
	}
	
	public int AIResult(){
		ArrayList<Integer> canPutList = makeList();
		Map<Integer,Integer> evaluateMap = new HashMap<Integer,Integer>();
		int maxData = -10000,maxkey = 0;
		for(int l= 0;l < canPutList.size(); l++){
				initBoardArray();
				int canPut = canPutList.get(l);
				testPut(canPut/10, canPut%10, AIturn);
				int currentEvaluate = evaluateCondition();
				evaluateMap.put(canPut,currentEvaluate);
				if(maxData < currentEvaluate){
					maxkey = canPut;
					maxData = currentEvaluate;
				}
		}
		
		return maxkey;
	}
	
	
	
	
	//評価関数
	private int evaluateCondition(){
		int myCondition = 0;
		int enemyCondition = 0;
		for(int x = 0;x < 8;x++){
			for(int y = 0;y<8;y++){
				if(boardArray[y][x] == AIturn){
					myCondition += weightArray[y][x] ;
				}else if(boardArray[y][x] == AIturn.reverse()) {
					enemyCondition += weightArray[y][x];
				}
			
			}
		}
		
		return myCondition - enemyCondition;
	}
	
	private ArrayList<Integer> makeList(){
		ArrayList<Integer> canPutList = new ArrayList<Integer>();
		for(int x = 0;x < 8;x++){
			for(int y = 0;y < 8;y++){
				if(b.putCheck(x, y, AIturn)){
					canPutList.add(10*x + y);
				}
			}
		}
		
		return canPutList;
	}
	
	private void testPut(int x,int y,Stone turn){
//		System.out.println(x+"  "+y);
		
		boardArray[y][x] = turn;
		testDoReverse(x,y,turn);
	//	currentTurn = currentTurn.reverse();
	}
	
	//石が置かれる時、ひっくり返す
		private void testDoReverse(int x,int y,Stone turn){
			for(Direction d : Direction.values()){
				if(checkReverseLine(x, y, turn, d)){
					int x0 = x + d.dx();
					int y0 = y + d.dy();
					while(boardArray[y0][x0] != turn){
						boardArray[y0][x0] = turn;
						x0 += d.dx();
						y0 += d.dy();
					}
					
				}
			}
		}
		
		private boolean checkReverseLine(int x,int y,Stone turn,Direction d){
			int x0 = x + d.dx();
			int y0 = y + d.dy(); 
			
			if(!isValidIndex(x0,y0)){
				return false;
			}
			if(boardArray[y0][x0] == turn){
				return false;
			}
			
			while(isValidIndex(x0, y0) && boardArray[y0][x0] != Stone.EMPTY){
				
				x0 += d.dx();
				y0 += d.dy();
				
				if(isValidIndex(x0, y0) && boardArray[y0][x0] == turn){
					return true;
				}
			}
			return false;
		}	

		private boolean isValidIndex(int x,int y){
			if(x >= 0 && x <= 7 && y >= 0 && y <= 7)
				return true;
			
			return false;
		}
		
	
}
