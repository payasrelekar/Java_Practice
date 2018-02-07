package com.seed.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Bhagvat");
		set.add("Tushar");
		set.add("Rajeev");
		set.add("Uddhav");
		set.add("Bhagvat");
		set.add(null);
		set.add(null);

		System.out.println(set);

		set.remove("Bhagvat");
		System.out.println(set);
	}
}
