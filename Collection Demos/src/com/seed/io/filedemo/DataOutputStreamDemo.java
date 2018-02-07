package com.seed.io.filedemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("F:\\testout.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.close();
		System.out.println("Succcess...");
	}
}
