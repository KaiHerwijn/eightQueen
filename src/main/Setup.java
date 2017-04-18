package main;

import java.io.*;

public class Setup {
	
	
	private static MainController mainController = new MainController();

	public static void main(String[] arg) {
		
		Queen queenA = null;
		Queen queenB = null;
				
		System.out.println("Welcome to eightQueen.");
		queenA = mainController.askForCoordinate(queenA, 0);
        
        queenB = mainController.askForCoordinate(queenB, 1);
        
        if (queenA != null && queenB != null) {
			if (queenA.threatens(queenB)) {
				System.out.println("Your queens are threatening each other.");				
			} else {
				System.out.println("Your queens are not threatening each other.");
			}
		} else {
			System.out.println("Something went completely wrong by the positioning of your queens.");
		}
        
	}

	
}
