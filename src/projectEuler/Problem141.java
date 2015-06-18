package projectEuler;

import java.util.Scanner;

public class Problem141 {
	public static void main(String[] args) {
		long e, s;
		s = System.nanoTime();
		long n;
		long sum = 0;
		Scanner q = new Scanner(System.in);
		System.out.print("enter the number : ");
		n = q.nextLong();
		for (long i = 2; i * i < n; i++) {
			System.out.print(i + " ");
			long sq = i * i;
			if (progressive(sq)) {
				sum = sum + sq;
				System.out.print(sq);
			}
			System.out.println();
		}
		System.out.println("Sum : " + sum);
		System.out.println("Count : " + count);
		e = System.nanoTime();
		System.out.println(e + " " + s);
		System.out.printf("Total time taken : %f s",
				(double) (e - s) / 1000000000);
	}

	static long count = 0;

	public static boolean progressive(long n) {
		long y = (long) Math.pow(n, 0.5);
		long d = 2, q, r;
		do {
			if (n % d != 0) {
				q = n / d;
				r = n - q * d;
				if (d > q || r > q) {
					break;
				}
				if (d * d == r * q) {
					System.out.print(r + " " + d + " " + q + " ");
					count++;
					return true;
				}
			}
			d++;
		} while (d < y);
		return false;
	}
}
