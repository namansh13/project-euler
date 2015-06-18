package projectEuler;

import java.math.BigInteger;

public class Problem48 {
public static void main(String[] args ){
	BigInteger sum=new BigInteger("0");
	BigInteger a,k;
	BigInteger c=new BigInteger("1");
	BigInteger d=new BigInteger("1000");
	BigInteger e=new BigInteger("0");
	a=c;
	int i=1;
	do
	{
		//System.out.println(i+" "+a+" "+c);
		k=a.pow(i);
		sum=sum.add(k);
		a=a.add(c);
		i++;
			}while(i<=1000);
	System.out.println(sum);
}
}
