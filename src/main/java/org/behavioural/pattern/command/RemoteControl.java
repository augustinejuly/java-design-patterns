package org.behavioural.pattern.command;

public class RemoteControl {

	private Command command;

	public RemoteControl(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void invoke(){
		command.execute();
	}

}
