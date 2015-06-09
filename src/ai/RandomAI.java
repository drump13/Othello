package ai;

import java.util.ArrayList;
import java.util.Random;

import game.Board;
import game.Stone;

public class RandomAI {
	Board b;
	Stone AIturn;
	
	public RandomAI(Board b,Stone turn){
		this.b = b; 
		this.AIturn = turn;
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
	
	public int AIResult() throws InterruptedException{
		Random rnd = new Random();
		ArrayList<Integer> buf = makeList();
		int ran = rnd.nextInt(buf.size());
		for(int count = 0;count < buf.size();count++){
			System.out.println(count + "  : " + buf.get(count));
		}
		Thread.sleep(1000);
		System.out.println("AIが選んだのは"+ran+" : "+buf.get(ran));
		return makeList().get(ran);
	}
	
	
}
