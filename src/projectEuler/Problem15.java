package projectEuler;

import java.math.BigInteger;

public class Problem15 {
	public static BigInteger factorial(int n){
		BigInteger a=new BigInteger("1");
		BigInteger p=new BigInteger("1");
		BigInteger c=new BigInteger("1");
		BigInteger b;
		int count =0;
		do{
			a=a.add(c);
			p=p.multiply(a);
			count++;
		}while(count<n-1);
		return p;
	}
	
	public static void main(String[] args){
		BigInteger fact;
		System.out.println(factorial(40));
		System.out.println(factorial(20));
		System.out.println(factorial(20).multiply(factorial(20)));
		fact=(factorial(40)).divide((factorial(20).multiply(factorial(20))));
		System.out.println(fact);
		
	}

}
