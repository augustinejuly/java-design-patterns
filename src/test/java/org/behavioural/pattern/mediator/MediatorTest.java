package org.behavioural.pattern.mediator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MediatorTest {

	private ChatMediator chatMediator;

	private ChatMember memberA;

	private ChatMember memberB;

	private ChatMember memberC;

	@Before
	public void setUp(){
		chatMediator = new ChatMediator();
		memberA = new ChatMember(chatMediator, "A");
		memberB = new ChatMember(chatMediator, "B");
		memberC=new ChatMember(chatMediator, "C");
	}

	@Test
	public void testChatMediator() throws Exception {
		assertTrue(memberA.sendMessage("B", "Hi B , Hello, How are you ?"));
		assertTrue(memberB.sendMessage("C", "Hi C Hello, How are you ?"));
		assertTrue(memberC.sendMessage("A", "Hi A Hello, How are you ?"));
	}

}
