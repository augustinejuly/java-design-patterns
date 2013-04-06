package org.behavioural.pattern.strategy;

public class CompundInterestStrategy implements Strategy{

	@Override
	public double calculateInterest(double principle, int rate, int time) {
		return  principle * Math.pow((1+ (rate/100d)), time) - principle;
	}

}
