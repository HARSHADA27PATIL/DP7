package com.basics;

import java.util.Arrays;

public class NegativeNumberShift {
	static void negativeNumberShift(int arr[]) {
		int new_arr[] = new int[arr.length];
		int count = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < 0) {
				new_arr[count] = arr[j];
				count++;
				System.out.println(arr[j]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				new_arr[count] = arr[i];
				count++;
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, -8, 4, -3, 9, -5, 1, -7 };
		System.out.println(Arrays.toString(arr));
		negativeNumberShift(arr);
	}

}
