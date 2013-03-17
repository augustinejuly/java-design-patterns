package org.structural.facade;


public class ThirdLevelValidation implements Validatable{

	@Override
	public boolean validate(int number) throws Exception {
		//check whether the number is divisible by 8
				return (number %8 ) ==0;
	}

}
