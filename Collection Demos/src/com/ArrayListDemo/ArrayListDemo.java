package com.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer>	 l = new ArrayList<>();
		l.add(12);
		l.add(16);
		l.add(8);
		l.add(46);
		l.add(1);
		// list allows null value
		l.add(null);
		l.add(null);
		l.add(12);

		// First way of printing values
		System.out.println("************First way of printing*******");
		System.out.println(l);

		// Second way of printing values
		System.out.println();
		System.out.println("************Second way of printing*******");
		for (Integer x : l) {
			System.out.println(x);
		}
		
		// System.out.println("==========Using forEach Methods (Java 8
		// Features)==========");
		// l.forEach(abc -> System.out.println(abc));

		System.out.println();
		System.out.println("==========Using forEach Methods (Java 8 Features)==========");
		System.out.println("2nd Way of printing by using forEach meythods---");
		l.forEach(System.out::println);

		System.out.println();
		// third way of printing
		System.out.println();
		System.out.println("************third way of printing*******");

		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// Removing elements
		System.out.println();
		System.out.println("***********Removing element************");
		// 2 is a index of array list
		l.remove(2);
		System.out.println(l);

		// size of array list
		System.out.println();
		System.out.println("Size of ArrayList :" + l.size());

	}
}
