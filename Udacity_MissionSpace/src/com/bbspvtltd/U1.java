package com.bbspvtltd;

public class U1 extends Rocket {

	public U1() {
		super(100000000, 8000);
	}

	@Override
	public boolean launch() {
		double chance = 0.05 * (presentWeight / maxCargoWeight);
		return Math.random() >= chance;
	}

	@Override
	public boolean land() {
		double chance = 0.01 * (presentWeight / maxCargoWeight);
		return Math.random() >= chance;
	}
}
