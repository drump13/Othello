package ai;

import java.util.ArrayList;
import java.util.Stack;

import javax.jws.Oneway;

import game.Board;
import game.Stone;

public class Yomikiri {
	Board b;
	Stone AIturn;
	private static int aiLevel = 5;
	public Yomikiri(Board b,Stone AIturn){
		this.b = b;
		this.AIturn = AIturn;
	}

	public int AIResult(){
		AIMethods aim = new AIMethods(b,AIturn);
		AIMethods buffer = new AIMethods(b, AIturn);
		Stack<AIMethods> aiBoardObject = new Stack<AIMethods>();
		ArrayList<AIMethods> nextAICandidate = new ArrayList<AIMethods>();
		ArrayList<Integer> nextCandidate = new ArrayList<Integer>();
		ArrayList<Integer> canPutList = new ArrayList<Integer>();
		aim.initBoardArray();
		nextCandidate = aim.makeList();

		int max = -99999999,result = -1;

		for(int k = 0;k < nextCandidate.size();k++){
			System.out.println(k);
			aim.initBoardArray();
			aim.testAIPut(nextCandidate.get(k));
			buffer = new AIMethods(aim);
			buffer.onTerminalAIFlag();
			aiBoardObject.push(buffer);
			nextAICandidate.add(buffer);

			while(!aiBoardObject.empty()){
				AIMethods childAI = aiBoardObject.pop();
				if(childAI.getCutFlag()){
					System.out.println("Cut !!!!!!!!!!!!!!!!!!!!!!!!!!!");
					continue; //カット
				}
				
				AIMethods parentAI = childAI;
				canPutList = childAI.makeList();
//				System.out.print(childAI.getCurrentTurn() + " "+ aiBoardObject.size());
//				System.out.println(canPutList);
				if(childAI.returnDepthCounter() < aiLevel && b.returnNumberOfTurn() + childAI.returnDepthCounter() < 60){
					for(int i = 0; i< canPutList.size();i++){
						buffer = new AIMethods(childAI);
						buffer.testAIPut(canPutList.get(i));
						parentAI.addChildrenList(buffer);
						buffer.setParent(parentAI);
						aiBoardObject.push(buffer);
					//	System.out.println(buffer.returnDepthCounter());
					//	buffer.display();
					}
					if(canPutList.size() == 0){
						childAI.aiReverse();
						if(childAI.getPassFlag()){
							childAI.setDepthCounter(aiLevel);	
						}else{

							childAI.onPassFlag();
						}
						aiBoardObject.push(childAI);
					}
				}else{
					childAI.setCurrentScore();//ここで末端オブジェクトの評価値を生成
					childAI.onStartFlag();
					if(b.returnNumberOfTurn() != 59){
						childAI.beginSendCurrentScore();//祖先(nextCandidate)へ評価関数を送る
					}
				//	childAI.ultraCut();//αカットとβカット
				}
			}
		}
		for(int l = 0;l< nextAICandidate.size();l++){
//			System.out.print(nextAICandidate.get(l).getCurrentScore()+" ");
			if(max < nextAICandidate.get(l).getCurrentScore()){
				max = nextAICandidate.get(l).getCurrentScore();
				result = nextCandidate.get(l);
			}
		}
		return result;

	}


}
