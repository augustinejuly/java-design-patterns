package org.creational.pattern.factory;

import static org.creational.pattern.factory.Animal.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.creational.pattern.factory.Animal;
import org.creational.pattern.factory.AnimalFactory;
import org.creational.pattern.factory.Cat;
import org.creational.pattern.factory.Dog;
import org.creational.pattern.factory.AnimalFactory.AnimalType;
import org.junit.Test;

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
