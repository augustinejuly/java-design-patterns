package org.behavioural.pattern.chainOfResponsibility;

public abstract class Manager {

	protected Manager successor;

	protected int MAX_LIMIT_TO_APPROVE;

	public Manager(int maxAmountToApprove) {
		this.MAX_LIMIT_TO_APPROVE = maxAmountToApprove;
	}

	public void setSuccessor(Manager manager){
		this.successor = manager;
	}

	public abstract void handleRequest(int amount);

}
