package projectEuler;


import java.math.BigInteger;

public class Problem65 {
	
		public static void main(String[] args) {
			long e,s;
			s=System.currentTimeMillis();
			BigInteger[] a = new BigInteger[100];
			int len = a.length;
			int d = 2;

			BigInteger de = new BigInteger("1");
			BigInteger nu = new BigInteger("1");
			BigInteger one = new BigInteger("1");
			BigInteger two = new BigInteger("2");
			BigInteger c = new BigInteger("1");
			BigInteger ten = new BigInteger("10");

			BigInteger temp;
			a[0] = new BigInteger("2");
			for (int i = 1; i < a.length; i++) {
				if (d == 1) {
					a[i] = one;
					d++;
				} else if (d == 0) {
					a[i] = c.multiply(two);
					c = c.add(one);
					d++;

				} else {
					a[i] = one;

					d = 0;
				}

			}
			for (int i = 0; i < a.length; i++) {
			//	System.out.println(a[i]);
			}

			de = a[len - 1];
			for (int i = len - 1; i >= 1; i--) {

				nu = (de.multiply(a[i - 1])).add(nu);

				temp = nu;
				nu = de;
				de = temp;

			}

		//	System.out.println(de + "/" + nu);
			BigInteger sum = new BigInteger("0");
			BigInteger zero = new BigInteger("0");
			do {
				BigInteger b = de.mod(ten);
				de = de.subtract(b);
				de = de.divide(ten);
				sum = sum.add(b);
			} while (de.compareTo(zero) > 0);
			System.out.println();
			System.out.println(sum);
			e=System.currentTimeMillis();
			System.out.println(e-s);

		}

	}
