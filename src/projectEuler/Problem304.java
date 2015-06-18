package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem304 {
	public static void main(String... args) {
		long e, s;
		BigInteger sum=new BigInteger("0");
		BigInteger mod=new BigInteger("1234567891011");
		
		s = System.currentTimeMillis();
		long n = 100000000000000L;
		Problem304 a = new Problem304();
		//System.out.println(a.fibonacci(100,1,0));
		//System.out.println(a.nextPrime(n));
		int b;
		Scanner q=new Scanner(System.in);
		//System.out.print("Enter value of b : ");
		//b=q.nextInt();
		
		for(int i=1;i<=1000;i++){
			System.out.println(i+" "+n);
			//System.out.println(i+" "+a.fibonacci(n));
			//sum=sum.add(a.fibonacci(n));
			//System.out.println(i+" "+a.fibonacci(a.nextPrime(n),1,0));
			n=a.nextPrime(n);
		}
		//System.out.println(a.fibonacci(8));
		System.out.println("Sum mod 1234567891011  : "+sum.mod(mod));
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d ms", (e - s));
	}

	

	long nextPrime(long n) {
		long p = n + 1;
		while (PrimeNumber.PrimeNumber.test(p) != 0) {
			p++;
		} 
		return p;
	}
	BigInteger fibonacci(long n){
		BigInteger sum=new BigInteger("0");
		BigInteger a=new BigInteger("0");
		BigInteger b=new BigInteger("1");
		/*long sum=0;
		long a=0,b=1;*/
		long k=0;
		do{
			//System.out.println(sum);
			sum=a.add(b);
			a=b;
			b=sum;
			k++;
			
			
		}while(k<n);
		return sum;
	}
	
	
	long fibonacci(long term, long val, long prev )
		{
		//System.out.println(val);
	 if(term == 0) return prev;
	 if(term == 1) return val;
	 return fibonacci(term - 1, val+prev, val);
	}
}
