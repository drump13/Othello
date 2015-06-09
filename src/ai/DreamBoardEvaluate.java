package ai;

import game.Stone;

public class DreamBoardEvaluate {
	//それらの重みパラメータ
	private final static int absWeight = 50;
	private final static int oslWeight = 20;
	private final static int bwdWeight = 10;
	private final static int nopWeight = 5;
	private final static int nosWeight = 0;
	
	
	
	private Stone[][] board;
	private Stone AIturn;
	private int numbeOfTurn;
	public DreamBoardEvaluate(Stone AIturn,Stone[][] board,int numberOfTurn) {
		this.board = board;
		this.AIturn = AIturn;
		this.numbeOfTurn = numberOfTurn;//いずれターン数で場合分け
	}
	
	public int getDreamBoardEvaluate(){
		AbusoluteStones absObject = new AbusoluteStones(board, AIturn);
		OpenStoneLogic oslObject = new OpenStoneLogic(board, AIturn);
		BoardWeightData bwdObject = new BoardWeightData(AIturn, board);
		NumberOfPuttable nopObject = new NumberOfPuttable(AIturn, board);
//		NumberOfStone nosObject = new NumberOfStone(AIturn, board);
		int abs = absObject.getAIturnAbusoluteStonesEvaluate();
		int osl = oslObject.getOpenStoneEvaluate();
		int bwd = bwdObject.getWeightBoardEvaluate();
		int nop = nopObject.getPuttableEvaluate();
//		int nos = nosObject.getNumberOfStoneEvaluate();
		
		return abs*absWeight + osl*oslWeight + bwd*bwdWeight+ nop*nopWeight ;//+ nos*nosWeight;
	}
}
