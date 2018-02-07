package com.seed.inheritancedemos;

public class MarketingExecutive extends Manager {
	private double kmTravelled;
	private double TA;

	public MarketingExecutive(int empId, String empName, double basSal, double pA, double fA, double OA,
			double kmTravelled) {
		super(empId, empName, basSal, pA, fA, OA);
		this.kmTravelled = kmTravelled;
		this.TA = 5 * kmTravelled;
	}

	public double getKmTravelled() {
		return kmTravelled;
	}

	public void setKmTravelled(double kmTravelled) {
		this.kmTravelled = kmTravelled;
	}

	@Override
	public double calSal() {
		return super.calSal() + this.TA;
	}

	@Override
	public String toString() {
		return super.toString() + " , " + this.kmTravelled + " , " + this.TA + " ] ";
	}
}
