package ai;

import java.util.ArrayList;

import javax.lang.model.element.NestingKind;
import javax.swing.text.DefaultEditorKit.CutAction;

import game.Board;
import game.Direction;
import game.Stone;

class AIMethods implements Cloneable{
	Board b;
	Stone AIturn;
	Stone originalAITurn;
	AIMethods(Board b,Stone turn){
		this.b = b;
		this.AIturn = turn;
		this.originalAITurn = turn;
		currentScore = -1;
		ChildrenList = new ArrayList<AIMethods>();
		parentAI = null;
		terminalAIFlag = false;
		cutFlag = false;
		passFlag = false;
		alpha = -1000;//max節点の下界
		beta = 1000;//min節点の上界
	}

	private Stone aiBoardArray[][] = new Stone[8][8];
	private int depthCounter = 0;
	private ArrayList<AIMethods> ChildrenList;
	private AIMethods parentAI;
	private boolean terminalAIFlag;
	private boolean startAIFlag;
	private int currentScore;
	private boolean cutFlag;
	private boolean passFlag;
	private int alpha;
	private int beta;
	
	
	public AIMethods(AIMethods obj) {
		b = obj.b;
		AIturn = obj.AIturn;
		originalAITurn = obj.originalAITurn;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				this.aiBoardArray[i][j] = obj.aiBoardArray[i][j];
			}
		}
		depthCounter = obj.depthCounter;
		ChildrenList = new ArrayList<AIMethods>(obj.ChildrenList);
		parentAI = obj.parentAI;
		terminalAIFlag = false;
		currentScore = -1;
		cutFlag = obj.cutFlag;
		passFlag = obj.passFlag;
		alpha = -1000;
		beta = 1000;
	}	
	
	
	
	//親に自分のスコアを送る
	public void sendParentScore(int fromChild){
		if(currentScore == -1){
			currentScore = fromChild;
		}else if(originalAITurn == AIturn && currentScore > fromChild){
			currentScore = fromChild;
		}else if(originalAITurn != AIturn && currentScore < fromChild){
			currentScore = fromChild;
		}else if(startAIFlag){
		}else{
			return;
		}
		
	}
	
	public void beginSendCurrentScore(){
		AIMethods ai = this;
		ai.getParent().sendAlphaBeta(getCurrentScore());
		ai.getParent().setChildrenNull(getParent().getChildrenList().indexOf(ai));
		while(true){
			if(ai.getTerminalFlag()){
				break;
			}
			ai.getParent().sendParentScore(ai.getCurrentScore());
			ai = ai.getParent();
		}

	}


	//一度の呼び出しでOK	
	public void sendAlphaBeta(int fromChild){
		if(fromChild > alpha){
			alpha = fromChild;
		}
	
		if(fromChild < beta){
			beta = fromChild;
		}
	
	}
	
	//チルドレンリストの要素の一つをnullに
	public void setChildrenNull(int index){
		ChildrenList.set(index, null);
	}

	public int getAlpha(){
		return alpha;
	}
	
	public int getBeta(){
		return beta;
	}


	
	public boolean getTerminalFlag(){
		return terminalAIFlag;
	}

	public boolean getCutFlag(){
		return cutFlag;
	}
	
	//カットフラグをオンにする
	public void onCutFlag(){
		cutFlag = true;
	}
	
	public void onStartFlag(){
		startAIFlag = true;
	}
	
	//パスフラグを返す
	public boolean getPassFlag(){
		return passFlag;
	}
	
	//パスフラグをオンにする
	public void onPassFlag(){
		passFlag = true;
	}
	
	//親がいないAIはこのフラグをonにする
	public void onTerminalAIFlag(){
		terminalAIFlag = true;
	}
	
	//深さカウンターを取る
	public int getDepthCounter(){
		return depthCounter;
	}
	
	//2回パスが続いたときとかに、探索を終了するために深さカウンタを調整する
	public void setDepthCounter(int depth){
		depthCounter = depth;
	}
	
	public void setCurrentScore(){
		DreamBoardEvaluate dbe = new DreamBoardEvaluate(originalAITurn, aiBoardArray, b.returnNumberOfTurn());
		currentScore = dbe.getDreamBoardEvaluate();
	}
	
	public int getCurrentScore(){
		return currentScore;
	}
	
	public ArrayList<AIMethods> getChildrenList(){
		return ChildrenList;
	}
	
	public AIMethods getParent() {
		return parentAI;
	}
	
	public void setParent(AIMethods ai){
		parentAI = ai;
	}
	
	public void addChildrenList(AIMethods ai){
		ChildrenList.add(ai);
	}
	
	//alphaCutとbetaCutの両方を呼び出す
	public void ultraCut(){
		AIMethods ai = this;
		while(!ai.getTerminalFlag()){
			ai = ai.getParent();
			System.out.println(ai.getAlpha()+" "+ai.getBeta());
			if(ai.getCurrentTurn() != originalAITurn){
				ai.alphaCut();
			}else{
				ai.betaCut();
			}
		}
	}
	
	
	//MIN節点においてαカット
	private void alphaCut(){
		System.out.println(beta + "   "+ getAncestorAlpha());
		if(beta <= getAncestorAlpha()){
			if(AIturn == originalAITurn){
				currentScore = beta;
				for(int l = 0; l< ChildrenList.size();l++){
					ChildrenList.get(l).onCutFlag();
				}
				System.out.println("on cut flag!!!!!!!!!!!!!!!!");
			}
		}
	}
	private int  getAncestorAlpha(){
		int alphaAncester= -1000;
		AIMethods ai = this;
		while(!ai.getTerminalFlag()){
			ai = ai.getParent();
			if(AIturn == originalAITurn && alphaAncester < ai.getAlpha()){
				alphaAncester = ai.getAlpha();
			}
		}
		return alphaAncester;
	}
	
	//MAX節点においてβカット
	private void betaCut(){
		System.out.println(getAncestorBeta());
		if(alpha >= getAncestorBeta()){
			if(AIturn != originalAITurn){
				this.currentScore = alpha;  
			}
			for(int l = 0; l< this.ChildrenList.size();l++){
				this.ChildrenList.get(l).onCutFlag();
			}
			System.out.println("on cut flag!!!!!!!!!!!!!!!!");
			
		}
	}
	
	private int  getAncestorBeta(){
		int betaAncester= 1000;
		AIMethods ai = this;
		while(!ai.getTerminalFlag()){
			ai = ai.getParent();
			if(AIturn == originalAITurn && betaAncester > ai.getBeta()){
				betaAncester = ai.getBeta();
			}
		}
		return betaAncester;
		
	}

	
	
	public void initBoardArray(){
		for(int x = 0;x < 8;x++){
			for(int y = 0;y<8;y++){
				aiBoardArray[y][x] = b.returnBoard(x, y);
			}
		}
		AIturn = originalAITurn;
		depthCounter = 0;
	}

	public ArrayList<Integer> makeList(){
		ArrayList<Integer> canPutList = new ArrayList<Integer>();
		for(int x = 0;x < 8;x++){
			for(int y = 0;y < 8;y++){
				if(putCheck(x, y, AIturn)){
					canPutList.add(10*x + y);
				}
			}
		}
		return canPutList;
	}
	
	public void testAIPut(int xy){
		testPut(xy/10,xy%10);
		aiReverse();
		passFlag = false;
		depthCounter++;
	}
	
	public int returnDepthCounter(){
		return depthCounter;
	}
	
	public void aiReverse(){
		if(AIturn == Stone.BLACK){
			AIturn = Stone.WHITE;
		}else{
			AIturn = Stone.BLACK;
		}
	}
	
	
	private void testPut(int x,int y){
		aiBoardArray[y][x] = AIturn;
		testDoReverse(x,y,AIturn);
	}
	
	//石が置かれる時、ひっくり返す
		private void testDoReverse(int x,int y,Stone turn){
			for(Direction d : Direction.values()){
				if(checkReverseLine(x, y, turn, d)){
					int x0 = x + d.dx();
					int y0 = y + d.dy();
					while(aiBoardArray[y0][x0] != turn){
						aiBoardArray[y0][x0] = turn;
						x0 += d.dx();
						y0 += d.dy();
					}
					
				}
			}
		}
		
		private boolean checkReverseLine(int x,int y,Stone turn,Direction d){
			int x0 = x + d.dx();
			int y0 = y + d.dy(); 
			
			if(!isValidIndex(x0,y0)){
				return false;
			}
			if(aiBoardArray[y0][x0] == turn){
				return false;
			}
			
			while(isValidIndex(x0, y0) && aiBoardArray[y0][x0] != Stone.EMPTY){
				
				x0 += d.dx();
				y0 += d.dy();
				
				if(isValidIndex(x0, y0) && aiBoardArray[y0][x0] == turn){
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
		
		public int getNumber(Stone stone){
			int count = 0;
			for(int x = 0;x < 8;x++){
				for(int y = 0;y < 8;y++){
					if(aiBoardArray[y][x] == stone){
						count++;
					}
				}
			}
			return count;
		}
		
		public Stone returnAIBoard(int x,int y){
			return aiBoardArray[y][x];
			
		}
		
		private boolean putCheck(int x,int y,Stone turn){
			if(!nonExistCheck(x,y,turn)){
				return false;
			}else{
				return reverseCheck(x,y,turn);
			}
		}
		
		private boolean nonExistCheck(int x,int y,Stone turn){
			if(isValidIndex(x, y) && aiBoardArray[y][x] == Stone.EMPTY){
				return true;
			}else{
				return false;
			}
		}
		
		private boolean reverseCheck(int x, int y,Stone turn){
			for(Direction d:Direction.values()){
				if(checkReverseLine(x, y, turn, d)){
					return true;
				}
			}
			
			return false;
		}
	
		public Stone getCurrentTurn(){
			return AIturn;
		}
		
		//debug用にコンソールへ表示する
		public void display(){
			for(int count = 0;count < 8;count++){
				for(int count2 = 0;count2 < 8; count2++){
					System.out.print(aiBoardArray[count][count2] + " ");
				}
				System.out.println("");
			}
			
		}
		
}
