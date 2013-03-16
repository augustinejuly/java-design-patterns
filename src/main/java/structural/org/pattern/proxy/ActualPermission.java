package org.pattern.proxy;

public class ActualPermission implements Permission{

	private ROLE role;

	public ActualPermission(ROLE role){
		this.role = role;
	}

	private void complexValidation(){
		//if some complex validations here are passed then access confidentialOperation
		// following is just an example validation 
		if(role.getCode()==ROLE.ADMIN.getCode()){
			return;
		}else{
			throw new UnsupportedOperationException("This operation is prohibited for you");
		}
	}

	@Override
	public void confidentialOperation() {
		complexValidation();
		System.out.println("Admin");
	}

}
