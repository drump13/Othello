package ai;

import game.Direction;
import game.Stone;

public class AbusoluteStones {
	
	private Stone[][] board;
	private Stone[][] enemyBoard;
	private Stone AIturn;
	
	AbusoluteStones(Stone[][] board,Stone AIturn){
		this.board = new Stone[8][8];
		this.enemyBoard = new Stone[8][8];
		this.AIturn = AIturn; 
		for(int y = 0;y < 8;y++){
			for(int x = 0;x < 8;x++){
				this.board[y][x] = board[y][x];
				this.enemyBoard[y][x] = board[y][x];
			}
		}
	
	}
	
	
	
	
	public int getAIturnAbusoluteStonesEvaluate(){
		
		for(int y = 0;y < 8;y++){
			for(int x = 0;x < 8;x++){
			
				if(board[y][x] != AIturn){
					testPut(x, y,AIturn.reverse(), board);
				}
				if(enemyBoard[y][x] != AIturn.reverse()){
					testPut(x,y,AIturn,enemyBoard);
				}
			}
	//		System.out.println("");
		}
	//	System.out.println(getNumber(AIturn,board)+"   "+getNumber(AIturn.reverse(), enemyBoard));
		return getNumber(AIturn,board) - getNumber(AIturn.reverse(), enemyBoard);
	}
	
	private void testPut(int x,int y,Stone turn,Stone stones[][]){
		stones[y][x] = turn;
		testDoReverse(x,y,turn,stones);
	}
	
	//石が置かれる時、ひっくり返す
		private void testDoReverse(int x,int y,Stone turn,Stone stones[][]){
			for(Direction d : Direction.values()){
				if(checkReverseLine(x, y, turn, d,stones)){
					int x0 = x + d.dx();
					int y0 = y + d.dy();
					while(stones[y0][x0] != turn){
						stones[y0][x0] = turn;
						x0 += d.dx();
						y0 += d.dy();
					}
					
				}
			}
		}
		
		private boolean checkReverseLine(int x,int y,Stone turn,Direction d,Stone stones[][]){
			int x0 = x + d.dx();
			int y0 = y + d.dy(); 
			
			if(!isValidIndex(x0,y0)){
				return false;
			}
			if(stones[y0][x0] == turn){
				return false;
			}
			
			while(isValidIndex(x0, y0) && stones[y0][x0] != Stone.EMPTY){
				
				x0 += d.dx();
				y0 += d.dy();
				
				if(isValidIndex(x0, y0) && stones[y0][x0] == turn){
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
		
		public int getNumber(Stone stone,Stone stones[][]){
			int count = 0;
			for(int x = 0;x < 8;x++){
				for(int y = 0;y < 8;y++){
					if(stones[y][x] == stone){
						count++;
					}
				}
			}
			return count;
		}
		
		public Stone returnAIBoard(int x,int y){
			return board[y][x];
			
		}
		
	
}
