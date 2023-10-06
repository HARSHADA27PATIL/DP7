package com.frequency;

import java.util.Arrays;

public class FreqElementchar {
	static void findFrq(char ar[]) {
		int count;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == '\0')
				continue;
			count = 1;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					ar[j] = '\0';
				}
			}
			System.out.println(ar[i] + ".....>" + count);
		}
	}

	public static void main(String[] args) {
		char ar[] = { 'a', 'b', 'a', 'e', 'f', 'a', 'b', 'a' };
		findFrq(ar);
		
		System.out.println(Arrays.toString(ar));

	}

}
