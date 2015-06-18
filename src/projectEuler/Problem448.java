package projectEuler;

import java.math.BigInteger;

public class Problem448 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		BigInteger sum = BigInteger.ZERO;
		BigInteger avg = BigInteger.ZERO;
		BigInteger a, b;
		a = new BigInteger("10000");
		b = new BigInteger("545");
		for (BigInteger i = BigInteger.ONE; i.compareTo(a) <= 0; i = i
				.add(BigInteger.ONE)) {
			sum = BigInteger.ZERO;
			for (BigInteger j = BigInteger.ONE; j.compareTo(i) <= 0; j = j
					.add(BigInteger.ONE)) {
				sum = sum.add(lcm(i, j));

			}
			avg = avg.add((sum.divide(i)));
			// System.out.println(i+" "+avg);
		}
		System.out.println("Average : " + avg);
		e = System.currentTimeMillis();
		System.out.println("Total time taken : " + (e - s) + " ms");
	}

	public static BigInteger lcm(BigInteger a, BigInteger b) {
		BigInteger max = a;
		BigInteger min = b;
		if (a == b || a.mod(b) == BigInteger.ONE) {
			return a;
		}
		BigInteger d = BigInteger.ONE;
		do {
			if (d.compareTo(BigInteger.ZERO) == 0) {
				return a.divide(max).multiply(b);
			}
			d = max.subtract(min);

			max = d.max(min);
			min = d.min(min);

		} while (max != min);
		return (a.divide(d)).multiply(b);
	}

}
