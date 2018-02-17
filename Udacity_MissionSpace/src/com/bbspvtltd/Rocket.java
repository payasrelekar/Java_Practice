package com.bbspvtltd;

public class Rocket implements SpaceShip {

	private int cost;
	private int weight;
	private int cargo;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
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

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land(Item item) {
		return true;
	}

	@Override
	public boolean canCarry() {
		return false;
	}

	@Override
	public Item carry() {
		return null;
	}

}
