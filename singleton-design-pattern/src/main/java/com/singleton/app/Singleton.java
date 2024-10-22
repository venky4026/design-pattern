package com.singleton.app;

//Best approach in Singleton pattern
public class Singleton {

	private Singleton() {
	}
	private static class SingletonHelper  {
		private static final Singleton instance = new Singleton();
	}
	public static Singleton getInstance() {
		return SingletonHelper .instance;
	}}
