package com.basics;

import java.util.Scanner;

public class SearchElements {

	static void searchArrayNumber(int ar[], int num) {
		boolean isPresent = false;
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				isPresent = true;
				System.out.println(num + " is present is array at pos:" + (i + 1));
			}
		}
		if (isPresent) {
			System.out.println(num + "is not present is array");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find");
		int x = sc.nextInt();
		searchArrayNumber(arr, x);
	}

}
