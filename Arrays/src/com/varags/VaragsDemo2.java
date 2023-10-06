package com.varags;

public class VaragsDemo2 {
	static void method1(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	static void method2(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}

	static void method3(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		method1(2, 3);
		method1(12, 14);

		System.out.println("..............");

		method2(5, 6, 7);
		method2(12, 13, 14);

	}

}
