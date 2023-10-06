package com.basics;

import java.util.Scanner;

public class AlternateNumber {
	static void checkAlternateNumberSum(int ar[]) {
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			if ( i % 2== 0) {
				sum += ar[i];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 1, 5, 89, 90 };

		checkAlternateNumberSum(arr);
	}
}
