package com.seed.collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetDemo {

	enum days {
		MONDAY, TUESDAY, WENSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		Set<days> abc = EnumSet.allOf(days.class);
		Iterator<days> itr = abc.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
