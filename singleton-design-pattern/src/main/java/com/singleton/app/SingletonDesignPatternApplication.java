package com.singleton.app;

public class SingletonDesignPatternApplication {

	public static void main(String[] args) {

		// EagerSingleton
		EagerSingleton obj1 = EagerSingleton.getInstance();
		System.out.println("EagerSingleton1 : " + obj1.hashCode());
		EagerSingleton obj2 = EagerSingleton.getInstance();
		System.out.println("EagerSingleton2 : " + obj2.hashCode());

		System.out.println("");

		// LazySingleton
		LazySingleton l1 = LazySingleton.getInstance();
		System.out.println("LazySingleton1 : " + l1.hashCode());
		LazySingleton l2 = LazySingleton.getInstance();
		System.out.println("LazySingleton2 : " + l2.hashCode());

		System.out.println("");

		// StaticBlockSingleton
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		System.out.println("StaticBlockSingleton1 : " + s1.hashCode());
		StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
		System.out.println("StaticBlockSingleton2 : " + s2.hashCode());

		System.out.println("");

		// DoubleCheckedLockingSingleton
		DoubleCheckedLockingSingleton d1 = DoubleCheckedLockingSingleton.getInstance();
		System.out.println("DoubleCheckedLockingSingleton1 : " + d1.hashCode());
		DoubleCheckedLockingSingleton d2 = DoubleCheckedLockingSingleton.getInstance();
		System.out.println("DoubleCheckedLockingSingleton2 : " + d2.hashCode());
		System.out.println("");

		// DoubleCheckedLockingSingleton
		Singleton singleton = Singleton.getInstance();
		System.out.println("Singletons1 : " + singleton.hashCode());
		Singleton singleton1 = Singleton.getInstance();
		System.out.println("Singletons2 : " + singleton1.hashCode());

	}

}
