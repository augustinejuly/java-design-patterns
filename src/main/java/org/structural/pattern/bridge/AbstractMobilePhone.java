package org.structural.pattern.bridge;

//Abstraction
public abstract class AbstractMobilePhone {

	public abstract void makeCall();

	public abstract void sendSMS();
	
	public abstract void setSimCard(SimCard simCard);

}
