package org.behavioural.pattern.observer;

import org.behavioural.pattern.observer.JavaObserver.Data;
import org.junit.Assert;
import org.junit.Test;

public class JavaObserverTest {

	@Test
	public void testJavaObserver() throws Exception {
		Data data = new Data(5);
		JavaObserver observer = new JavaObserver();
		data.addObserver(observer);
		data.setNumber(3);
		Assert.assertEquals(3, observer.getRecentUpdatedValue());
	}

}
