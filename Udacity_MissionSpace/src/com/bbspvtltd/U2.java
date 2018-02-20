package com.bbspvtltd;

public class U2 extends Rocket {
	
	private final int cost = 120000000;
	private int weight = 18000;
	private int maxCargoWeight = 11000;

	@Override
	public boolean land() {
		if(getPresentWeight() > maxCargoWeight)
			return false;
		else {
			double chance = 0.08 * (getPresentWeight() / maxCargoWeight);
			return Math.random() >= chance;
		}
	}

	@Override
	public boolean launch() {
		if(getPresentWeight() > maxCargoWeight)
			return false;
		else {
			double chance = 0.04 * (getPresentWeight() / maxCargoWeight);
			return Math.random() >= chance;
		}
	}
}
