package org.structural.pattern.composite;

public class Employee implements Component{

	@Override
	public void receiveNotification(String notification) {
		System.out.println("Employee Received the notification :: "+ notification);
		return;
	}

}
