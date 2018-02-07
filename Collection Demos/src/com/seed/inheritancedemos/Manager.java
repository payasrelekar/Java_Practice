package com.seed.inheritancedemos;

public class Manager extends Employee {
	private double PA;
	private double FA;
	private double OA;

	public Manager() {

	}

	public Manager(int empId, String empName, double basSal, double pA, double fA, double OA) {
		super(empId, empName, basSal);
		this.PA = 0.08 * basSal;
		this.FA = 0.13 * basSal;
		this.OA = 0.03 * basSal;
	}

	@Override
	public double calSal() {
		return super.calSal() + (PA + FA + OA);
	}

	@Override
	public String toString() {
		return super.toString() + " , " + this.PA + " , " + this.FA + " , " + this.OA;
	}
}
