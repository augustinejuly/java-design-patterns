package org.creational.pattern.abstractfactory;

import static org.junit.Assert.assertTrue;

import org.creation.pattern.abstractfactory.AbstractCarFactory;
import org.creation.pattern.abstractfactory.Car;
import org.creation.pattern.abstractfactory.CarFactory;
import org.creation.pattern.abstractfactory.CarType;
import org.creation.pattern.abstractfactory.ChevroletBeat;
import org.creation.pattern.abstractfactory.FordFigo;
import org.junit.Test;

public class AbstractFactoryTest {

	@Test
	public void testAbstractFactory() throws Exception {
		
		CarFactory fordCarFactory = AbstractCarFactory.createCar(CarType.FORD);
		CarFactory chevroletCcarFactory = AbstractCarFactory.createCar(CarType.CHEVROLET);
		
		Car fordCar = fordCarFactory.produceCar();
		Car chevroletCar = chevroletCcarFactory.produceCar();
		
		assertTrue(fordCar instanceof FordFigo);
		assertTrue(chevroletCar instanceof ChevroletBeat);
		
	}

}
