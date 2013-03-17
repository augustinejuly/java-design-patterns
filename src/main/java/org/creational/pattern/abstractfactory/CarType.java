package org.creational.pattern.abstractfactory;

public enum CarType {
	
	FORD {
		@Override
		public CarFactory createCarFactory() {
			return new FordCarFactory();
		}
	},
	CHEVROLET {
		@Override
		public CarFactory createCarFactory() {		
			return new ChevroletCarFactory();
		}
	};
	
	public abstract CarFactory createCarFactory();

}
