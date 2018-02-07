package com.seed.inheritancedemos;

public class Employee {
	private int empId;
	private String empName;
	private double basSal;
	
	
	public Employee() {

	}

	public Employee(int empId, String empName, double basSal) {
		this.empId = empId;
		this.empName = empName;
		this.basSal = basSal;
	}

	public double getBasSal() {
		return basSal;
	}

	public void setBasSal(double basSal) {
		this.basSal = basSal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double calSal() {
		return this.basSal;
	}

	@Override
	public String toString() {
		return "Employee : [ " + this.empId + " , " + this.empName + " , " + this.basSal ;
	}

}
