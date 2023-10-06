//WAP to print the array in reverse order
//E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
//output must be 78, 37, 29, 45, 90, 3 

package com.basics;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int result = 0;
		int rev = 0;
		for (int i = num; i != 0; i = i / 10) {
			int rem = i % 10;
			rev = rev * 10 + rem;
		}
		System.out.println("the reverse of givem number digits are:" + rev);
		sc.close();
	}
}
