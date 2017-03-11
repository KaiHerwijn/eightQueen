package main;

public class Queen {
	private int x;
	private int y;
	
	public Queen(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean threatens(Queen queenB) {
		
		return getY() == queenB.getY() || getX() == queenB.getX();
	}
		
}
