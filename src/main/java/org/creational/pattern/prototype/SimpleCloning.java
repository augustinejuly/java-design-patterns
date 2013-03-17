package org.creational.pattern.prototype;

/**
 *This class creates a new object and copies all the original object's attribute values 
 */
public class SimpleCloning{

	private String name;

	public String getName() {
		return name;
	}

	public SimpleCloning(String name) {
		this.name = name;
	}

	public SimpleCloning createCopy(){
		return new SimpleCloning(this.name);
	}

}
