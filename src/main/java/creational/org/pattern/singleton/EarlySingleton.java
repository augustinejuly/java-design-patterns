package org.pattern.singleton;

public class EarlySingleton {
	
	private static EarlySingleton earlySingleton = new EarlySingleton();
	
	private EarlySingleton(){		
	}

	public static EarlySingleton getInstance(){
		return earlySingleton;
	}
}
