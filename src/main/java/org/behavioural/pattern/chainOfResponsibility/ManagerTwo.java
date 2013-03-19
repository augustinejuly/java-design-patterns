package org.behavioural.pattern.chainOfResponsibility;

public class ManagerTwo extends Manager{

	public ManagerTwo(int maxAmountToApprove) {
		super(maxAmountToApprove);
	}

	@Override
	public void handleRequest(int amount) {
		if(amount <= this.MAX_LIMIT_TO_APPROVE){
			System.out.println("Manager Two is approving the request..!");
		}
		else if(this.successor!= null){ 
			this.successor.handleRequest(amount);
		}
	}

}
