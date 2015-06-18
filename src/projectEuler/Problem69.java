package projectEuler;

import java.util.Scanner;

import PrimeNumber.PrimeNumber;

public class Problem69 {
	public static void main(String[] args) {

		long count = 0;
		float max = 0;
		long a = 0;
		//long n = 1200;
	//	max = (float) n / relativePrime(n);

		for (int n = 2; n < 1000000; n=n+4) {
			if (PrimeNumber.test(n) != 0) {
				count = relativePrime(n);
				System.out.print(n);
				if (max < (float)n / count) {
					a = n;
					max =(float) n / count;
					System.out.print(" " + count + " " + max);
				}
				System.out.println();
			}
		}
		System.out.println(a);

		// System.out.println("count : "+relativePrime(n));
		// System.out.println(max);
		// System.out.println(2.3);
	}

	public static long relativePrime(long n) {
		int c = 0;

		long count = 0;
		//System.out.println(1);
		for (int i = 3; i < n; i=i+2) {

			if (n % i != 0) {// && i % j != 0) {
				for (int j = 2; j <= i; j++) {
					if (PrimeNumber.test(j) == 0) {
						if (n % j == 0 && i % j == 0) {
							c = 0;
							break;
						} else {
							c++;
						}
					}
				}
			}

			if (c >= 1) {
				//System.out.println(i);
				count++;

				c = 0;
			}

		}

		return (count + 1);
	}
}
