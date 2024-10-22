package com.singleton.app;

public class StaticBlockSingleton {

	private StaticBlockSingleton() {
	}

	private static StaticBlockSingleton instance;
	static {
		try {
			
			instance = new StaticBlockSingleton();
			int a=0/5;
		} catch (Exception e) {
			
			throw new RuntimeException("Exception occurred in creating singleton instance");
			
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
