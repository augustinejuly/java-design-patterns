package org.structural.pattern.bridge;

import org.junit.Before;
import org.junit.Test;

public class BridgePatternTest {

	private AirtelSimCard airtelSimCard;
	private RelianceSimCard relianceSimCard;
	private SamsungMobile samsungMobile;

	@Before
	public void setUp(){
		airtelSimCard = new AirtelSimCard();
		relianceSimCard = new RelianceSimCard();
	}

	@Test
	public void testBridgePattern() throws Exception {
		samsungMobile = new SamsungMobile(airtelSimCard);
		samsungMobile.makeCall();
		samsungMobile.sendSMS();

		samsungMobile.setSimCard(relianceSimCard);
		samsungMobile.makeCall();
		samsungMobile.sendSMS();
	}

}
