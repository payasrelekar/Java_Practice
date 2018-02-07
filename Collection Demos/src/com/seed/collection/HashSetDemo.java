package com.seed.collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Bhagvat");
		set.add("Tushar");
		set.add("Rajeev");
		set.add("Uddhav");

		set.add(null);
		set.add(null);
		set.add("Bhagvat");

		System.out.println(set);

		set.remove("Bhagvat");
		System.out.println(set);
	}
}
