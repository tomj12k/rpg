package com.tom.rpg.commons;

public abstract class Logger {

	/**
	 * Logs input to the std output. (System.out.println).
	 * @param string - Input to be logged.
	 */
	protected static void log(final String string) {
		System.out.flush();
		System.out.print(string);
	}
	
	public static void logWarning(final String warningString) {
		log(warningString);
	}
	
	public static void logInfo(final String infoString) {
		log(infoString);
	}
	
	public static void logError(final String errorString) {
		log(errorString);
	}
}
