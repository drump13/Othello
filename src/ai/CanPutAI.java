package ai;

import java.util.ArrayList;
import java.util.Stack;

import game.Board;
import game.Stone;

public class CanPutAI {
	Board b;
	Stone AIturn;
	public CanPutAI(Board b,Stone AIturn){
		this.b = b;
		this.AIturn = AIturn;
	}
	
	public int AIResult(){
		AIMethods aim = new AIMethods(b, AIturn);
		aim.initBoardArray();
		Stack<AIMethods> stack = new Stack<AIMethods>();
		ArrayList<Integer> canPutList = new ArrayList<Integer>();
		canPutList = aim.makeList();
		int result = 0,min = 1000;
		for(int k = 0;k < canPutList.size();k++){
			aim.initBoardArray();
			aim.testAIPut(canPutList.get(k));
			if(min > aim.makeList().size()){
				min = aim.makeList().size();
				result = canPutList.get(k);
			}
			
		}
		return result;
		
	}
	
	
	
	
}
