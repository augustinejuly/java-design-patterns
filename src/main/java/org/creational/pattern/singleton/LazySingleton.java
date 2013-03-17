package org.creational.pattern.singleton;

public class LazySingleton {
	
	private static LazySingleton lazySingleton;
	
	private LazySingleton() {		
	}
	
	public static LazySingleton getInstance() {
		synchronized (LazySingleton.class) {
			if(lazySingleton == null){
				lazySingleton = new LazySingleton();
			}
		}
		return lazySingleton;
	}

}
