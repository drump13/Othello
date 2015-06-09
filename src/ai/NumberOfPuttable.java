package ai;

import java.util.ArrayList;

import game.Direction;
import game.Stone;

public class NumberOfPuttable {
	private Stone board[][];
	private Stone turn;
	NumberOfPuttable(Stone turn,Stone board[][]) {
		this.board = new Stone[8][8];
		this.board = board;
		this.turn = turn;
	}
	
	public int getPuttableEvaluate(){
		int myCounter= 0,enemyCounter= 0;
		for(int x = 0;x < 8;x++){
			for(int y = 0;y < 8;y++){
				if(putCheck(x, y, turn)){
					myCounter++;
				}
				if(putCheck(x,y,turn.reverse())){
						enemyCounter++;
				}
			}
		}
//		System.out.println(myCounter+"     "+enemyCounter);
		
		return myCounter - enemyCounter;
	}

	
	private boolean putCheck(int x,int y,Stone turn){
		if(!nonExistCheck(x,y,turn)){
			return false;
		}else{
			return reverseCheck(x,y,turn);
		}
	}

	
	
	private boolean nonExistCheck(int x,int y,Stone turn){
		if(isValidIndex(x, y) && board[y][x] == Stone.EMPTY){
			return true;
		}else{
			return false;
		}
	}
	

	private boolean checkReverseLine(int x,int y,Stone turn,Direction d){
		int x0 = x + d.dx();
		int y0 = y + d.dy(); 
		
		if(!isValidIndex(x0,y0)){
			return false;
		}
		if(board[y0][x0] == turn){
			return false;
		}
		
		while(isValidIndex(x0, y0) && board[y0][x0] != Stone.EMPTY){
			
			x0 += d.dx();
			y0 += d.dy();
			
			if(isValidIndex(x0, y0) && board[y0][x0] == turn){
				return true;
			}
		}
		return false;
	}	


	
	private boolean reverseCheck(int x, int y,Stone turn){
		for(Direction d:Direction.values()){
			if(checkReverseLine(x, y, turn, d)){
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
