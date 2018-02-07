package com.seed.abstractRules;

public class C extends B {

	@Override
	public void add(int c, int d) {
		System.out.println(c + d);
	}

	// @Override
	// public void mul(int a, int b) {
	// System.out.println(a * b);
	// }

	@Override
	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {

	}

	@Override
	public void div(int a, int b) {
		System.out.println(a / b);
	}
}
