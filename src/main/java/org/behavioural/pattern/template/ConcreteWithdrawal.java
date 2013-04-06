package org.behavioural.pattern.template;

public class ConcreteWithdrawal extends MoneyWithdrawalTemplate{

	private long accountNumber;

	@Override
	public void doDebitTransaction(long accountNumber, int amount) {
		// withdraw and deduct the amount from balance
	}

	@Override
	public boolean checkIfEnoughBalanceAvailable(long accountNumber) {
		//do some check algorithm here
		return true;
	}

	@Override
	public long getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

}
