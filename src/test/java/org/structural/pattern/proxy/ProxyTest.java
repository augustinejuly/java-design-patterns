package org.structural.pattern.proxy;

import org.junit.Before;
import org.junit.Test;

public class ProxyTest {

	private ProxyPermission proxyPermission;
	private ActualPermission actualPermission;

	@Before
	public void setUp(){
		this.proxyPermission = new ProxyPermission(ROLE.USER);
		this.actualPermission = new ActualPermission(ROLE.ADMIN);
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testProxyPermission() throws Exception {
		proxyPermission.confidentialOperation();
	}

	@Test
	public void testActualPermission() throws Exception {
		actualPermission.confidentialOperation();
	}
}
