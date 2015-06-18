package rough;

import java.util.Scanner;

public class Problem153 {
	public static void main(String[] args) {
		long e, s;
		long n;
		long sum = 0;
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = q.nextInt();
		s = System.currentTimeMillis();
		for (long i = 1; i <= n; i++) {
			System.out.println();
			System.out.print(i + " ");
			sum = sum + sum(i);
			System.out.print(" " + sum);
			System.out.println();
		}
		//sum(100000);
		System.out.println("Sum : " + sum);
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d s", (e - s) / 1000);
	}

	public static long sum(long n) {
		long sum = 0;
		for (long i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
				System.out.println(i);
			}
			double j = Math.sqrt(n - i * i);
			if (j == (long) j && j != 0 && j != i) {
				sum = sum + 2 * i;
				 System.out.println(i + " + " + (long) j + "i");
				 System.out.println(i + " - " + (long) j + "i");

			}
			if (n % (2 * i) == 0) {
				sum = sum + 2 * i;
				 System.out.println(i + " + " + i + "i");
				 System.out.println(i + " - " + i + "i");
			}
		}
		// System.out.println(" " + sum);
		System.out.print(" " + (sum + n));
		return sum + n;
	}
}
