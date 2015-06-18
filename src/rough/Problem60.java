package rough;

import PrimeNumber.PrimeNumber;

public class Problem60 {

	public static void main(String... args) {
		int count = 1;
		long n = 3;
		long sum = 0;
		while (count < 6 && n < 1000) {
			if (PrimeNumber.test(n) == 0) {
				
				long a = digitcount(sum) * n * 10 + sum;
				long b = sum * 10 + n;
				System.out.println(n+" "+a+" "+b);
				if (PrimeNumber.test(a) == 0 && PrimeNumber.test(b) == 0) {
					sum = sum + n;
					System.out.println(n);
					count++;
				}
			}

			n++;
		}

		
	}

	public static int digitcount(long n) {
		int count = 0;
		while (n > 0) {
			long b = n % 10;
			n = (n - b) / 10;
			count++;
		}
		return count;

	}

}
