package org.behavioural.pattern.strategy;

public class InterestCalculator{

	private double principle;

	private int rate;

	private int time;

	private Strategy strategy;

	public InterestCalculator(double principle, int rate, int time) {
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public double getFinalInterest(){
		return strategy.calculateInterest(principle, rate, time);
	}
}
