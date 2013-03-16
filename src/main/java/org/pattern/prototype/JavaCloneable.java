package org.pattern.prototype;

/**
 *This class uses Java's Cloneable interface to create copies.
 *By default it creates shallow copies
 */
public class JavaCloneable implements Cloneable{

	private String name;

	public JavaCloneable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public JavaCloneable createCopy() throws CloneNotSupportedException{
		return (JavaCloneable) clone();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
