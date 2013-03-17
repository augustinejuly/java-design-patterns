package org.structural.pattern.proxy;

public class ActualPermission implements Permission{

	private ROLE role;

	public ActualPermission(ROLE role){
		this.role = role;
	}

	private void complexOperation(){
		//some complex operation could be here
		return;
	}

	@Override
	public void confidentialOperation() {
		complexOperation();
	}

}
