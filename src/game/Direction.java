package game;

public enum Direction {
	RIGHT(1,0),RIGHTDOWN(1,1),DOWN(0,1),LEFTDOWN(-1,1),LEFT(-1,0),LEFTUP(-1,-1),UP(0,-1),RIGHTUP(1,-1);
	private int dx;
	private int dy;
	
	Direction(int x,int y){
		this.dx = x;
		this.dy = y;
	}
	
	public int dx(){
		return dx;
	}
	
	public int dy(){
		return dy;
		
	}

}
