package com.singleton.app;

public class DoubleCheckedLockingSingleton {
	private DoubleCheckedLockingSingleton() {
	}

	private static DoubleCheckedLockingSingleton instance;

	public static DoubleCheckedLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingSingleton();
				}}}
		return instance;
	}}
