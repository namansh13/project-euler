package ch;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		double[] a = { 3, 3, 3, 3, 3, 1.2, 1.3, -1 };
		long e, s;
		s = System.currentTimeMillis();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					double temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d ms", (e - s));
	}
}
