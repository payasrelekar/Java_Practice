package com.bbspvtltd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Simulation {

	ArrayList<Item> item = null;
	File f2 = new File("Phase-1.txt");
	File f3 = new File("Phase-2.txt");
	FileInputStream fin = null;

	public ArrayList<Item> loadItems() throws IOException {
		item = new ArrayList<Item>();
		Scanner sc = new Scanner(f2);
		while (sc.hasNext()) {
			String readData[] = sc.nextLine().split("=");
			for (int i = 0; i < (readData.length - 1); i++) {
				item.add(new Item(readData[0], Integer.parseInt(readData[1])));
			}
		}

		sc.close();
		return item;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

		// List of rockets that might be required
		ArrayList<Rocket> rocketList = new ArrayList<Rocket>();

		// Count and map for dynamically created rockets
		int count = 0;
		Map<String, U1> rockMap = new HashMap<String, U1>();
		rockMap.put("rock" + count, new U1());

		// DEBUG , OKko
		System.out.println(rockMap.get("rock" + count));

		// Add first rocket to list
		rocketList.add(rockMap.get("rock" + count));

		// DEBUG , OK
		System.out.println(rocketList.get(count));

		// Iterate over item list
		for (Item item : items) {

			int i = -1;

			for (Rocket rocket : rocketList) {
				// Check if rocket can carry item
				if (rocket.canCarry(item)) {
					// Add item to rocket
					rocket.carry(item);
					break;
				}
				i++;
			}

			if (i >= count) {
				// Increase count for creating next rocket object
				count++;

				/*
				 * create new rocket object, and add item to it
				 */
				rockMap.put("rock" + count, new U1());
				rocketList.add(rockMap.get("rock" + count));
				rocketList.get(count).carry(item);
			}
		}

		return rocketList;
	}

	/*
	 * Create and load U2 rockets with items that they can carry, and return the
	 * list of rockets
	 */
	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

		// List of rockets that might be required
		ArrayList<Rocket> rocketList = new ArrayList<Rocket>();

		// Count and map for dynamically created rockets
		int count = 0;
		Map<String, U2> rockMap = new HashMap<String, U2>();
		rockMap.put("rock" + count, new U2());
		// Add first rocket to list
		rocketList.add(rockMap.get("rock" + count));

		// Iterate over item list
		for (Item item : items) {

			int i = -1;

			for (Rocket rocket : rocketList) {
				// Check if rocket can carry item
				if (rocket.canCarry(item)) {
					// Add item to rocket
					rocket.carry(item);
					break;
				}
				i++;
			}

			if (i == count) {
				// Increase count for creating next rocket object
				count++;

				/*
				 * create new rocket object, and add item to it
				 */
				rockMap.put("rock" + count, new U2());
				rocketList.add(rockMap.get("rock" + count));
				rocketList.get(count).carry(item);
			}
		}

		return rocketList;
	}

	public int runSimulation(ArrayList<Rocket> rockets) {
		int budget = 0;

		for (Rocket rocket : rockets) {
			// Keep adding cost to budget for every rocket that fails to launch or land
			while (!(rocket.launch() && rocket.land()))
				budget = budget + rocket.getCost();
			budget = budget + rocket.getCost();
		}

		return budget;
	}
}
