package PrimeNumber;

import java.util.Scanner;

public class LargestPrimeNumber {

	public static void main(String[] args){
		long a;
		int u;
		long k=0;
		Scanner m= new Scanner(System.in);
		System.out.print("Enter the value of Number :");
		a=m.nextLong();
			
		for(long i=2;i<=a;i++){
			u=PrimeNumber.test(i);
			if (u==0){
				k=i;
			}
			else
				continue;
			
		}
	System.out.println("Largest Prime Number is : "+k);	
	}

}
