package org.structural.facade;


public class SecondLevelValidation implements Validatable{

	@Override
	public boolean validate(int number) throws Exception {
		//check whether the number is divisible by 5
		return (number %5 ) ==0;
	}

}
