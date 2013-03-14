package org.pattern.abstractfactory;

public class ChevroletCarFactory  implements CarFactory{

	public Car produceCar() {
		return new ChevroletBeat();
	}

}
