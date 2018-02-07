package com.seed.io.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File f=new File("abc.txt");
		if (f.exists()) {
			System.out.println("File is present.");
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.canExecute());
			System.out.println(f.getPath());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getFreeSpace());
			System.out.println(f.getTotalSpace());
			System.out.println(f.getName());
			f.deleteOnExit();
			System.out.println("File is deleted.");
		} else {
			try {
				f.createNewFile();
				System.out.println("File Created.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
