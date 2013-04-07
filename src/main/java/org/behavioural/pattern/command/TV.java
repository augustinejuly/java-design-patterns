package org.behavioural.pattern.command;

public class TV {

	private boolean isturnedOn = false;

	public boolean isIsturnedOn() {
		return isturnedOn;
	}

	public void turnOn() {
		isturnedOn = true;
	}

	public void turnOff() {
		isturnedOn = false;
	}

}
