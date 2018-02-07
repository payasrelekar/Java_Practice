package com.seed.collection;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Bhagvat");
		list.add("Samadhan");
		list.add("Uddhav");
		list.add("Uddhav");
		System.out.println();
		list.add(null);
		list.add("Pandurang");
		System.out.println();
		list.add(null);

		System.out.println(list);

		// using iterator
		System.out.println();
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * Collections.sort method is sorting the elements of ArrayList in ascending
		 * order.
		 */
		// Collections.sort(list);
		// using foreach loop
		// System.out.println("Using For Each after Sort");
		for (String newList : list) {
			System.out.println(newList);
		}

		// using userdefined object
		Employee e1 = new Employee(101, "Uddhav", 155000);
		Employee e2 = new Employee(102, "bhagvat", 155000);
		Employee e3 = new Employee(103, "Samadhan", 150000);
		Employee e4 = new Employee(104, "Gopal", 159000);
		Employee e5 = new Employee(105, "Pandurang", 155000);
		Employee e6 = new Employee(106, "Shivani", 157000);
		Employee e7 = new Employee(107, "Radha", 153000);
		Employee e8 = new Employee(108, "Siddhant", 158000);

		ArrayList<Employee> emp = new ArrayList<>();
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

		// using foreach loop
		for (Employee employee : emp) {
			System.out.println(employee);
		}

		System.out.println();
		System.out.println("Size of array list: " + emp.size());
		System.out.println("Arraylist is Empty: " + emp.isEmpty());
		System.out.println("Getting element through index: " + emp.get(5));
	}
}
