package com.frequency;

import java.util.Arrays;

public class MaximumFrequencyNumber {
	static void maximumFrewuencyNumber(int ar[]) {
		int max = Integer.MIN_VALUE;
		int count = 0;

		boolean visited;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			visited = false;

			for (int j = i-1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}
				}
				System.out.println(ar[i] + "....>" + count);
			}

				for (int l = 0; l < ar.length; l++) {
					if (ar[l] > max) {
						max = ar[l];

						max = count;

					}

				}
				System.out.println("max frequency number:" + max + "...." + count);
			}
		}
	

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 2, 1, 4 };
		maximumFrewuencyNumber(arr);
		System.out.println(Arrays.toString(arr));

	}
}
