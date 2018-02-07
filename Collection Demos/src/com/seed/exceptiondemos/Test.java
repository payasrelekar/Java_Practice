package com.seed.exceptiondemos;

public class Test {
	int balance;

	public void withdraw(int balance) throws LessBalanceException {
		this.balance = balance;
		double amount = 1000;
		double remining;
		if (balance < amount) {
			remining = amount - balance;
			System.out.println("Withdrawal balance is : " + balance);
			System.out.println("Remaining balance is : " + remining);
		} else {
			throw new LessBalanceException("Less Balane Found.");
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.withdraw(200);
		} catch (LessBalanceException e) {
			e.printStackTrace();
		}
	}
}
