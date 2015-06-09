package game;

import graphic.DrawBoard;
import graphic.MouseClick;

import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ai.BoardWeight;
import ai.CanPutAI;
import ai.JosekiAI;
import ai.RandomAI;
import ai.Yomikiri;


public class MainGame {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws NumberFormatException,IOException, InterruptedException {
		// TODO Auto-generated method stub
		Board b = new Board();
		DrawBoard d = new DrawBoard(b);
		MouseClick m = new MouseClick();
		Thread draw = new Thread(d);
		//	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		
		Stone playerTurn = Stone.BLACK;
		Stone AITurn = playerTurn.reverse();
		Stone currentTurn = Stone.BLACK;
		
		
		b.initGame();
		draw.start();
		while(true){
			b.display();
			if(!b.canPut(currentTurn)){
				currentTurn = currentTurn.reverse();
				continue;
			}
			if(playerTurn == currentTurn){
				int x = -1;
				int y = -1;
				while(x == -1 || y == -1){
					x = MouseClick.x;
					y = MouseClick.y;
					Thread.sleep(10);
				}
//				int x = Integer.parseInt(buf.readLine());
//				int y = Integer.parseInt(buf.readLine());
				if(b.putCheck(8*x/600, 8*(y-20)/600, currentTurn)){
					b.put(8*x/600, 8*(y-20)/600, currentTurn);
					currentTurn = currentTurn.reverse();
				}
				MouseClick.x = -1;
				MouseClick.y = -1;
			}else{  
				//AIのターン
				//RandomAI ai = new RandomAI(b,AITurn);  //うてる場所の中からランダムに選ぶ
				int aiResult;
				/*if(b.currentTurnNumber() < 50){
					BoardWeight ai = new BoardWeight(b,AITurn); //ボードの評価関数の最大値
					aiResult = ai.AIResult();
				}else{
					Yomikiri ai = new Yomikiri(b, AITurn);//n手先の自分の石が最大
					aiResult = ai.AIResult();
				}*/
				//CanPutAI ai = new CanPutAI(b, AITurn);//相手の置ける場所
				Yomikiri ai = new Yomikiri(b, AITurn);//n手先の自分の石が最大
				aiResult = ai.AIResult();
				
				/*
				JosekiAI ai = new JosekiAI(b, AITurn);
				aiResult = ai.AIResult();
				*/
				System.out.println(aiResult);
				if(b.putCheck(aiResult/10, aiResult%10, AITurn)){
					b.put(aiResult/10, aiResult%10, AITurn);
					currentTurn = currentTurn.reverse();
				}else{
					try{
						System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
						Thread.sleep(30000);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			
			System.out.println(b.getNumber(Stone.BLACK) + " " + b.getNumber(Stone.WHITE) + " " + currentTurn);
			
			if(b.IsGameEnd()){
				d = new DrawBoard(b);
				break;
			}
		}
		resultDisplay(b);
	}
	
	public static void resultDisplay(Board b){
		System.out.println(b.getNumber(Stone.BLACK)+ " 対 "+b.getNumber(Stone.WHITE));
		if(b.getNumber(Stone.BLACK) > b.getNumber(Stone.WHITE)){
			System.out.println("Black WIN !!!!!!!");
		}else if(b.getNumber(Stone.BLACK) < b.getNumber(Stone.WHITE)){
			System.out.println("White WIN !!!!!!!");
		}else{
			System.out.println("Draw!!!!!!!!!!");
		}		
		
		System.out.println("END!!!!!!!");
	
		
		
	}
	
}
