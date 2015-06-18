package rough;

import java.math.BigInteger;

public class Problem231 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		BigInteger n=new BigInteger("200000");
		BigInteger zero=new BigInteger("0");
		BigInteger one=new BigInteger("1");
		BigInteger p=new BigInteger("1");
		do{
			p=p.multiply(n);
			n=n.subtract(one);
			
		}while(n.compareTo(zero)>0);
	//	System.out.println(p);
		e = System.currentTimeMillis();
		System.out.println("Total time taken : " + (e - s) + " ms");
	}

	
}