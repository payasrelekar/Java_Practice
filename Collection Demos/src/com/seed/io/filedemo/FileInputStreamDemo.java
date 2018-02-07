package com.seed.io.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		File f = new File("abc.txt");
		try {

			if (f.exists()) {
				int i;
				FileInputStream fin = new FileInputStream(f);
				while ((i = fin.read()) != -1) {
					System.out.print((char) i);
				}
				fin.close();
			} else {
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
