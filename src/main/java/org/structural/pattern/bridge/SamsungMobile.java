package org.structural.pattern.bridge;

// Refined Abstraction
public class SamsungMobile extends AbstractMobilePhone{

	private SimCard simCard;

	public SamsungMobile(SimCard simCard) {
		this.simCard = simCard;
	}

	@Override
	public void makeCall() {
		simCard.callService();
	}

	@Override
	public void sendSMS() {
		simCard.smsService();
	}

}
