package org.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void testEarlySingleton() throws Exception {
		EarlySingleton e1 = EarlySingleton.getInstance();
		EarlySingleton e2 = EarlySingleton.getInstance();
		Assert.assertEquals(e1, e2);
	}
	
	@Test
	public void testLazySingleton() throws Exception {
		LazySingleton l1 = LazySingleton.getInstance();
		LazySingleton l2 = LazySingleton.getInstance();
		Assert.assertEquals(l1, l2);		
	}

}
