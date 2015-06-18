package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem13 {
public static void main(String[] args){
	BigInteger[] a;
	BigInteger b;
	BigInteger sum=new BigInteger("0");
	BigInteger c=new BigInteger("0");
	BigInteger d=new BigInteger("10");
	BigInteger e=new BigInteger("0");
	BigInteger f=new BigInteger("0");
	
	int count=0;
	a=new BigInteger[100];
	Scanner q=new Scanner(System.in);
	for(int i=0;i<100;i++){
		//System.out.print("Enter the "+i+" number : ");
		a[i]=q.nextBigInteger();
	
	}
	for(int i=0;i<100;i++){
		sum=sum.add(a[i]);
	}
	System.out.println("Sum : "+sum);
	int u=projectEuler.Problem25.digit(sum);
	do{
			b=sum.mod(d);
			sum=sum.subtract(b);
			sum=sum.divide(d);
			e=e.multiply(d);
			e=e.add(b);
			f=f.add(b);
			count++;
		}while(count<=9);
		/*do{
			b=e.mod(d);
			e=e.subtract(b);
			e=e.divide(d);
		//	f=f.add(b);
		//	count++;
		}while(count<=9);*/
	System.out.println(f+" "+count);
	
	int y=projectEuler.Problem25.digit(a[1]);
	System.out.println(u+" "+y);
}
}
