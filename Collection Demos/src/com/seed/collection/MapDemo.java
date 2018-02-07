package com.seed.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "Bhagvat");
		map.put(102, "Rajeev");
		map.put(103, "Samadhan");
		map.put(104, null);
		map.put(105, null);
		map.put(null, "Pandurang");
		map.put(null, null);
		System.out.println(map);

		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(101, "Bhagvat");
		map1.put(102, "Rajeev");
		map1.put(103, "Samadhan");
		map1.put(104, null);
		map1.put(105, null);
		map1.put(null, "Pandurang");
		map1.put(null, null);

		System.out.println();
		System.out.println(map1);

		TreeMap<Integer, String> map2 = new TreeMap<>();
		map2.put(101, "Bhagvat");
		map2.put(102, "Rajeev");
		map2.put(107, "Samadhan");
		map2.put(104, null);
		map2.put(105, null);
		map2.put(106, "Pandurang");

		System.out.println();
		System.out.println(map2);

		System.out.println();
		for (Map.Entry<Integer, String> itr : map2.entrySet()) {
			System.out.println(itr.getKey() + " " + itr.getValue());
		}

	}

}
