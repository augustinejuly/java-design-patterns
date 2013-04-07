package org.behavioural.pattern.memento;

public class EmployeeOriginator {

	private String firstName;

	private String lastName;

	private int age;

	public EmployeeOriginator(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Memento save() {
		return new Memento(firstName, lastName, age);
	}

	public void restore(Object objMemento) {
		Memento memento = (Memento) objMemento;
		this.firstName = memento.mementoFirstName;
		this.lastName = memento.mementoLastName;
		this.age = memento.mementoAge;
	}

	public void changeFirstNameAndLastName(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private class Memento{

		private String mementoFirstName;
		private String mementoLastName;
		private int mementoAge;

		public Memento(String mementoFirstName, String mementoLastName,int mementoAge) {
			this.mementoFirstName = mementoFirstName;
			this.mementoLastName = mementoLastName;
			this.mementoAge = mementoAge;
		}

	}

	@Override
	public int hashCode() {
		return firstName.length() + lastName.length() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof EmployeeOriginator)){
			return false;
		}
		EmployeeOriginator that = (EmployeeOriginator)obj;
		if(this.firstName.equals(that.firstName) &&
				this.lastName.equals(that.lastName) &&
				this.age == that.age){
			return true;
		}
		return false;
	}

}
