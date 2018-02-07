package com.seed.exceptiondemos;

public class LessBalanceException extends Exception {

	private static final long serialVersionUID = 1L;

	String lessBalance;

	public LessBalanceException(String lessBalance) {
		super(lessBalance);
		this.lessBalance = lessBalance;
	}
}

