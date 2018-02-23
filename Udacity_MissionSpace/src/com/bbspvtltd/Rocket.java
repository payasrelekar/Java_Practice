package com.bbspvtltd;

public class Rocket implements SpaceShip {

	private int cost;
	// present weight of items on rocket
	protected int presentWeight = 0;
	// Maximum cargo the rocket can carry
	protected int maxCargoWeight;

	public int getCost() {
		return cost;
	}

	// Parameterized Constructor
	public Rocket(int cost, int maxCargoWeight) {
		this.cost = cost;
		this.maxCargoWeight = maxCargoWeight;
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
