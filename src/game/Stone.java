package game;

public enum Stone {
	BLACK,WHITE,EMPTY;
	
	public Stone reverse(){
		
		if(this == BLACK){
			return WHITE;
			
		}else{
			return BLACK;
			
		}
	}
	
	
	public String toString(){
		if(this == BLACK){
			return "●";
		}else if(this == WHITE){
			return "○";
		}else{
			return " ";
		}
		
	}
	
	
}
