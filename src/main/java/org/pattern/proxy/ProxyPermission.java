package org.pattern.proxy;

public class ProxyPermission implements Permission{

	private ROLE role;

	public ProxyPermission(ROLE role) {
		this.role = role;
	}

	@Override
	public void confidentialOperation() {
			new ActualPermission(role).confidentialOperation();
	}

}
