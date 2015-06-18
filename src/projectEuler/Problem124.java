package projectEuler;

import java.lang.reflect.Field;
import java.util.Scanner;

import PrimeNumber.PrimeNumber;

public class Problem124 {
	public int a;
	public int b, c, d, e, f;

	public static void main(String[] args) throws IllegalArgumentException,
			IllegalAccessException {
		int n, a[] = new int[10000], k = 0, b;
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = q.nextInt();
		for (int i = 0; i < n; i++) {
			if (PrimeNumber.test(i) == 0) {
				a[k] = i;
				k++;
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.println(a[i]);
		}
		int j = 0, p = 1;
		System.out.print("Enter the number : ");
		b = q.nextInt();
		do {
			if (b % a[j] == 0) {
				p = p * a[j];

			}
			j++;
		} while (j < b);
		System.out.println(p);
	}

}
