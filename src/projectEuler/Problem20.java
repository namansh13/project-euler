package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem20 {
	public static BigInteger factorial(BigInteger value) {
	    BigInteger total = BigInteger.ONE;
	    for (int i = 0; value.compareTo(BigInteger.ONE) == 1; i++) {
	        total = total.multiply(value);
	        value = value.subtract(BigInteger.ONE);
	    }
	    System.out.println(total);
	    return total;
	}
	
	/*public static Double Factorial(Double n){
		
		
		Double v=n,fact=n;
		BigInteger q=new BigInteger(fact);
		do
		{
			fact=fact*(n-1);
			n--;
		}while(n>1);
		System.out.println(fact);
		return fact;
	}*/
public static void main(String[] args){
	BigInteger m,fact;
	BigInteger sum=new BigInteger("0");
	BigInteger b;
	Scanner w=new Scanner(System.in);
	System.out.print("Enter the no. : ");
    m=w.nextBigInteger();
    BigInteger c=new BigInteger("10");
    BigInteger a=new BigInteger("0");

    fact=projectEuler.Problem20.factorial(m);
    do{
    	b=fact.mod(c);
    //	b=fact%10;
    	fact=fact.subtract(b);
    //	fact=fact-b;
    	fact=fact.divide(c);
    //	fact=fact/10;
    	sum=sum.add(b);
    	//sum=sum+b;
    }while(fact.compareTo(a)>0);
    System.out.println(sum);
}
}
