package com.bbs.enumexamples;

//Enums can be declared inside or outside class but not within any method
//Enums are by Default Final
//If declared inside class they are static
//Their object cannot be created explicitly
//Their Constructor has to be private
//Enums Cannot be private,protected,static, abstract
//by default order f enum is Natural order
public enum WeekDays {

	MON(1), TUES(2), WENS(3), THUR(4), FRI(5), SAT(6), SUN(7);

	private int start;

	// if sequence of enum is user defined
	// at that time you have to require constructor
	private WeekDays(int i) {
		start = i;
	}

	public int getStart() {
		return start;
	}
}
