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
		return threatenHorizontale(queenB) || threatenVerticale(queenB);
	}

	private boolean threatenVerticale(Queen queenB) {
		return getX() == queenB.getX();
	}

	private boolean threatenHorizontale(Queen queenB) {
		return getY() == queenB.getY();
	}
		
}
