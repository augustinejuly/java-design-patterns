package org.behavioural.pattern.chainOfResponsibility;

import org.junit.Before;
import org.junit.Test;

public class ChainOfResponsibilityTest {

	private Manager manager;

	@Before
	public void setUp(){
		ManagerOne managerOne = new ManagerOne(1000);
		ManagerTwo managerTwo = new ManagerTwo(2000);
		ManagerThree managerThree = new ManagerThree(3000);

		managerOne.setSuccessor(managerTwo);
		managerTwo.setSuccessor(managerThree);

		manager = managerOne;
	}

	@Test
	public void testChainOfResponsibility() throws Exception {
		manager.handleRequest(1500);
		manager.handleRequest(980);
		manager.handleRequest(2500);
	}

	@Test(expected=RuntimeException.class)
	public void testFailureConditoni() throws Exception {
		manager.handleRequest(3500);
	}
}
