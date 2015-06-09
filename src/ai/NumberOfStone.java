package ai;

import game.Stone;

public class NumberOfStone {
	private Stone board[][];
	private Stone turn;
	NumberOfStone(Stone turn,Stone board[][]) {
		this.board = new Stone[8][8];
		this.board = board;
		this.turn = turn;
	}
	
	public int getNumberOfStoneEvaluate(){
		int myNumber = 0,enemyNumber = 0;
	
		for(int y = 0;y < 8; y++){
			for(int x = 0;x < 8; x++){
				if(board[y][x] == turn){
					myNumber++;
				}else if(board[y][x] == turn.reverse()){
					enemyNumber++;
				}
			}
		}

//		System.out.println(myNumber +"     "+ enemyNumber);
		return myNumber-enemyNumber;
	
	}
	
	
}
