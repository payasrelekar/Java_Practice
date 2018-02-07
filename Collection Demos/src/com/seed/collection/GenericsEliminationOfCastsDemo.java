package com.seed.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsEliminationOfCastsDemo {
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		// Getting warning list is of row type
		List lt = new ArrayList();
		lt.add("bhagvat");
		String str = (String) lt.get(0);

		List<String> lt1 = new ArrayList<>();
		lt1.add("bhgvat");
		String st1 = lt1.get(0);
	}

}
