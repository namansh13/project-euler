package rough;

import java.math.BigInteger;

public class Problem467 {
	static int limit=10000;
	public static void main(String[] args) {
		System.out.println(primeDigital());
		System.out.println(compositeDigital());
		//System.out.println(projectEuler.Problem467.superString(primeDigital().toString(), compositeDigital().toString()));
		BigInteger n=new BigInteger(projectEuler.Problem467.superString(primeDigital(), compositeDigital()));
		BigInteger m=new BigInteger("1000000007");
		System.out.println(n.mod(m));
	}
	public static String primeDigital(){
		// int i=2;
		int j = 2;
		// BigInteger test=new BigInteger("2886");
		// BigInteger test1=new BigInteger("9");
		BigInteger ten = new BigInteger("10");
		int count = 0;
		BigInteger n = new BigInteger("0");
		do {
			if (PrimeNumber.PrimeNumber.test(j) == 0) {
				
				BigInteger i = new BigInteger(Integer.toString(j));
				n = n.multiply(ten).add(digitalroot(i));
				count++;
			}
			j++;
		} while (count < limit);
		return n.toString();
		//System.out.println(n);
		//System.out.println(digitalroot(test));
	}

	public static String compositeDigital(){
		// int i=2;
		int j = 2;
		// BigInteger test=new BigInteger("2886");
		// BigInteger test1=new BigInteger("9");
		BigInteger ten = new BigInteger("10");
		int count = 0;
		BigInteger n = new BigInteger("0");
		do {
			if (PrimeNumber.PrimeNumber.test(j) == 1) {
				
				BigInteger i = new BigInteger(Integer.toString(j));
				n = n.multiply(ten).add(digitalroot(i));
				count++;
			}
			j++;
		} while (count < limit);
		return n.toString();
		//System.out.println(n);
		//System.out.println(digitalroot(test));
	}
	
	public static BigInteger digitalroot(BigInteger n) {
		BigInteger sum = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		BigInteger nine = new BigInteger("9");

		do {
			BigInteger b = (n.mod(ten));
			n = n.subtract(b).divide(ten);
			sum = sum.add(b);
		} while (n.compareTo(zero) > 0);

		if (sum.compareTo(nine) > 0) {

			sum = digitalroot(sum);
		}

		return sum;

	}

}
