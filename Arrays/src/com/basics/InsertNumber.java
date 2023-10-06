package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNumber {
	static void insertNumber(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u have to add at 3rd position");
		int n=sc.nextInt();
		for (int i = 0; i >3; i++) {
			arr[i]=arr[i+1];
     
		}
		arr[3]=n;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		for (int i = 0; i < arr.length - 1; i++) {

			System.out.println("enter the array element");

			arr[i] = sc.nextInt();
		}

		
		
		System.out.println(Arrays.toString(arr));
		insertNumber(arr);

		

	}
}
