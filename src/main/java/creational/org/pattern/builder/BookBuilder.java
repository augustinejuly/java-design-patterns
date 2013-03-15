package org.pattern.builder;

public interface BookBuilder {
	
	public void assignTitle();
	
	public void writeContent();
	
	public void fixPrice();
	
	public Book getBook();

}
