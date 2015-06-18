package projectEuler;

import java.math.BigInteger;

public class Problem104 {
	public static void main(String[] args) {
		long e, s;
		BigInteger t=new BigInteger("10");
		s = System.currentTimeMillis();
		//System.out.println(fibonacci(2749).mod(BigInteger.TEN.pow(9)));
		//System.out.println(digit(fibonacci(2749)));
		// System.out.println(fibonacci(13).mo));
		//long i = 41;
		System.out.println(fib(t));
		BigInteger i=new BigInteger("41");
		int n = 0;
		while (n != 1) {

			n = pandigital(fib(i));
			System.out.println(i);
			i=i.add(BigInteger.ONE);
			//i++;
		} // while (n != 1);
		System.out.println(i.subtract(BigInteger.ONE));
		
		e = System.currentTimeMillis();
		System.out.println("Total Time taken : " + (e - s) + " ms");
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

	public static int pandigital(BigInteger a) {
		String s = "123456789";
		int i = 0;
		int count = 0;

		BigInteger c = new BigInteger("1000000000");
		String w = a.mod(c).toString();
		/*if (a.toString().length() < 9 || w.length() < 9) {
			return 2;
		}*/
		String e = a.toString().substring(0, 9);
		//System.out.print(e + " "+w+" ");
		do {
			if (/* w.indexOf(s.charAt(i)) == -1 ||*/ e.indexOf(s.charAt(i)) == -1) {
				// count++;
				// System.out.println(a + " " + w + " " + e);
				// System.out.print(" "+ s.charAt(i));
				return 0;
			}
			i++;
		} while (i < 9);
		// System.out.println(e);
		// System.out.println(a);
		return 1;
	}
	public static BigInteger fib(BigInteger n) {
		BigInteger two = new BigInteger("2");
		if (n.compareTo(BigInteger.ONE) <= 0) {
			return BigInteger.ONE;

		}
		return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(two)));
	}
}
