package org.pattern.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.pattern.factory.Animal.*;


import org.junit.Test;
import org.pattern.factory.AnimalFactory.AnimalType;

public class FactoryTest {
	
	@Test
	public void testFactory() throws Exception {
		Animal dog = AnimalFactory.getAnimal(AnimalType.DOG);
		Animal cat = AnimalFactory.getAnimal(AnimalType.CAT);
		
		assertTrue(dog instanceof Dog);
		assertTrue(cat instanceof  Cat);
		assertEquals(MEAT_WITH_BONE, dog.getFavoriteFood());
		assertEquals(MILK, cat.getFavoriteFood());
	}

}
