package com.varags;

public class VaragsOverload {
	static void display(int... ar) {
		for (int i : ar) {
			System.out.println(i);
		}
	}

	static void display(double... f1) {
		System.out.println("in double method");

		for (double f : f1) {
			System.out.println(f);
		}
	}

	static void display(String... str) {
		for (String s : str) {
			System.out.println(s);
		}
	}

	static void display(int x, char... ch) {
		System.out.println(x);
		for (char c : ch) {
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {

		display(2, 3, 4);
		display("java", "C", "C++");
		display(4.5f, 87.9f);
		//display();Ambiguity 
	}
}
