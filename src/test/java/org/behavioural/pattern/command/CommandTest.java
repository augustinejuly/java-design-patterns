package org.behavioural.pattern.command;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class CommandTest {

	private TV tv;
	private RemoteControl remoteControl;
	private TvTurnOnCommand tvTurnOnCommand;
	private TvTurnOffCommand tvTurnOffCommand;

	@Before
	public void setUp(){
		tv = new TV();
		tvTurnOnCommand = new TvTurnOnCommand(tv);
		tvTurnOffCommand=new TvTurnOffCommand(tv);
	}

	@Test
	public void testCommandPattern() throws Exception {
		assertFalse(tv.isIsturnedOn());
		remoteControl = new RemoteControl(tvTurnOnCommand);
		remoteControl.invoke();
		assertTrue(tv.isIsturnedOn());

		remoteControl.setCommand(tvTurnOffCommand);
		remoteControl.invoke();
		assertFalse(tv.isIsturnedOn());
	}

}
