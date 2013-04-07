package org.behavioural.pattern.command;

public class TvTurnOffCommand implements Command{

	private TV tv;

	public TvTurnOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		if(tv.isIsturnedOn()){
			tv.turnOff();
		}
	}

}
