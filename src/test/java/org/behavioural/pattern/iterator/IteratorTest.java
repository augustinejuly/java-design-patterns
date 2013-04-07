package org.behavioural.pattern.iterator;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

	private StringArray stringArray;
	private String [] months = {"January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"};

	@Before
	public void setUp(){
		stringArray = new StringArray(months);
	}

	@Test
	public void testIterator() throws Exception {
		assertEquals(12, stringArray.getArray().length);
		stringArray.addString("December");
		assertEquals(13, stringArray.getArray().length);

		Iterator<String> iterator = stringArray.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			if(next.equals("December")){
				iterator.remove();
			}
		}
		assertEquals(11, stringArray.getArray().length);
	}

}
