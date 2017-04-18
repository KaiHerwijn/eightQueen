package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public MainController() {
		
	}
	
	public Queen askForCoordinate(Queen queenA, int rank) {
		System.out.println("Please enter the position of the queen " + (rank+1) +".");
        try {
			String positionA = br.readLine();
			int Ax = Integer.valueOf(positionA.split(",")[0]);
			int Ay = Integer.valueOf(positionA.split(",")[1]);
			
			queenA = new Queen(Ax, Ay);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queenA;
	}
	
}
