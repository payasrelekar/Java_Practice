package com.bbspvtltd;

public class Rocket implements SpaceShip {

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
