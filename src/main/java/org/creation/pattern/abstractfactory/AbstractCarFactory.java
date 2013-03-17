package org.creation.pattern.abstractfactory;

public class AbstractCarFactory {

	public static CarFactory createCar(CarType carType){
		return carType.createCarFactory();
	}
}
