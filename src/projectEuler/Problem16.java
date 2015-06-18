package projectEuler;

import java.math.BigInteger;


public class Problem16 {
public static void main(String[] args){
	
	BigInteger b;
	BigInteger s=new BigInteger("2");
	int y=1000;
	s=s.pow(y);

	BigInteger sum=new BigInteger("0");
	BigInteger c=new BigInteger("10");
	BigInteger k=new BigInteger("1");
	
	System.out.println(s);

	int count=0;
	do{
		b=s.mod(c);
		sum=sum.add(b);
		s=s.subtract(b);
		s=s.divide(c);
		
		
		count++;
	}while(s.compareTo(k)>=0);
	
	System.out.println(sum);
	System.out.println(count);
	
}
}
