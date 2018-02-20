package com.bbspvtltd;

public class Rocket implements SpaceShip {

	private int cost;
	private int presentWeight;
	private int weight;
	private int cargo;
	private int totalWeight;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPresentWeight() {
		return presentWeight;
	}

	public void setPresentWeight(int presentWeight) {
		this.presentWeight = presentWeight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getTotalWeight() {
		totalWeight = getPresentWeight() + getWeight();
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	// Default Constructor
	public Rocket() {

	}

	// Parameterized Constructor
	public Rocket(int cost, int presentWeight, int weight, int cargo, int totalWeight) {
		this.cost = cost;
		this.presentWeight = presentWeight;
		this.weight = weight;
		this.cargo = cargo;
		this.totalWeight = totalWeight;
	}

	// Override Methods
	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		return false;
	}

	@Override
	public void carry(Item item) {
		presentWeight = presentWeight + item.getWeight();
	}
}
