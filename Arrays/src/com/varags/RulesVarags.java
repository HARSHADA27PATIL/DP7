package com.varags;

public class RulesVarags {
	static void method1(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	static void method2(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}
	
	
	// varags
	// rules:there can be only 1 varargs
	// static void display(int...a,String...a)
	// {
	// }
	// rules:Varargs:last arguments in the method

	static void printMe(int num, String... str) {
		System.out.println(num);
		for (String s : str) {
			System.out.println(s);
		}
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
		// display(1,2,3,"neha","dipti);
		printMe(1,"shivani", "madhu");

	}

}
