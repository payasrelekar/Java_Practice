package com.seed.io.filedemo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("abc.txt");
			FileOutputStream fos1 = new FileOutputStream("pqr.txt");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			String str = "Hello Welcome to seed";
			baos.write(str.getBytes());
			baos.writeTo(fos1);
			baos.writeTo(fos);
			fos.close();
			fos1.close();
			baos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
