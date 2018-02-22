package com.bbspvtltd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
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
		ArrayList<U1> rocketList = new ArrayList<U1>();

		for (Item item : items) {

		}

		return rocketList;
	}

	public ArrayList<U2> loadU2(ArrayList<Item> items) {
		ArrayList<U2> rocketList = new ArrayList<U2>();

		for (Item item : items) {

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
