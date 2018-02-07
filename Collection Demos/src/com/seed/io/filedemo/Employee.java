package com.seed.io.filedemo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {

	private int id;
	private String name;
	private transient double salary;

	public Employee() {
		id = 101;
		name = "abc";
		salary = 15000.66;
	}

	public Employee(int id, String name, double salary) {
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

}
