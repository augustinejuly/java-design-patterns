package org.structural.pattern.facade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {
	
	private ValidationFacade validationFacade;
	
	@Before
	public void setUp(){
		this.validationFacade = new ValidationFacade();
	}

	@Test
	public void testFacade() throws Exception {
		// directly check through the facade if the number is less than 1000 and divisible by 5 and 8
		Assert.assertTrue(validationFacade.getFianlValidationResult(120));
		Assert.assertFalse(validationFacade.getFianlValidationResult(100));
		Assert.assertFalse(validationFacade.getFianlValidationResult(1010));
		Assert.assertFalse(validationFacade.getFianlValidationResult(128));
	}
}
