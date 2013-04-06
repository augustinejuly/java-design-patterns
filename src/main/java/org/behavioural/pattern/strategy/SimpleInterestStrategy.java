package org.behavioural.pattern.strategy;

public class SimpleInterestStrategy implements Strategy{

	@Override
	public double calculateInterest(double principle, int rate, int time) {
		return principle * rate/100d * time;
	}

}
