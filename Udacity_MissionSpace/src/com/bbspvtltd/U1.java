package com.bbspvtltd;

import java.lang.Math;
import com.bbspvtltd.Item;

public class U1 extends Rocket {

	public U1() {
		super(100000000, 8000);
	}

	@Override
	public boolean launch(Item item) {
		if (canCarry(item)) {
			double chance = 0.05 * (this.getPresentWeight() / this.getMaxCargoWeight());
			return Math.random() >= chance;
		}
		else
			return false;
	}

	@Override
	public boolean land(Item item) {
		if (canCarry(item)) {
			double chance = 0.01 * (this.getPresentWeight() / this.getMaxCargoWeight());
			return Math.random() >= chance;
		}
		else
			return false;
	}
}
