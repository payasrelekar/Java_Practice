package com.bbspvtltd;

public class U2 extends Rocket {

	public U2() {
		super(120000000, 11000);
	}

	@Override
	public boolean launch() {
		double chance = 0.04 * (presentWeight / maxCargoWeight);
		return Math.random() >= chance;
	}

	@Override
	public boolean land() {
		double chance = 0.08 * (presentWeight / maxCargoWeight);
		return Math.random() >= chance;
	}
}
