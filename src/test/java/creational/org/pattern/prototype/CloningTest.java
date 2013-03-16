package org.pattern.prototype;

import static org.junit.Assert.*;

import org.junit.Test;
import org.pattern.prototype.DeepCloner.Helper;

public class CloningTest {

	@Test
	public void testSimpleCloning() throws Exception {
		SimpleCloning original = new SimpleCloning("simple");
		SimpleCloning clone = original.createCopy();
		assertFalse(original == clone);
		assertEquals(clone.getName(),original.getName());
	}

	@Test
	public void testJavaCloneable() throws Exception {
		JavaCloneable original = new JavaCloneable("Java Cloneable");
		JavaCloneable clone = original.createCopy();
		assertFalse(original == clone);
		assertEquals(clone.getName(),original.getName());
	}

	@Test
	public void testDeepCloning() throws Exception {
		Helper helper = new DeepCloner.Helper("Help DeepCloner");
		DeepCloner original = new DeepCloner("DeepCloning", helper);

		DeepCloner deepClone = original.createDeepCopy();
		assertFalse(original == deepClone);
		assertFalse(helper == deepClone.getHelper());
		assertTrue(original.getName().equals(deepClone.getName()));
		assertTrue(helper.getWhatToHelp().equals(deepClone.getHelper().getWhatToHelp()));
	}

}
