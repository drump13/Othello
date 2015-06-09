package ai;

import java.util.ArrayList;

import game.Board;
import game.Stone;

public class JosekiAI {
	Board b;
	Stone AIturn;
	private int josekiBrokenFlag = 0;
	public JosekiAI(Board b,Stone turn){
		this.b = b;
		this.AIturn = turn;
	}
	
	public int AIResult(){
		int result = -1;
		if(josekiBrokenFlag == 0){
			result = fitJoseki();
		}
		
		if(result == -1){
			josekiBrokenFlag = 1;
			System.out.println("Joseki is Broken !!!!!!!");
			BoardWeight ram = new BoardWeight(b, AIturn);
			result = ram.AIResult();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		return result;
			
				
	}
	
	//今までの棋譜と定石が一致していたら、次の定石手を返す
	private int fitJoseki(){
		ArrayList<Integer> kifu = new ArrayList<Integer>();
		ArrayList<Integer> symKifu = new ArrayList<Integer>();
		ArrayList<Integer> superSymKifu = new ArrayList<Integer>();
		ArrayList<Integer> hyperSymKifu = new ArrayList<Integer>();
		ArrayList<Integer> joseki = new ArrayList<Integer>();
		kifu = b.returnKifu();
		symKifu = symmetricList();
		superSymKifu = superSymmetricList();
		hyperSymKifu = hyperSymmetricList();
		for(Joseki j: Joseki.values()){
			joseki = j.returnJoseki();
			for(int k = 0;k < kifu.size(); k++){
				if(kifu.size() >= joseki.size()){
					break;
				}
				if(kifu.get(k) != joseki.get(k)){
					break;
				}else{
					if(k == kifu.size()-1 && joseki.size() > kifu.size()){
						return joseki.get(kifu.size());
					}
				}
			}
			
			for(int k = 0;k < symKifu.size(); k++){
				if(symKifu.size() >= joseki.size()){
					break;
				}
				if(symKifu.get(k) != joseki.get(k)){
					break;
				}else{
					if(k == kifu.size()-1 && joseki.size() > kifu.size()){
						return 77 - joseki.get(kifu.size());
					}
				}
			}
			
			for(int k = 0;k < symKifu.size(); k++){
				if(superSymKifu.size() >= joseki.size()){
					break;
				}
				if(superSymKifu.get(k) != joseki.get(k)){
					break;
				}else{
					if(k == kifu.size()-1 && joseki.size() > kifu.size()){
						int f = joseki.get(kifu.size());
						return f%10*10+f/10;
					}
				}
			}
			
			for(int k = 0;k < hyperSymKifu.size(); k++){
				//System.out.println(hyperSymKifu);
				if(hyperSymKifu.size() >= joseki.size()){
					break;
				}
				if(hyperSymKifu.get(k) != joseki.get(k)){
					break;
				}else{
					if(k == kifu.size()-1 && joseki.size() > kifu.size()){
						int f = joseki.get(kifu.size());
						return 77 - (f%10*10+f/10);
					}
				}
			}
		
			
			
		}
		
		return -1;
	}
	
	private ArrayList<Integer> symmetricList(){
		ArrayList<Integer> sym = new ArrayList<Integer>();
		for(int k = 0;k < b.returnKifu().size();k++){
			sym.add(77- b.returnKifu().get(k));
		}
		return sym;
	}
	
	
	private ArrayList<Integer> superSymmetricList(){
		ArrayList<Integer> sym = new ArrayList<Integer>();
		int x = 0,y = 0;
		for(int k = 0;k < b.returnKifu().size();k++){
			x = b.returnKifu().get(k)/10;
			y = b.returnKifu().get(k)%10;
			sym.add(y*10+x);
		}
		
		return sym;
	}
	private ArrayList<Integer> hyperSymmetricList(){
		ArrayList<Integer> sym = new ArrayList<Integer>();
		int x = 0,y = 0;
		for(int k = 0;k < b.returnKifu().size();k++){
			x = b.returnKifu().get(k)/10;
			y = b.returnKifu().get(k)%10;
			sym.add(77 - (y*10+x));
		}
		
		return sym;
	}
	
}
