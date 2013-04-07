package org.behavioural.pattern.visitor;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VisitorTest {

	private Mercury mercury;
	private Mars mars;
	private Uranus uranus;

	private EarthWeightConvertionVisitor earthWeightConvertionVisitor;
	private PlanetInfoVisitor planetInfoVisitor;

	@Before
	public void setUp(){
		mercury = new Mercury();
		mars = new Mars();
		uranus = new Uranus();
	}

	@Test
	public void testEarthWeightConvertionVisitor() throws Exception {
		earthWeightConvertionVisitor = new EarthWeightConvertionVisitor(80);
		Assert.assertEquals(new Float(30.24), mercury.accept(earthWeightConvertionVisitor));
		Assert.assertEquals(new Float(30.16),mars.accept(earthWeightConvertionVisitor));
		Assert.assertEquals(new Float(71.12),uranus.accept(earthWeightConvertionVisitor));
	}

	@Test
	public void testPlanetInfoVisitor() throws Exception {
		planetInfoVisitor = new PlanetInfoVisitor();
		Assert.assertThat(mercury.accept(planetInfoVisitor),new IsInstanceOf(String.class));
		Assert.assertThat(mars.accept(planetInfoVisitor),new IsInstanceOf(String.class));
		Assert.assertThat(uranus.accept(planetInfoVisitor),new IsInstanceOf(String.class));
	}

}
