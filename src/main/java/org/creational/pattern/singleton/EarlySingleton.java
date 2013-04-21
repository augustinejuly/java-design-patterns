package org.creational.pattern.singleton;

public class EarlySingleton {
	
	private static final EarlySingleton earlySingleton = new EarlySingleton();
	
	private EarlySingleton(){		
	}

	public static EarlySingleton getInstance(){
		return earlySingleton;
	}
}
