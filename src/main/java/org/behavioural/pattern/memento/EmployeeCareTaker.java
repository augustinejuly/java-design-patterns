package org.behavioural.pattern.memento;

public class EmployeeCareTaker {

	private Object momentoObject;

	public void saveState(EmployeeOriginator employeeOriginator) {
		momentoObject = employeeOriginator.save();
	}

	public void restoreState(EmployeeOriginator employeeOriginator) {
		employeeOriginator.restore(momentoObject);
	}

}
