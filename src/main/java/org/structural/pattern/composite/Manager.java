package org.structural.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Component{

	List<Component> employees = new ArrayList<Component>();

	@Override
	public void receiveNotification(String notification) {
		System.out.println("Manager Received Notification :: "+ notification);
		for (Component component : employees) {
			component.receiveNotification(notification);
		}
	}

	public void add(Component component){
		employees.add(component);
	}

	public void remove(Component component){
		employees.remove(component);
	}

	public List<Component> getReportingEmployees(){
		return employees;
	}

}
