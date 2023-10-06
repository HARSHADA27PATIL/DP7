package com.basics;

import java.util.Arrays;

public class EvenNumber {

	static int[] findEvenNumber(int arr[]) {
		int new_arr[] = new int[arr.length];
		int count = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0) {
				new_arr[count] = arr[j];
				count++;
				System.out.println(arr[j]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				new_arr[count] = arr[i];
				count++;
				System.out.println(arr[i]);
			}
		}
		return new_arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 4, 6, 7, 8, 9 };
		System.out.println("before:" + Arrays.toString(arr));

		System.out.println("after:" + Arrays.toString(findEvenNumber(arr)));

	}

}
