package com.basics;

import java.util.Arrays;

public class CopyArray {
	static void copyArray(int arr[]) {
		int new_arr[] = new int[arr.length];
		{
			for (int i = 0; i < arr.length; i++) {

				 new_arr[i] = arr[i];
				//arr[i] = new_arr[i];
				//new_arr[i] = temp;

			}
			System.out.println(Arrays.toString(new_arr));
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 4, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(arr));

		copyArray(arr);
	}
}
