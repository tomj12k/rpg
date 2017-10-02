package com.tom.rpg.engine;

public class MainMenu extends Menu {

	/**
	 * Displays the main menu.
	 */
	protected int displayMainMenu() {
		displayText("Welcome to the Game!\n\n");
		
		displayText("Please Select from the following (1-3):\n");
		displayText("1. Start Game\n");
		displayText("2. Options\n");
		displayText("3. Exit Game\n");
		
		return getUserIntInput();
	}
	
	protected int displayOptionsMenu() {
		displayText("Options Menu (1-3):\n\n");
		displayText("1. Sound Options\n");
		displayText("2. Graphics Options\n");
		displayText("3. Game Options\n");
		
		return getUserIntInput();
	}
	
	protected void displayExitMenu() {
		displayText("Exiting Game... :( bai!");
		System.exit(-1);
	}
	
	protected void displayStartMenu() {		
		displayText("You gaze into the portal...\n\n");
		
		displayText("Starting Game!...\n");
		
		// load the game
		final StartGameMenu startGameMenu = new StartGameMenu();
		startGameMenu.initilizeMenu();
	}
	
	public void initilizeMenu() {
		switch (displayMainMenu()) {
			case 1: 
				displayStartMenu();
				break;
			case 2:
				displayOptionsMenu();
				break;
			case 3:
				displayExitMenu();
				break;
		}
	}
}
