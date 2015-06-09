package ai;

import game.Direction;
import game.Stone;

public class OpenStoneLogic {
	private Stone board[][];
	private Stone turn;
	OpenStoneLogic(Stone board[][],Stone AIturn){
		this.board = new Stone[8][8];
		this.turn = AIturn;
		for(int y = 0;y < 8;y++){
			for(int x = 0;x < 8;x++){
				this.board[y][x] = board[y][x] ;
			}
		}
	}
	
	
	public int getOpenStoneEvaluate(){
//		System.out.println(enemyOpenStone() +"   "+myOpenStone());
		return enemyOpenStone() - myOpenStone();
	}
	
	
	private int myOpenStone(){
		int openStoneCounter = 0;
		for(int y = 0;y < 8;y++){
			for(int x = 0;x < 8;x++){
				if(board[y][x] == turn){
					for(Direction d: Direction.values()){
						int ddx=x+d.dx(), ddy = y+d.dy();
						if(isValidIndex(ddx, ddy)&&board[ddy][ddx]== Stone.EMPTY){
							openStoneCounter++;
						}
					}
				}
			
			}
		}
		return openStoneCounter;
	}
	
	private int enemyOpenStone(){
		int openStoneCounter = 0;
		for(int y = 0;y < 8;y++){
			for(int x = 0;x < 8;x++){
				if(board[y][x] == turn.reverse()){
					for(Direction d: Direction.values()){
						int ddx=x+d.dx(), ddy = y+d.dy();
						if(isValidIndex(ddx, ddy)&&board[ddy][ddx]== Stone.EMPTY){
							openStoneCounter++;
						}
					}
				}
			
			}
		}
		return openStoneCounter;
	}
	
	
	private boolean isValidIndex(int x,int y){
		if(x >= 0 && x <= 7 && y >= 0 && y <= 7)
			return true;
		
		return false;
	}
}
