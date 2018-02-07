package com.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(18);
		ll.add(12);
		ll.add(17);
		ll.add(1);
		ll.add(null);
		ll.add(null);
		ll.add(null);

		System.out.println(ll);

		// getting element at index
		System.out.println("Element at Index 4 is : " + ll.get(4));

		// adding element at index
		System.out.println();
		ll.add(3, 34);
		System.out.println(ll);

		// removing element at index
		System.out.println();
		ll.remove(2);
		System.out.println(ll);

		// size of linked list
		System.out.println();
		System.out.println("Size of linked list: " + ll.size());

		// using iterator printing linked list
		System.out.println();
		System.out.println("Using iterator");
		Iterator<Integer> i = ll.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
