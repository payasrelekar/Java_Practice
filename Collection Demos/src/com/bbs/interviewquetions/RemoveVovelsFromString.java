package com.bbs.interviewquetions;

import java.util.Scanner;

//Java Program To Remove All Vowels From String. 
public class RemoveVovelsFromString {

	public static void findVowels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter String :");
		String enterdString = sc.nextLine();
		System.out.println("Strinng without vowels : " + enterdString.replaceAll("[aeiouAEIOU]", ""));
		sc.close();
	}

	public static void main(String[] args) {
		findVowels();
	}
}
