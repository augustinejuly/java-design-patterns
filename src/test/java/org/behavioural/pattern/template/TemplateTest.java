package org.behavioural.pattern.template;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void testForSsuccessfulWithdrawal() throws Exception {
		ConcreteWithdrawal withdraw = new ConcreteWithdrawal();
		withdraw.withDrawMoney(100);
	}

	@Test(expected=RuntimeException.class)
	public void testForFailureWithdrwal() throws Exception {
		ConcreteWithdrawal withdraw = new ConcreteWithdrawal(){
			@Override
			public boolean checkIfEnoughBalanceAvailable(long accountNumber) {
				return false;
			}
		};
		withdraw.withDrawMoney(100);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testForNgativeAmountWithdrawal() throws Exception {
		ConcreteWithdrawal withdraw = new ConcreteWithdrawal();
		withdraw.withDrawMoney(-100);
	}

}
