package rough;

import java.util.Scanner;

public class Problem37 {
public static void main(String[] args){
	int n;
	Scanner q=new Scanner(System.in);
	System.out.print("Enter the number : ");
	n=q.nextInt();
	int count=0,count1=0;
	int d=n;
	do{
		int b=d%10;
		d=d-b;
		d=d/10;
		count++;	
	}while(d>0);
	int r=count;
	do{
		int m=PrimeNumber.PrimeNumber.test(n);
		if(m==0){
		System.out.println(n);
		int b=(int) (n%(Math.pow(10, (r-1))));
	//	System.out.println(b);
		n=b;
		}
		count1++;
		r--;
		
	}while(count1<count);
	
}
}
