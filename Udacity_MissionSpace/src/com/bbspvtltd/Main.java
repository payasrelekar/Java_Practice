package com.bbspvtltd;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		Simulation sim = new Simulation();
		
		ArrayList<Item> items = sim.loadItems();
		
		ArrayList<Rocket> fleetU1 = sim.loadU1(items);
		ArrayList<Rocket> fleetU2 = sim.loadU2(items);
		
		int budgetU1 = sim.runSimulation(fleetU1);
		int budgetU2 = sim.runSimulation(fleetU2);
		
		System.out.println("Cost of U1 rockets is : "+budgetU1);
		System.out.println("Cost of U2 rockets is : "+budgetU2);
		System.out.println("Total cost is : "+(budgetU1 + budgetU2));
	}
}
