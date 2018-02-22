package com.bbspvtltd;

public class Rocket implements SpaceShip {

	private int cost;
	// present weight of items on rocket
	private int presentWeight = 0;
	private int maxCargoWeight;

	public int getCost() {
		return cost;
	}

	public int getPresentWeight() {
		return presentWeight;
	}

	public int getMaxCargoWeight() {
		return maxCargoWeight;
	}

	// Parameterized Constructor
	public Rocket(int cost, int maxCargoWeight) {
		this.cost = cost;
		this.maxCargoWeight = maxCargoWeight;
	}

	// Override Methods
	@Override
	public boolean land(Item item) {
		return true;
	}

	@Override
	public boolean launch(Item item) {
		return true;
	}

	// Check if current cargo weight doesn't exceed max cargo weight
	@Override
	public boolean canCarry(Item item) {
		if ((presentWeight + item.getWeight()) > maxCargoWeight)
			return false;
		else
			return true;
	}

	@Override
	public void carry(Item item) {
		presentWeight = presentWeight + item.getWeight();
	}
}
