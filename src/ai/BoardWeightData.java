package ai;

import game.Stone;

public class BoardWeightData {
	protected int[][] weight = new int[8][8];
	private Stone weightBoard[][];
	private Stone turn;
	BoardWeightData(Stone turn,Stone board[][]){
		weightBoard = new Stone[8][8];
		this.weightBoard = board;
		initWeight2();
		this.turn = turn;
	}
	
	
	public int  returnWeightarray(int x,int y){
		return weight[y][x];
	}
	
	public int getWeightBoardEvaluate(){
		int mySum = 0,enemySum = 0;
		for(int y = 0;y < 8;y++){
			for(int x = 0;x < 8;x++){
				if(weightBoard[y][x] == turn){
					mySum += weight[y][x] ;
				}else if(weightBoard[y][x] == turn.reverse()){
					enemySum -= weight[y][x];
				}
			}
		}
//		System.out.println(mySum +"   "+enemySum);
		return mySum - enemySum;
	}
	
	public void initWeight2(){
		for(int y= 0;y < 8;y++){
			for(int x= 0;x < 8;x++){
				weight[y][x] = 0;
			}
		}
		weight[0][0] = 30;
		weight[0][1] = -10;
		weight[0][2] = 2;
		weight[0][5] = 2;
		weight[0][6] = -10;
		weight[0][7] = 30;
		weight[1][0] = -2;
		weight[1][1] = -10;
		weight[1][6] = -10;
		weight[1][7] = -2;
		weight[6][0] = -2;
		weight[6][1] = -10;
		weight[6][6] = -10;
		weight[6][7] = -2;
		weight[7][0] = 30;
		weight[7][1] = -10;
		weight[7][2] = 2;
		weight[7][5] = 2;
		weight[7][6] = -10;
		weight[7][7] = 30;
	}
	
	public void initWeight1(){
		weight[0][0] = 1000;
		weight[0][1] = -40;
		weight[0][2] = 20;
		weight[0][3] = 5;
		weight[0][4] = 5;
		weight[0][5] = 20;
		weight[0][6] = -40;
		weight[0][7] = 1000;
		
		weight[1][0] = -40;
		weight[1][1] = -180;
		weight[1][2] = -1;
		weight[1][3] = -1;
		weight[1][4] = -1;
		weight[1][5] = -1;
		weight[1][6] = -180;
		weight[1][7] = -40;
		
		weight[2][0] = 20;
		weight[2][1] = -1;
		weight[2][2] = 5;
		weight[2][3] = 1;
		weight[2][4] = 1;
		weight[2][5] = 5;
		weight[2][6] = -1;
		weight[2][7] = 20;
		
		weight[3][0] = 5;
		weight[3][1] = -1;
		weight[3][2] = 1;
		weight[3][3] = 0;
		weight[3][4] = 0;
		weight[3][5] = 1;
		weight[3][6] = -1;
		weight[3][7] = 5;
		
		weight[4][0] = 5;
		weight[4][1] = -1;
		weight[4][2] = 1;
		weight[4][3] = 0;
		weight[4][4] = 0;
		weight[4][5] = 1;
		weight[4][6] = -1;
		weight[4][7] = 5;
		
		weight[5][0] = 20;
		weight[5][1] = -1;
		weight[5][2] = 5;
		weight[5][3] = 1;
		weight[5][4] = 1;
		weight[5][5] = 5;
		weight[5][6] = -1;
		weight[5][7] = 20;
		
		weight[6][0] = -40;
		weight[6][1] = -180;
		weight[6][2] = -1;
		weight[6][3] = -1;
		weight[6][4] = -1;
		weight[6][5] = -1;
		weight[6][6] = -180;
		weight[6][7] = -40;
		
		weight[7][0] = 1000;
		weight[7][1] = -40;
		weight[7][2] = 20;
		weight[7][3] = 5;
		weight[7][4] = 5;
		weight[7][5] = 20;
		weight[7][6] = -40;
		weight[7][7] = 1000;

	}
}
