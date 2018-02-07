package com.seed.collection;

public class Employee1 implements Comparable<Employee1> {
	private int id;
	private String name;
	private double salary;

	public Employee1() {
		id = 101;
		name = "abc";
		salary = 15000.66;
	}

	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		System.out.println();
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}

	@Override
	public int compareTo(Employee1 emp) {
		return this.id - emp.id;
	}

}
