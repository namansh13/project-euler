package DecimalConversion;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		long n,b,m;
		long c=0,count=0,binary=0;
		System.out.print("Enter the number : ");
		n=scan.nextLong();
		long r=n;
	do
	{
			b=n%8;
			n=n/8;
			c=c*10 +b;
			count=count+1;
			
		
		}while(n>=1);
	
	for(int k=0;k<count;k++)
	{
		m=c%10;
		c=c-m;
		c=c/10;
		binary=binary*10 + m;
	}
	System.out.print("Octal of "+r+" is "+binary);
	}

}


