package com.tom.rpg.engine;

import com.tom.rpg.commons.MenuLogger;

public abstract class Menu {
    // handles all menu controls. Keep this basic as we will move the non-engine specific code to other libraries.
	public boolean isVisible = true;
	public boolean isEnabled = true;
	
	final UserInput myInput = new UserInput();
	
	public void displayText(final String text) {
		MenuLogger.logTextToDisplay(text);	
	}
	
	public String getUserStringInput() {
		return myInput.getStringFromScanner();
	}
	
	public int getUserIntInput() {
		return myInput.getIntFromScanner();
	}
	
	public void initilizeMenu() {} 
}
