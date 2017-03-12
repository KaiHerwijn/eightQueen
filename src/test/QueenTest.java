package test;

import static org.junit.Assert.assertEquals;

import main.Queen;

import org.junit.Test;

public class QueenTest {

	@Test
	public void testQueen_no_threating() {
	
		main.Queen queenA = new Queen(3, 7);
		main.Queen queenB = new Queen(5, 8);
		
		boolean threat = queenA.threatens(queenB);
		
		assertEquals("Queen threatens though.", false, threat);
	}
	
	@Test
	public void test_threating_horizontale() {
		main.Queen queenA = new Queen(3, 7);
		main.Queen queenB = new Queen(8, 7);
		
		boolean threat = queenA.threatens(queenB);
		
		assertEquals("Queens are not threatened horizontale.", true, threat);
	}
	
	@Test
	public void test_threating_verticale() {
		main.Queen queenA = new Queen(3, 7);
		main.Queen queenB = new Queen(3, 5);
		
		boolean threat = queenA.threatens(queenB);
		
		assertEquals("Queens are not threatened verticale.", true, threat);
	}
	
	@Test
	public void test_threating_bottomleft_topright() {
		main.Queen queenA = new Queen(3, 6);
		main.Queen queenB = new Queen(5, 4);
		
		boolean threat = queenA.threatens(queenB);
		
		assertEquals("Queens are not threatened from bottomleft to topright.", true, threat);
	}
	
	
	@Test
	public void test_threating_bottomright_topleft() {
		main.Queen queenA = new Queen(2, 4);
		main.Queen queenB = new Queen(4, 6);
		
		boolean threat = queenA.threatens(queenB);
		
		assertEquals("Queens are not threatened from bottomright to topleft.", true, threat);
	}

}
