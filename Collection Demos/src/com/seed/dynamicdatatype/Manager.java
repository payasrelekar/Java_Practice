package com.seed.dynamicdatatype;

public class Manager extends Employee {
	@Override
	public void printDetails() {
		System.out.println("I am in manager calss");
	}

	public static void main(String[] args) {
		// Employee emp1 = new Manager();
		// if (emp1 instanceof Employee) {
		// Employee emp2 = (Employee) emp1;
		// emp2.printDetails();
		// } else {
		// System.out.println("Method not found.");
		// }

	}

}
