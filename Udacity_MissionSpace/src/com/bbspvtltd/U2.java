package com.bbspvtltd;

import com.bbspvtltd.Item;

public class U2 extends Rocket {

	public U2() {
		super(120000000, 11000);
	}

	@Override
	public boolean launch(Item item) {
		if (canCarry(item)) {
			double chance = 0.04 * (getPresentWeight() / this.getMaxCargoWeight());
			return Math.random() >= chance;
		} else
			return false;
	}

	@Override
	public boolean land(Item item) {
		if (canCarry(item)) {
			double chance = 0.08 * (getPresentWeight() / this.getMaxCargoWeight());
			return Math.random() >= chance;
		} else
			return false;
	}
}
