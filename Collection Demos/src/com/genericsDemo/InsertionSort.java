package com.genericsDemo;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 7, 6, 1 };
		int small, i, j;
		for (i = 1; i < arr.length; i++) {
			small = arr[i];
			for (j = i - 1; j >= 0 && small < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = small;
		}

		for (int j2 = 0; j2 < arr.length; j2++) {
			System.out.println(arr[j2] + " ");
		}
	}
}
