package org.behavioural.pattern.state;


import org.behavioural.pattern.state.Calculator.OPERATION;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StatePatternTest {

	private Calculator calculator;

	@Before
	public void setUp(){
		calculator = new Calculator(OPERATION.ADD);
	}

	@Test
	public void testStatePattern() throws Exception {
		assertEquals(8, calculator.calculate(5, 3));
		//change state  to subtract
		calculator.changeState(OPERATION.SUBTRACT);
		assertEquals(2, calculator.calculate(5, 3));
		//change state to multiply
		calculator.changeState(OPERATION.MULTIPLY);
		assertEquals(15, calculator.calculate(5, 3));
		//change state  to divide
		calculator.changeState(OPERATION.DIVIDE);
		assertEquals(1, calculator.calculate(5, 3));
	}

}
