package org.structural.flyweight;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FlyWeightTest {

	/**
	 * @throws Exception
	 */
	@Test
	public void testFlyWeight() throws Exception {
		Random r = new Random();
		BALL_COLOR[] values = BALL_COLOR.values();

		for (int i = 0; i < 1000; i++) {
			BallFactory.createBall(i, values[r.nextInt(values.length)]);
		}

		assertTrue(BallFactory.numberOfBallObjectsCreated() <= values.length);
		assertTrue(Ball.ballCounter <= values.length);
	}

}
