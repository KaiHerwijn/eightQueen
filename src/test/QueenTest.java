package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import main.Queen;

import org.junit.Test;

public class QueenTest {

	@Test
	public void testQueen_no_threating() {
	
		main.Queen queenA = new Queen(3, 7);
		main.Queen queenB = new Queen(5, 8);
		
		boolean threat = queenA.threatens(queenB);
		
		assertEquals("Queen threatens though", false, threat);
	}
	
	
	@Test
	public void test_threating_horizontale() {
		main.Queen queenA = new Queen(3, 7);
		main.Queen queenB = new Queen(8, 7);
		
		boolean threat = queenA.threatens(queenB);
		
		assertEquals("Queens are not threatened.", true, threat);
	}

}
