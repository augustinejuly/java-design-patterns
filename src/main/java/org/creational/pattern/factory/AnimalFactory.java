package org.creational.pattern.factory;

public class AnimalFactory {
	
	private AnimalFactory(){}
	
	public enum AnimalType{
		DOG {
			@Override
			public Animal createAnimal() {
				return new Dog();
			}
		},
		CAT {
			@Override
			public Animal createAnimal() {
				return new Cat();
			}
		};
		
		public abstract Animal createAnimal();
	}

	public static Animal getAnimal(AnimalType animalType){
		return animalType.createAnimal();
	}
}
