package com.basics;

import java.util.Arrays;

public class SumOfDigit {
	static void sumOfDigit(int arr[]) {

		int sum = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			sum = arr[i] + arr[arr.length - i - 1];
			System.out.println("sum of first didgit and last digit:" + sum);

		}

	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 6, 4, 5, 6 };
		sumOfDigit(arr);

	}
}
