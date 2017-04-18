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
		return threatenHorizontale(queenB) || threatenVerticale(queenB) || threatenbottomleft_topright(queenB) || threatenbottomright_topleft(queenB);
	}

	private boolean threatenbottomright_topleft(Queen queenB) {
		return getY() - getX() == queenB.getY() - queenB.getX();
	}

	private boolean threatenbottomleft_topright(Queen queenB) {
		return getY() + getX() == queenB.getY() + queenB.getX();
	}

	private boolean threatenVerticale(Queen queenB) {
		return getX() == queenB.getX();
	}

	private boolean threatenHorizontale(Queen queenB) {
		return getY() == queenB.getY();
	}

	public static boolean isvalidcoordinate(String coordinate) {
		return coordinate.matches("^-?\\d+,-?\\d+$");
	}
		
}
