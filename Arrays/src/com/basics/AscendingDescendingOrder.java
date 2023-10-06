package com.basics;

import java.util.Arrays;

public class AscendingDescendingOrder {
	static int[] ascendingDescendingOrder(int arr[]) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length / 2; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			for (int j = arr.length / 2; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 6, 7, 9 };
		System.out.println("before:" + Arrays.toString(arr));

		System.out.println("after:" + Arrays.toString(ascendingDescendingOrder(arr)));

	}
}
