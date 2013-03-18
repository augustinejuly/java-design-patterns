package org.behavioural.pattern.template;

public abstract class MoneyWithdrawalTemplate {

	//template method
	public final void withDrawMoney(int amount){
		if(amount <= 0){
			throw new IllegalArgumentException("Can not withdraw negative or zero amount");
		}
		if(checkIfEnoughBalanceAvailable(getAccountNumber())){
			doDebitTransaction(getAccountNumber(),amount);
		}else{
			throw new RuntimeException("You do not have enough balance to withdraw");
		}
	}

	public abstract void doDebitTransaction(long accountNumber, int amount);

	public abstract boolean checkIfEnoughBalanceAvailable(long accountNumber) ;

	public abstract long getAccountNumber();

}
