package projectEuler;

import java.util.Scanner;

import PrimeNumber.PrimeNumber;

public class Problem7 {
	public static void main(String[] args){
		

	long a,b,count=0;
	int u;
	Scanner m= new Scanner(System.in);
	System.out.print("Enter The value of a :");
	a=m.nextLong();
	System.out.print("Enter The value of b :");
	b=m.nextLong();
	
	for(long i=a;i<=b;i++){
		u=PrimeNumber.test(i);
		
		if (u==0){
			if(count==10001)
			System.out.print(i);
			//System.out.print(" , ");
			count++;
		}
		else
			continue;
		
	}
	
}

}

