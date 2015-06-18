package projectEuler;

import java.util.Scanner;

public class Problem14 {
	public static int Collatz(long n){
		
		int count=0;
		Scanner a=new Scanner(System.in);
		
		do
		{
			if(n%2==0)
			{
				n=n/2;
			//	System.out.print(","+n);
						
			}
			else 
			{
				n=3*n+1;
			//	System.out.print(","+n);
				
			}
			count++;
			
		}while(n>1);
		return count;
		
		
		//System.out.println();
		//System.out.println("Total count is : "+count);
	}
public static void main(String[] args){
	int c;
	int u;
	int max=1;
	long temp=1;

	for(long i=1;i<=999999;i++){
		u=projectEuler.Problem14.Collatz(i);
		if(u>max){
		max=u;
		temp=i;
		}
		
		
		
	}
	System.out.println("Max Count is "+max+" of : "+temp);
}
}
