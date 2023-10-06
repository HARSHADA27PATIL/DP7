package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class AverageRainfall {
	static void checkAverageRainfall(float arr[]) {
		float avg = 1;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / avg;
    System.out.println(avg);
	}

	public static void main(String[] args) {
		// int arr[] = { 2, 3, 4, 5, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the  size");
		int size = sc.nextInt();

		float ar[] = new float[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter array elements");
			ar[i] = sc.nextFloat();
		}

		System.out.println("average rainfall in weak:"+Arrays.toString(ar));
		checkAverageRainfall(ar);
	}
}
