package com.basics;

import java.util.Scanner;

public class FindNumber {

	static void searchArrayNumber(int ar[], int num) {
		boolean isPresent = false;
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				isPresent = true;
				break;
			}
		}
		if (isPresent) {

			System.out.println("number is present");
		} else {
			System.out.println("number is not present");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find");
		int num = sc.nextInt();
		searchArrayNumber(arr, num);

	}
}
