package org.behavioural.pattern.strategy;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StrategyTest {

	private InterestCalculator interestCalculator;

	private SimpleInterestStrategy simpleInterestStrategy;

	private CompundInterestStrategy compundInterestStrategy;

	@Before
	public void setUp(){
		interestCalculator = new InterestCalculator(100, 2, 3);
		simpleInterestStrategy = new SimpleInterestStrategy();
		compundInterestStrategy = new CompundInterestStrategy();
	}

	@Test
	public void testStrategy() throws Exception {
		interestCalculator.setStrategy(simpleInterestStrategy);
		assertEquals(6.0, interestCalculator.getFinalInterest(), 2);

		//change strategy to compound interest
		interestCalculator.setStrategy(compundInterestStrategy);
		assertEquals(6.12, interestCalculator.getFinalInterest(), 2);
	}

}
