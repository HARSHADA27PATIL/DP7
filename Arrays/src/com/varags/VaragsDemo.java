package com.varags;

public class VaragsDemo {
	static void display(int ar[]) {
		for (int i : ar) {
			System.out.println(i + " ");
		}
		System.out.println();
	}

	// ellipsis...
	// method overloaded.....number of arguments
	static void displayElements(int... a) {
		for (int i : a) {
			System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {
		int ar1[] = { 1, 2, 3, 4 };
		int ar2[] = { 5, 5 };
		int ar3[] = { 7, 8, 9 };

		display(ar1);
		display(ar2);
		display(ar2);
		System.out.println("......................");

		displayElements(ar1);
		displayElements(ar2);
	}
}