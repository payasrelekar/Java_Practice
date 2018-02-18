package com.bbs.interviewquetions;

import java.util.Scanner;

//Java Program To Find All Vowels From String. 
public class FindVovelsFromString {

	public static void findVowels(String enterdString) {
		System.out.print("Vovles in String With charAt() Method : ");
		for (int i = 0; i < enterdString.length(); i++) {
			if (enterdString.charAt(i) == 'A' || enterdString.charAt(i) == 'E' || enterdString.charAt(i) == 'I'
					|| enterdString.charAt(i) == 'O' || enterdString.charAt(i) == 'U' || enterdString.charAt(i) == 'a'
					|| enterdString.charAt(i) == 'e' || enterdString.charAt(i) == 'i' || enterdString.charAt(i) == 'o'
					|| enterdString.charAt(i) == 'u') {
				System.out.print(enterdString.charAt(i));
			}
		}
		System.out.println();
	}

	public static void withoutCharAt(String inputString) {
		char arr[] = inputString.toCharArray();
		System.out.print("Vovles in String Without Using charAt() Method : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a'
					|| arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				System.out.print(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String for finding Vowels :");
		String enterdString = sc.nextLine();
		findVowels(enterdString);
		withoutCharAt(enterdString);
		sc.close();
	}
}
