package org.pattern.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BuilderTest {

	@Test
	public void testBuilderPattern() throws Exception {
		BookBuilder builder = new ComicBookBuilder();
		builder.assignTitle();
		builder.writeContent();
		assertEquals("Some Comic Title", builder.getBook().getTitle());
		
		builder = new ScienceBookBuilder();
		builder.assignTitle();
		builder.writeContent();
		assertEquals("Some Scientific title", builder.getBook().getTitle());
	}
}
