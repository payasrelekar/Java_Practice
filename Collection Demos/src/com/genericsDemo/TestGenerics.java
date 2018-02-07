package com.genericsDemo;

import java.util.ArrayList;

public class TestGenerics {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bhagvat");
		list.add("Samadhan");
		list.add("Jagdish");
		System.out.println(list);

		String str = list.get(1);
		System.out.println(str);

	}
}
