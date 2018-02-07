package com.genericsDemo;

public class GenDemo<T> {
	T obj;

	public GenDemo(T obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "GenDemo [obj=" + obj + "]";
	}

	public T getObj() {
		return obj;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		GenDemo<Integer> i = new GenDemo<Integer>(new Integer(10));
		Integer a = i.getObj();
		GenDemo<String> j = new GenDemo<String>(new String("Bhagvat"));

		String str = j.getObj();
		// getting error at compile time
		// Type mismatch: cannot convert from String to Integer
		// a = str;
	}
}
