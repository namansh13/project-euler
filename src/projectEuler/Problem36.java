package projectEuler;

import java.math.BigInteger;

import DecimalConversion.DecimalToBinary;

public class Problem36 {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger mil = new BigInteger("1000000");
		// long n=10;
		// long sum=0;
		do {
			BigInteger c = new BigInteger("0");
			BigInteger d = n;
			// long c=0;
			// long d=n;

			do {
				BigInteger b = d.mod(ten);
				d = d.subtract(b);
				d = d.divide(ten);
				c = c.multiply(ten).add(b);

				/*
				 * int b=(int) (d%10); d=d-b; d=d/10; c=c*10+b;
				 */
			} while (d.compareTo(zero) > 0);
		//	System.out.println(c);
			if (c.equals(n)) {
			//	System.out.println(n);

				BigInteger k = DecimalConversion.DecimalToBinary.main(n);
				BigInteger g = k;
				BigInteger t = new BigInteger("0");
				// long g=k;
				// long t=0;
				do {
					BigInteger b = k.mod(ten);
					k = k.subtract(b);
					k = k.divide(ten);
					t = t.multiply(ten).add(b);
					/*
					 * int b=(int) (k%10); k=k-b; k=k/10; t=t*10+b;
					 */
				} while (k.compareTo(zero) > 0);
				if (g.equals(t)) {
					sum = sum.add(n);
					 System.out.println(n+" "+g);
				}
			}
			n = n.add(one);
		//	System.out.println(n);
		} while (n.compareTo(mil) < 0);
		System.out.println(sum);
	}
}
