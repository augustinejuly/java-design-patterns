package org.behavioural.pattern.command;

public class TvTurnOnCommand implements Command{

	private TV tv;

	public TvTurnOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		if( ! tv.isIsturnedOn()){
			tv.turnOn();
		}
	}

}
