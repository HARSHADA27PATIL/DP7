package com.advance;

public class SecondHighestWithoutSorting {
	static void secondHighest(int arr[]) {
		int highest = Integer.MIN_VALUE;
		int shighest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				shighest = highest;
				highest = arr[i];
			} else if (arr[i] > shighest) {
				shighest = arr[i];
			}
		}
		System.out.println("second highest number:" + shighest);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 7, 10, 3, 4, 9, 5 };
		secondHighest(arr);
	}
}