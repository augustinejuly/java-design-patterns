package org.structural.pattern.decorator;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {

	private SimpleUrlRequest simpleUrlRequest;

	private DefaultURLScanner defaultURLScanner;

	private SpecialURLSecurity specialURLSecurity;

	private String illegalUrl = "https://localhost:8888/index.jsp?name=guest<script>alert('attacked')</script>";
	private String validUrl = "https://localhost:8888/index.jsp/";

	@Before
	public void setUp(){
		simpleUrlRequest = new SimpleUrlRequest();
		defaultURLScanner = new DefaultURLScanner(simpleUrlRequest);
		specialURLSecurity = new SpecialURLSecurity(defaultURLScanner);
	}

	@Test
	public void testvalidUrl() throws Exception {
		specialURLSecurity.getValue(validUrl);
	}

	@Test(expected=SecurityException.class)
	public void testIllegalUrl() throws Exception{
		specialURLSecurity.getValue(illegalUrl);
	}

}
