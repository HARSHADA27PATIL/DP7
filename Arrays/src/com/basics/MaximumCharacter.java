package com.basics;

public class MaximumCharacter {
	static void checkMaximumChar(char ar[]) {

		char max ='A';
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}

		}
		System.out.println("max element is:" + max);
	}

	public static void main(String[] args) {
		char ar[] = { 'A', 'G', 'c', 'D' };

		checkMaximumChar(ar);
	}
}
