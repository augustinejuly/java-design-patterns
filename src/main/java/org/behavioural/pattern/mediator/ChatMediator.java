package org.behavioural.pattern.mediator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChatMediator {

	private static Map<String, ChatMember> memberMap = new ConcurrentHashMap<String, ChatMember>();

	public void registerMember(ChatMember chatMember){
		memberMap.put(chatMember.getMemberName(), chatMember);
	}

	public boolean sendMessage(String targetMemberName, String message){
		ChatMember targetMember = memberMap.get(targetMemberName);
		return targetMember.receiveMessage(message);
	}

	public void logOutMember(String memberName){
		memberMap.remove(memberName);
	}

}
