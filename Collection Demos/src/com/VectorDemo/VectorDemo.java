package com.VectorDemo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		List<Integer> ll = new Vector<>();
		ll.add(12);
		ll.add(18);
		ll.add(12);
		ll.add(17);
		ll.add(1);
		ll.add(2);
		ll.add(19);
		ll.add(12);
		ll.add(55);
		ll.add(10);
		ll.add(19);
		ll.add(null);
		ll.add(null);

		// printing vector list
		System.out.println(ll);

		// size of vector list
		System.out.println();
		System.out.println("Size of Vector list: " + ll.size());

		// adding element
		ll.add(17);
		System.out.println(ll);

		// checking size after adding
		System.out.println();
		System.out.println("Size of Vector list: " + ll.size());

	}
}
