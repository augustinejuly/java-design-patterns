package org.pattern.builder;

public class BookDirector {
	
	private BookBuilder bookBuilder;
	
	public void setBookBuilder(BookBuilder bookBuilder) {
		this.bookBuilder = bookBuilder;
	}

	public void constructBook(){
		bookBuilder.assignTitle();
		bookBuilder.writeContent();
	}
	
	public Book getBook() {
		return bookBuilder.getBook();
	}

}
