package org.pattern.abstractfactory;

import static org.junit.Assert.assertTrue;
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
