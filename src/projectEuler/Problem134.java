package projectEuler;

import java.util.Scanner;

public class Problem134 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		int p1, p2;
		Scanner q = new Scanner(System.in);
		int[][] a = new int[78498][2];
		int j = 0;
		long sum = 0;
		for (int i = 5; i <= 1000003; i++) {
			if (PrimeNumber.PrimeNumber.test(i) == 0) {
				a[j][0] = i;
				a[j][1] = (int) Math.pow(10, digit(i));
				j++;
			}
		}
		System.out.println(j);
		for (int i = 0; i < j - 1; i++) {
			//System.out.print(a[i][0] + " " + a[i + 1][0] + " " + a[i][1] + " ");
			sum = sum + conprime(a[i][0], a[i + 1][0], a[i][1]);
			//System.out.println(i);
		}
		System.out.println(sum);
		e = System.currentTimeMillis();
		System.out.println("Total Time taken : " + (e - s) + " ms");
	}

	public static long conprime(long p1, long p2, long pow) {
		int i = 2;
		long n;
		do {
			n = i * pow + p1;
			i++;
		} while (n % p2 != 0);
		//System.out.print(n + " ");
		return n;
	}

	public static int digit(long n) {
		int count = 0;
		do {
			long b = n % 10;
			n = (n - b) / 10;
			count++;
		} while (n > 0);
		return count;
	}
}

// 18612760000617135