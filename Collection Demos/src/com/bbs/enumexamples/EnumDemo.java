package com.bbs.enumexamples;

public class EnumDemo {
	public static void main(String[] args) {

		// Accessing Single value of enum
		// The object of enum can not be created
		WeekDay wd;
		wd = WeekDay.MON;

		// output at enum values
		System.out.println("Value of weekDays :" + wd);

		// comparing two enum values
		if (wd == WeekDay.MON)
			System.out.println("true");
		else
			System.out.println("False");

		// By using values() method we can get all values
		System.out.println();
		System.out.print("Printing all Days.");
		WeekDay w[] = WeekDay.values();
		for (WeekDay Day : w) {
			System.out.println(Day);
		}

		// using valuesOf() method
		// if same value is not present in enum it throws an exception
		wd = WeekDay.valueOf("TUES");
		System.out.println("wd contains: " + wd);
	}
}