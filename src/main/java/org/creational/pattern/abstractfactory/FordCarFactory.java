package org.creational.pattern.abstractfactory;

public class FordCarFactory  implements CarFactory{

	public Car produceCar() {
		return new FordFigo();
	}


}
