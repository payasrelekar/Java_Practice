package com.seed.inheritancedemos;

public class Test {
	public static void main(String[] args) {
		MarketingExecutive emp = new MarketingExecutive(101, "bhagvat", 3000.66, 4800, 600, 100, 50);
		System.out.println(emp);
		System.out.println(emp.calSal());

	}
}
