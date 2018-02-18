package com.bbs.enumexamples;

public class Test {
	public static void main(String[] args) {
		// Accept Single Value
		WeekDays wkds;
		wkds = WeekDays.WENS;

		// value of WeekDays
		System.out.println("Value of WeekDays: " + wkds);

		// displaying sequence of enum
		System.out.println();
		WeekDays wk[] = WeekDays.values();

		System.out.println("Sequence of all days:");
		for (WeekDays weekDays : wk) {
			System.out.println(weekDays + " 	" + weekDays.getStart());
		}
	}
}
