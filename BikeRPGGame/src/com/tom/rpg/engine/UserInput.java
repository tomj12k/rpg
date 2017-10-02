package com.tom.rpg.engine;

import java.util.Scanner;

public class UserInput {
	
	final Scanner userInputScanner = new Scanner(System.in);

	/**
	 * Grabs the next integer line input from the console.
	 * @return
	 */
	public int getIntFromScanner() {
		return userInputScanner.nextInt();
	}
	
	/**
	 * Grabs the next line from the scanner input from Console (System.in).
	 * @return
	 */
	public String getStringFromScanner() {
		return userInputScanner.nextLine();
	}
}
