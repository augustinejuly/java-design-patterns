package org.behavioural.pattern.chainOfResponsibility;

public class ManagerThree extends Manager {

	public ManagerThree(int maxAmountToApprove) {
		super(maxAmountToApprove);
	}

	@Override
	public void handleRequest(int amount) {
		if(amount <= this.MAX_LIMIT_TO_APPROVE){
			System.out.println("Manager Three is approving the request..!");
		}
		else if(this.successor!= null){
			this.successor.handleRequest(amount);
		}else{
			throw new RuntimeException("Amount is exceeding the limit and hence cannot be approved");
		}
	}

}
