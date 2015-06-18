package DecimalConversion;

import java.math.BigInteger;
import java.util.Scanner;

public class DecimalToBinary {
	public static BigInteger main(BigInteger n){
		Scanner scan=new Scanner(System.in);
		BigInteger b,m;
	//	BigInteger n;
		BigInteger c=new BigInteger("0");
	//	BigInteger count=new BigInteger("0");
		int count=0;
		BigInteger binary=new BigInteger("0");
		BigInteger zero=new BigInteger("0");
		BigInteger two=new BigInteger("2");
		BigInteger ten=new BigInteger("10");
		BigInteger one=new BigInteger("1");
	//	long c=0,count=0,binary=0;
	//	System.out.print("Enter the number : ");
	//	n=scan.nextBigInteger();
		BigInteger r=n;
	do
	{
			b=n.mod(two);
			n=n.divide(two);
			c=c.multiply(ten).add(b);
			count++;
			
			//n=n/2;
			//c=c*10 +b;
			//count=count+1;
			
		
		}while(n.compareTo(zero)>0);
//		System.out.println(c);
	for(int k=0;k<count;k++)
	
	
	{
		m=c.mod(ten);
		c=c.subtract(m);
		c=c.divide(ten);
		binary=binary.multiply(ten).add(m);
		
		
		/*m=c%10;
		c=c-m;
		c=c/10;
		binary=binary*10 + m;*/
	}
	return binary;
//	System.out.print("Binary of "+r+" is "+binary);
	}

}
