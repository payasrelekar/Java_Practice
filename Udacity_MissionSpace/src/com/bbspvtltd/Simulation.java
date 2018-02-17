package com.bbspvtltd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	ArrayList<Item> item = null;
	File f1 = new File("load.txt");
	File f2 = new File("Phase-1.txt");
	File f3 = new File("Phase-2.txt");
	FileInputStream fin = null;

	public ArrayList<Item> loadItems(File f) throws IOException {
		
		item = new ArrayList<>();
		Scanner sc = new Scanner(f2);
		while (sc.hasNext()) {
			String readData[] = sc.nextLine().split("=");
			for (int i = 0; i < (readData.length - 1); i++) {
				String tool = readData[0];
				int weight1 = Integer.parseInt(readData[1]);
				item.add(new Item(tool, weight1));
			}

		}

		sc.close();
		return item;
	}
}
