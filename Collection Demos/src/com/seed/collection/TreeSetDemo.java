package com.seed.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> sort = new TreeSet<>();
		sort.add("Bhagvat");
		sort.add("Pavan");
		sort.add("Samadhan");
		sort.add("Suraj");
		sort.add("Ganesh");
		sort.add("Bhagvat");

		System.out.println(sort);

		Employee1 e1 = new Employee1(101, "Uddhav", 155000);
		Employee1 e2 = new Employee1(102, "bhagvat", 155000);
		Employee1 e3 = new Employee1(103, "Samadhan", 150000);
		Employee1 e4 = new Employee1(104, "Gopal", 159000);
		Employee1 e5 = new Employee1(109, "Pandurang", 155000);
		Employee1 e6 = new Employee1(106, "Shivani", 157000);
		Employee1 e7 = new Employee1(107, "Radha", 153000);
		Employee1 e8 = new Employee1(108, "Siddhant", 158000);

		TreeSet<Employee1> emp = new TreeSet<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);

		Iterator<Employee1> itr = emp.iterator();
		while (itr.hasNext()) {
			Employee1 employee = (Employee1) itr.next();
			System.out.println(employee);
		}

		System.out.println();
		System.out.println("Getting last Element");
		System.out.println(emp.last());

		System.out.println("First Element: " + "\n\n" + emp.first());
	}

}
