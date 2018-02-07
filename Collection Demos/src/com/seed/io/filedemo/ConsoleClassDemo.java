package com.seed.io.filedemo;

import java.io.Console;

public class ConsoleClassDemo {

	public static void main(String[] args) {
		Console con = System.console();
		if (con != null) {
			String name = con.readLine("Enter Your Name :");
			char[] passData = con.readPassword("Enter Your Password :");
			System.out.println("Your User Name is : " + name + "\nYour Password is : " + passData.toString());
		} else {

		}
	}
}
