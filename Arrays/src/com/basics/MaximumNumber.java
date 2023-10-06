package com.basics;

public class MaximumNumber {
	static void checkMaximumNum(int ar[]) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}

		}
		System.out.println("max element is:" + max);
	}

	public static void main(String[] args) {
		int ar[] = { 4, 5, 6, 7, 89, 56, 22, 45 };

		checkMaximumNum(ar);
	}

}
