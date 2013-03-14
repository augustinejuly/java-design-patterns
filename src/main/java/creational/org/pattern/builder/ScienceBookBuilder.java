package org.pattern.builder;

public class ScienceBookBuilder implements BookBuilder{
	
	private Book book;

	public ScienceBookBuilder() {
		super();
		this.book = new Book();
	}

	public void assignTitle() {
		this.book.setTitle("Some Scientific title");
	}

	public void writeContent() {
		this.book.setContent("Writing Scientific Contents in the book");
	}

	public Book getBook() {
		return book;
	}

}
