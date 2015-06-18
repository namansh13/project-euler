package projectEuler;

import java.math.BigInteger;

public class Problem56 {
	public static void main(String[] args) {
		long s, e;
		s = System.currentTimeMillis();
		BigInteger pow, sum;
		int b;
		BigInteger a = new BigInteger("50");
		BigInteger ten = new BigInteger("10");
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		BigInteger max = new BigInteger("0");
		BigInteger hund = new BigInteger("100");
		do {
			if (a.mod(ten) != zero) {
				b = 50;
				do {
					pow = a.pow(b);
					sum = new BigInteger("0");
					do {
						BigInteger c = pow.mod(ten);
						pow = (pow.subtract(c)).divide(ten);
						sum = sum.add(c);
					} while (pow.compareTo(zero) > 0);
					if (sum.compareTo(max) > 0) {
						max = sum;
						// System.out.println(max + " " + a + "," + b);
					}
					b++;
				} while (b < 100);
			}
			a = a.add(one);

		} while (a.compareTo(hund) < 0);
		System.out.println("Max digit sum : " + max);
		e = System.currentTimeMillis();
		System.out.println("Total time : " + (e - s) + " ms");
	}
}
