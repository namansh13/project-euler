package projectEuler;

import java.math.BigInteger;

public class Problem55 {
	public static void main(String[] args) {
		long s, e;
		s = System.currentTimeMillis();
		BigInteger n = new BigInteger("10");
		BigInteger ten = new BigInteger("10");
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		BigInteger tentho = new BigInteger("10000");
		BigInteger m, d;
		int count, count1 = 0;
		do {
			count = 0;
			m = n;
			do {
				d = m;
				BigInteger ne = new BigInteger("0");
				do {
					BigInteger b = m.mod(ten);
					m = (m.subtract(b)).divide(ten);
					ne = (ne.multiply(ten)).add(b);
				} while (m.compareTo(zero) > 0);
				m = ne.add(d);
				if (palindrome(m) == 0) {
					break;
				}
				count++;
			} while (count <= 50);
			if (count > 50) {
				count1++;
			}
			n = n.add(one);
		} while (n.compareTo(tentho) < 0);
		System.out.println("Total Count of Lycherl no : "+count1);
		e = System.currentTimeMillis();
		System.out.println("Total time taken : "+(e - s)+" ms");
	}

	public static int palindrome(BigInteger n) {
		
		BigInteger b, d;
		BigInteger ne = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		d = n;
		do {
			b = d.mod(ten);
			d = (d.subtract(b)).divide(ten);
			ne = (ne.multiply(ten)).add(b);
		} while (d.compareTo(zero) > 0);
		if (n.equals(ne)) {
			return 0;

		} else
			return 1;
	}
}
