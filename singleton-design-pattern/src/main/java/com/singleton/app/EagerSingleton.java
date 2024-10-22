package com.singleton.app;

public class EagerSingleton {
	private EagerSingleton() {
	}

	private static final EagerSingleton instace = new EagerSingleton();

	public static EagerSingleton getInstance() {
		return instace;
	}
}
