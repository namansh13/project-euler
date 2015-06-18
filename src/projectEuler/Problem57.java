package projectEuler;

import java.math.BigInteger;

public class Problem57 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		int count = 2;
		int count1 = 0;

		do {
			if (digitcount(numerator(count - 1)) > digitcount(denominator(count - 1))) {
				count1++;
			}
			count++;
		} while (count <= 1000);
		System.out.println("Total count : " + count1);
		e = System.currentTimeMillis();
		System.out.println("Time taken : " + (e - s) + " ms");
	}

	public static BigInteger numerator(int count) {
		long count1 = 0;
		BigInteger temp;
		BigInteger n = new BigInteger("1");
		BigInteger d = new BigInteger("2");
		BigInteger two = new BigInteger("2");
		do {
			n = (d.multiply(two)).add(n);
			temp = d;
			d = n;
			n = temp;
			count1++;
		} while (count1 < count);
		return n.add(d);
	}

	public static BigInteger denominator(int count) {
		long count1 = 0;
		BigInteger temp;
		BigInteger n = new BigInteger("1");
		BigInteger d = new BigInteger("2");
		BigInteger two = new BigInteger("2");
		do {
			n = (d.multiply(two)).add(n);
			temp = d;
			d = n;
			n = temp;
			count1++;
		} while (count1 < count);
		return d;
	}

	public static int digitcount(BigInteger n) {
		int count = 0;
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		do {
			BigInteger b = n.mod(ten);
			n = (n.subtract(b)).divide(ten);
			count++;
		} while (n.compareTo(zero) > 0);
		return count;
	}
}
