package com.seed.io.filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		File f = new File("abc.txt");
		FileOutputStream fos;
		BufferedReader reader;
		try {
			fos = new FileOutputStream(f);
			if (f.exists()) {
				System.out.println("Enter text Here which you want save in File.");
				reader = new BufferedReader(new InputStreamReader(System.in));
				try {
					String str = reader.readLine();
					System.out.println(str);
					byte b[] = str.getBytes();
					fos.write(b);
					System.out.println("Data Saved into File.");

				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
