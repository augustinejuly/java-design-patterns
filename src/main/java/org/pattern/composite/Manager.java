package org.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Component{

	List<Component> employees = new ArrayList<Component>();

	@Override
	public void receiveNotification() {
		for (Component component : employees) {
			component.receiveNotification();
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
