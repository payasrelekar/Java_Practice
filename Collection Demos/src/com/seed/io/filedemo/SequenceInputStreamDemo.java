package com.seed.io.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
	public static void main(String[] args) {
		File f1 = new File("abc.txt");
		File f2 = new File("pqr.txt");
		try {
			FileInputStream fin = new FileInputStream(f1);
			FileInputStream fin1 = new FileInputStream(f2);
			SequenceInputStream sins = new SequenceInputStream(fin, fin1);
			int j;
			while ((j = sins.read()) != -1) {
				System.out.print((char) j);
			}
			fin.close();
			fin1.close();
			sins.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
