package com.seed.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vect = new Vector<>();
		vect.add("Bhagvat");
		vect.add("Samadhan");
		vect.add("Samadhan");
		vect.add("Uddhav");
		vect.add("Pradip");
		vect.add("Rajeev");
		vect.add(null);

		System.out.println(vect);

		// adding element
		System.out.println();
		vect.add(2, "Tushar");
		System.out.println(vect);

		// applying emumeration for vector
		// its same as iterator
		System.out.println();
		Enumeration<String> abc = vect.elements();
		while (abc.hasMoreElements()) {
			System.out.println(abc.nextElement());
		}
	}

}
