package com.bbspvtltd;

public class Item {

	// Variables name and weight
	private String name;
	private int weight;

	// Parameterized constructor
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	// Getter and Setter methods for data member name and weight
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	// To String Method
	@Override
	public String toString() {
		return "Item [name=" + name + ", weight=" + weight + "]";
	}

}
