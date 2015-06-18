package rough;

import java.math.BigInteger;

public class Problem104 {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("300");

		long st = System.currentTimeMillis();
		System.out.println(digit(fibonacci(n.longValue() + 1)));
		//System.out.println(fibonacci(n.longValue() + 1));
		long et = System.currentTimeMillis();
		System.out.println("Total Time taken : " + (et - st) + " ms");

		long s = System.currentTimeMillis();
		// System.out.println(fib(n));
		long e = System.currentTimeMillis();
		System.out.println("Total Time taken : " + (e - s) + " ms");

	}

	public static long digit(BigInteger a) {
		long count = 0;
		do {
			BigInteger b = a.mod(BigInteger.TEN);
			a = a.subtract(b);
			a = a.divide(BigInteger.TEN);
			count++;
		} while (a.compareTo(BigInteger.ZERO) > 0);
		return count;
	}

	public static BigInteger fib(BigInteger n) {
		// BigInteger two = new BigInteger("2");
		if (n.compareTo(BigInteger.ONE) <= 0) {
			return BigInteger.ONE;

		}
		return fib(n.subtract(BigInteger.ONE)).add(
				fib(n.subtract(BigInteger.ONE.add(BigInteger.ONE))));
	}

	public static BigInteger fibonacci(long n) {
		long count = 0;
		BigInteger f = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		while (count < n) {
			BigInteger a = sum;
			sum = sum.add(f);
			f = a;
			// System.out.println(sum);
			count++;
		}
		return sum;
	}

}
