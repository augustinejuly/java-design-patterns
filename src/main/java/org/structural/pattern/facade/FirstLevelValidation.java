package org.structural.pattern.facade;


public class FirstLevelValidation implements Validatable {

	@Override
	public boolean validate(int number) throws Exception {
		//just verify if the number is less than 1000
		return number < 1000;
	}

}
