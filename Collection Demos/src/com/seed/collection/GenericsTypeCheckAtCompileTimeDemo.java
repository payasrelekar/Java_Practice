package com.seed.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypeCheckAtCompileTimeDemo {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("bhagvat");
		str.add("samadhan");
		List<Integer> intg = new ArrayList<>();
		intg.add(101);
		intg.add(102);
		//str = intg;
	}

}
