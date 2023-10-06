package com.merging;

import java.util.Arrays;

public class AlternateArray {
	static int[] mergeArray(int ar1[], int ar2[]) {
		int mar[] = new int[ar1.length + ar2.length];
		int index = 0;
		int maxLength = Math.max(ar1.length, ar2.length);

	
		for (int i = 0; i < maxLength; i++) {
			if (i < ar1.length) {
				mar[index] = ar1[i];
				index++;
			}
			if (i < ar2.length) {
				mar[index] = ar2[i];
				index++;
			}

		}
		return mar;
	}

	public static void main(String[] args) {
		int ar1[] = { 1, 2, 3, 4, 5 };
		int ar2[] = { 11, 12, 13 };

		int mergeArray[] = mergeArray(ar1, ar2);
		System.out.println(Arrays.toString(mergeArray));
		
		
		

	}
}
