package com.seed.io.filedemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.next();
		System.out.print("Enter Roll No : ");
		Integer rollNo = sc.nextInt();
		System.out.print("Enter Fees : ");
		Double fees = sc.nextDouble();
		System.out.println("Student Details are :\n\tName		 : " + name + "\n\t\tRollNo		 : " + rollNo
				+ "\n\t\tFees is		 : " + fees);
		sc.close();
	}
}
