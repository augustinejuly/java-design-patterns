package org.creational.pattern.singleton;

import static org.junit.Assert.*;

import org.creational.pattern.singleton.EarlySingleton;
import org.creational.pattern.singleton.LazySingleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void testEarlySingleton() throws Exception {
		EarlySingleton e1 = EarlySingleton.getInstance();
		EarlySingleton e2 = EarlySingleton.getInstance();
		Assert.assertTrue(e1==e2);
	}
	
	@Test
	public void testLazySingleton() throws Exception {
		LazySingleton l1 = LazySingleton.getInstance();
		LazySingleton l2 = LazySingleton.getInstance();
		Assert.assertTrue(l1==l2);
	}

}
