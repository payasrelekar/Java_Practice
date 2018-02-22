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
	// File f1 = new File("load.txt");
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

	public ArrayList<U1> loadU1(ArrayList<Item> items) {
		
		// List of rockets that might be required
		ArrayList<U1> rocketList = new ArrayList<U1>();

		// Count and map for dynamically created rockets
		int count = 1;
		Map<String, U1> rockMap = new HashMap<String, U1>();
		rockMap.put("rock" + count, new U1());
		// Add first rocket to list
		rocketList.add(rockMap.get("rockMap" + count));

		// Iterate over item list
		for (Item item : items) {

			// Check if rocket can carry item
			if (rocketList.get(count).canCarry(item)) {
				// Add item to rocket
				rocketList.get(count).carry(item);
			}
			else {
				// Increase count for creating next rocket object
				count++;

				/*
				 * Check if a new rocket can carry item,
				 * if NOT, return current list if YES,
				 * create new rocket object, and add item to it
				 */
				if (rockMap.put("rock" + count, new U1()).canCarry(item)) {
					rocketList.add(rockMap.get("rockMap" + count));
					rocketList.get(count).carry(item);
				}
				else
					return rocketList;
			}
		}

		return rocketList;
	}

	/*
	 * Create and load U2 rockets with items that they can carry, 
	 * and return the list of rockets
	 */
	public ArrayList<U2> loadU2(ArrayList<Item> items) {

		// List of rockets that might be required
		ArrayList<U2> rocketList = new ArrayList<U2>();

		// Count and map for dynamically created rockets
		int count = 1;
		Map<String, U2> rockMap = new HashMap<String, U2>();
		rockMap.put("rock" + count, new U2());
		// Add first rocket to list
		rocketList.add(rockMap.get("rockMap" + count));

		// Iterate over item list
		for (Item item : items) {

			// Check if rocket can carry item
			if (rocketList.get(count).canCarry(item)) {
				// Add item to rocket
				rocketList.get(count).carry(item);
			}
			else {
				// Increase count for creating next rocket object
				count++;

				/*
				 * Check if a new rocket can carry item, if NOT, return current list if YES,
				 * create new rocket object, and add item to it
				 */
				if (rockMap.put("rock" + count, new U2()).canCarry(item)) {
					rocketList.add(rockMap.get("rockMap" + count));
					rocketList.get(count).carry(item);
				}
				else
					return rocketList;
			}
		}

		return rocketList;
	}

	public static void main(String[] args) {
		Simulation s = new Simulation();
		try {
			s.loadItems();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
