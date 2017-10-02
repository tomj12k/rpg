package com.tom.rpg.engine;

public class StartGameMenu extends Menu {
	
	protected String playerName = null;
	
	protected int displayStartMainMenu() {
		displayText("Welcome weary traveller\n\n");
		
		displayText("Please Select from the following (1-3):\n");
		displayText("1. Choose Name\n");
		displayText("2. Choose Appearance\n");
		displayText("3. Continue\n");
		
		return getUserIntInput();
	}
	
	protected String displayNameMenu() {
		displayText("Please enter your name:\n\n");
		
		return getUserStringInput();
	}
	
	//TODO: add appearances
	protected int displayAppearanceMenu() {
		displayText("Default Appearance chosen. (to be implemented)\n\n");
		
		return 1;
	}
	
	/**
	 * Checks the player name to make sure it will contain something.
	 * @param playerName
	 * @return
	 */
	protected String checkPlayerName(final String playerName) {
		if (playerName != null) {
			 if (!playerName.equals("")) {
				 return playerName;
			 }
		}
		
		// default name.
		return "Tom";
	}
	
	protected void displayContinueMenu(final String playerName) {
		
		displayText("Beginning your adventure, " + checkPlayerName(playerName) + "!");
		
		// load game world
	}
	
	public void initilizeMenu() {
		playerName = displayNameMenu();
		displayAppearanceMenu();
		displayContinueMenu(playerName);
	}
	
	public String getPlayerName() {
		return playerName;
	}
}
