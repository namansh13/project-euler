package projectEuler;

import java.math.BigInteger;

public class Problem231 {
	public static void main(String[] args){
		long e,s;
		s=System.currentTimeMillis();
		BigInteger a=new BigInteger("20000000");
		BigInteger b=new BigInteger("15000000");
		//System.out.println(binomial(a ,b));
		//System.out.println(factorial(a));
		binomial(a,b);
		//factorial(a);
		e=System.currentTimeMillis();
		System.out.println("Total time taken : "+(e-s)+" ms");
		
}
	public static BigInteger binomial(BigInteger a,BigInteger b){
		BigInteger val=new BigInteger("1");
		/*System.out.println(factorial(a));
		System.out.println(factorial(b));
		System.out.println(factorial(a.subtract(b)));*/
	
		val=(factorial(a)).divide(factorial(b));
		val=val.divide(factorial(a.subtract(b)));
		return val;
	}
	/*public static long primeSum(double a){
		
	}*/
	public static BigInteger factorial(BigInteger a){
		BigInteger val=new BigInteger("1");
		BigInteger one=new BigInteger("1");
		BigInteger zero=new BigInteger("0");
		do{
			val=val.multiply(a);
			a=a.subtract(one);
		}while(a.compareTo(zero)>0);
		return val;
	}
}
