package org.behavioural.pattern.memento;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MementoTest {

	private EmployeeOriginator employeeOriginator;
	private EmployeeCareTaker employeeCareTaker;

	@Before
	public void setUp(){
		employeeOriginator = new EmployeeOriginator("John", "Jacab", 35);
		employeeCareTaker = new EmployeeCareTaker();
	}

	@Test
	public void testMementoPattern() throws Exception {

		EmployeeOriginator localTestCopy = new EmployeeOriginator("John", "Jacab", 35);
		assertTrue(employeeOriginator.equals(localTestCopy));

		employeeCareTaker.saveState(employeeOriginator);
		employeeOriginator.changeFirstNameAndLastName("Joyce", "Kate");

		assertFalse(employeeOriginator.equals(localTestCopy));

		employeeCareTaker.restoreState(employeeOriginator);
		assertTrue(employeeOriginator.equals(localTestCopy));

	}

}
