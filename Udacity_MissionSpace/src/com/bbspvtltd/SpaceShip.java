package com.bbspvtltd;

public interface SpaceShip {

	public boolean launch();
	public boolean land(Item item);
	public boolean canCarry();
	public Item carry();
}
