package org.structural.pattern.facade;

public class ValidationFacade {

	public boolean getFianlValidationResult(int number) throws Exception{
		//for example, to check if the number is less than 1000 and divisible by 5 and 8

		FirstLevelValidation firstLevelValidation = new FirstLevelValidation();
		if(firstLevelValidation.validate(number)==true){
			SecondLevelValidation secondLevelValidation = new SecondLevelValidation();
			if(secondLevelValidation.validate(number)==true){
				ThirdLevelValidation thirdLevelValidation = new ThirdLevelValidation();
				return thirdLevelValidation.validate(number);
			}
		}
		return false;
	}
}
