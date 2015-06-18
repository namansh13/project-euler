package PrimeNumber;
import java.util.*;
public class PrimeNumbersBetween {
	public static void main(String[] args){
		long e,st;
		st=System.currentTimeMillis();
		long a,b,count=0,s=0;
		int u;
		Scanner m= new Scanner(System.in);
		System.out.print("Enter The value of a :");
		a=m.nextLong();
		System.out.print("Enter The value of b :");
		b=m.nextLong();
		
		for(long i=a;i<=b;i++){
			u=PrimeNumber.test(i);
			
			if (u==0){
				s=s+i;
			//	System.out.print(i);
				//System.out.print(" , ");
				
			}
			else
				continue;
			
		}
		System.out.println(s);
		e=System.currentTimeMillis();
		System.out.printf("Total time taken : %d s",(e-st)/1000);
	}

}
