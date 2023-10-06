package com.basics;

import java.util.Arrays;

public class PassingArraysSum {

	static int sumOfArrays(int ar[]) {

		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				sum += ar[i];

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 7, 8, 3 };
		System.out.println("sum of even numbers" + sumOfArrays(arr));

	}

}
