package org.structural.pattern.adaptor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdaptorPatternTest {

	private TargetSquare classAdaptor;

	private TargetSquare objectAdaptor;

	@Before
	public void setUp(){
		classAdaptor = new ClassAdaptorForSquare();
		objectAdaptor = new ObjectAdaptor(new RectangleAdaptee());
	}

	@Test
	public void testClassAdaptor() throws Exception {
		assertEquals(25,classAdaptor.findAreaOfSquareint(5));
	}

	@Test
	public void testObjectAdaptor() throws Exception {
		assertEquals(16, objectAdaptor.findAreaOfSquareint(4));
	}
}
