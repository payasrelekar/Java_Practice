package com.seed.exceptiondemos;

public class DivideByZeroDemo {
	public static int divideByZero(int a, int b) {
		int res;
		res = a / b;
		return res;
	}

	public static void main(String[] args) {
		System.out.println(divideByZero(5, 0));
	}
}
