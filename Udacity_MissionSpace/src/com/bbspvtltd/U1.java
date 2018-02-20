package com.bbspvtltd;

import java.lang.Math;

public class U1 extends Rocket {
	private final int cost = 100000000;
	private int weight = 10000;
	private int maxCargoWeight = 8000;
	
	@Override
	public boolean land() {
		
		double chance = 0.01 * (getPresentWeight() / maxCargoWeight);
		
		return Math.random() >= chance;
	}

	@Override
	public boolean launch() {
		
		double chance = 0.05 * (getPresentWeight() / maxCargoWeight);
		
		return Math.random() >= chance;
	}
}
