package main;

import java.io.*;

public class Setup {
	public static void main(String[] arg) {
		Queen queenA = null;
		Queen queenB = null;
				
		System.out.println("Welcome to eightQueen.");
		System.out.println("Please enter the position of the first queen.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			String positionA = br.readLine();
			int Ax = Integer.valueOf(positionA.split(",")[0]);
			int Ay = Integer.valueOf(positionA.split(",")[1]);
			
			queenA = new Queen(Ax, Ay);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Please enter the position of the second queen.");
        try {
        	String positionB = br.readLine();
			int Ax = Integer.valueOf(positionB.split(",")[0]);
			int Ay = Integer.valueOf(positionB.split(",")[1]);
			
			queenB = new Queen(Ax, Ay);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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
