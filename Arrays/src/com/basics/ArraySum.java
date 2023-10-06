package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++)

		{
			System.out.println("enter the value");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("sum is:" + sum);
		float ar[] = { 34, 6f, 78, 9f, 23.67f, 89.6f };
		float sumi = 0f;
		
	}

}
