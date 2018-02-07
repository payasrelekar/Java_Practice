package com.seed.io.filedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserializationDemo {
	public static void main(String[] args) {
		FileOutputStream fout;
		FileInputStream fin;
		ObjectInputStream oins;
		ObjectOutputStream ObjStr;
		try {
			fout = new FileOutputStream("serial.txt");
			ObjStr = new ObjectOutputStream(fout);
			Employee emp = new Employee(101, "bhagvat", 1860.55);
			ObjStr.writeObject(emp);
			fout.close();
			ObjStr.close();
			System.out.print("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fin = new FileInputStream("serial.txt");
			oins = new ObjectInputStream(fin);
			Employee emp1 = (Employee) oins.readObject();
			System.out.println(emp1);
			fin.close();
			oins.close();
			System.out.println("Success");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
