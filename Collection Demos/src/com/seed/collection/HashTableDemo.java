package com.seed.collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> abc = new Hashtable<>();
		abc.put("Bhagvat", 106);
		abc.put("Pandurang", 102);
		abc.put("Rajeev", 107);

		System.out.println(abc);
	}
}
