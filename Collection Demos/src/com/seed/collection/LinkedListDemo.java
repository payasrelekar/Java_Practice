package com.seed.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Bhagvat");
		list.add("Samadhan");
		list.add("Pandurang");
		list.add("Radha");
		list.add("Bhagvat");
		list.add(null);
		list.add(null);

		System.out.println(list);

		// adding value at index
		list.add(5, "Shraddh");
		System.out.println(list);

		// removing value at index
		list.remove(7);
		System.out.println(list);

		// size of linked list
		System.out.println(list.size());

		// using user defined objects
		Employee e1 = new Employee(101, "Uddhav", 155000);
		Employee e2 = new Employee(102, "bhagvat", 155000);
		Employee e3 = new Employee(103, "Samadhan", 150000);
		Employee e4 = new Employee(104, "Gopal", 159000);
		Employee e5 = new Employee(105, "Pandurang", 155000);
		Employee e6 = new Employee(106, "Shivani", 157000);
		Employee e7 = new Employee(107, "Radha", 153000);
		Employee e8 = new Employee(108, "Siddhant", 158000);

		List<Employee> emp = new LinkedList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(null);
		emp.add(e7);
		emp.add(e8);
		emp.add(e1);
		emp.add(null);

		System.out.println(emp);

	}
}
