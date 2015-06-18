package projectEuler;

import java.math.BigInteger;

public class Problem25 {
	public static int digit(BigInteger a){
		int count=0;
		BigInteger ten=new BigInteger("10");
		BigInteger zero=new BigInteger("0");
		BigInteger b;
		do{
			b=a.mod(ten);
			a=a.subtract(b);
			a=a.divide(ten);
			count++;
		}while(a.compareTo(zero)>0);
		System.out.println(count);
		return count;
	}
	public static void main(String[] ar){
		BigInteger fib=new BigInteger("1");
		BigInteger sum=new BigInteger("1");
		BigInteger a=new BigInteger("1");
		int temp=1;
		
		int count=0;
		int count1=0;
		do
		{
			a=sum;
			//a=sum;
		sum=sum.add(fib);
		//	sum=sum+fib;
			fib=a;
			
		//fib=a;
			count=projectEuler.Problem25.digit(sum);
			if(count==1000)
			{
				temp=count1;
				break;
			}
			count1++;
			
			System.out.println(sum+" "+(count1+2));
		}while(count1<12000);
	System.out.println(temp);
	}

}


