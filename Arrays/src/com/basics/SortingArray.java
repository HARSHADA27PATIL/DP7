package com.basics;

import java.util.Arrays;

public class SortingArray {

	static void sortArr(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 1, 7, 8, 2 };
		System.out.println("before:" + Arrays.toString(arr));
		sortArr(arr);
		System.out.println("after:" + Arrays.toString(arr));
		

	}
}
