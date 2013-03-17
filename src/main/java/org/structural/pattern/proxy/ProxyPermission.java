package org.structural.pattern.proxy;

public class ProxyPermission implements Permission{

	private ROLE role;

	public ProxyPermission(ROLE role) {
		this.role = role;
	}

	@Override
	public void confidentialOperation() {
		if(role.getCode()==ROLE.ADMIN.getCode()){
			new ActualPermission(role).confidentialOperation();
		}else{
			throw new UnsupportedOperationException("This operation is prohibited for you");
		}
	}

}
