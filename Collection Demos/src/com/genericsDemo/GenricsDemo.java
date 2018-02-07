package com.genericsDemo;

public class GenricsDemo {
	Object obj;

	public GenricsDemo(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "GenDemo [obj=" + obj + "]";
	}

	public Object getObj() {
		return obj;
	}

	public static void main(String[] args) {
		GenricsDemo d = new GenricsDemo(new Integer(20));
		Integer i = (Integer) d.getObj();
		System.out.println(i);
		GenricsDemo s = new GenricsDemo(new String("abc"));
		String s1 = (String) s.getObj();
		System.out.println(s1);
		
		
		//it gives exception at runtime at run time
		//Type mismatch: cannot convert from String to Integer
		//so removing this types of error we use generics
		//genrics gives error at compile time
		d = s;
		Integer i1 = (Integer) d.getObj();
		System.out.println(i1);
	}
}
