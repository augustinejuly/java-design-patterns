package org.behavioural.pattern.mediator;


public class ChatMember {

	private ChatMediator chatMediator;
	private String memberName;

	public ChatMember(ChatMediator chatMediator, String memberName) {
		this.chatMediator = chatMediator;
		this.memberName = memberName;
		chatMediator.registerMember(this);
	}

	public  boolean sendMessage(String targetMembername, String message){
		return chatMediator.sendMessage(targetMembername, message);
	}

	public  boolean receiveMessage(String message){
		//to verify that a message is received
		return true;
	}

	public String getMemberName() {
		return memberName;
	}
}
