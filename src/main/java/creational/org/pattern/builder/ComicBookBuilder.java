package org.pattern.builder;

public class ComicBookBuilder implements BookBuilder{

	private Book book;

	public ComicBookBuilder() {
		super();
		this.book = new Book();
	}

	public void assignTitle() {
		book.setTitle("Some Comic Title");
	}

	public void writeContent() {
		book.setContent("Writing Comic Content");
	}

	public Book getBook() {
		return book;
	}

}
