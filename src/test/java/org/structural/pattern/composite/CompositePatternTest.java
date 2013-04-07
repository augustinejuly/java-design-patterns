package org.structural.pattern.composite;

import org.junit.Before;
import org.junit.Test;

public class CompositePatternTest {

	private Manager manager1;
	private Manager manager2;
	private Manager seniorManager;

	@Before
	public void setUp(){
		manager1 = new Manager();
		manager1.add(new Employee());
		manager1.add(new Employee());
		manager1.add(new Employee());

		manager2 = new Manager();
		manager2.add(new Employee());
		manager2.add(new Employee());
		manager2.add(new Employee());

		seniorManager = new Manager();
		seniorManager.add(manager1);
		seniorManager.add(manager2);
	}

	@Test
	public void testComposite() throws Exception {
		seniorManager.receiveNotification("Admin server will be down tomorrow");
	}

}
