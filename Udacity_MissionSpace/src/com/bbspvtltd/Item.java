package com.bbspvtltd;

public class Item {

	// Variables name and weight
	private String name;
	private int weight;

	// Default Constructor
	public Item() {
		name = "U1";
		weight = 18;
	}

	// Parameterized constructor
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	// Getter and Setter methods for data member name and weight
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// To String Method
	@Override
	public String toString() {
		return "Item [name=" + name + ", weight=" + weight + "]";
	}

}
