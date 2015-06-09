package ai;

import game.Stone;

public class AIDebug {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Stone test[][] = new Stone[8][8];
		
		for(int y = 0;y < 8;y++){
			for(int x= 0;x < 8;x++){
				test[y][x] = Stone.EMPTY;
				if((y+x) < 5){
					test[y][x] = Stone.BLACK;
				}else if((y+x) > 10){
					test[y][x] = Stone.WHITE;
				}
				System.out.print(test[y][x] + " ");
			}
			System.out.println("");
		}
		test[0][1]  = Stone.WHITE;
		NumberOfStone nos = new  NumberOfStone(Stone.BLACK,test);
	
		System.out.println(nos.getNumberOfStoneEvaluate());
	}


}
