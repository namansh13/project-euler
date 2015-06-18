package projectEuler;

import java.util.Scanner;

public class Problem37 {
public static void main(String[] args){
	int n=10,s=0,sum=0;
	Scanner q= new Scanner(System.in);
	//System.out.println("Enter the number : ");
	//n=q.nextInt();
	do{
	int d=n;
	int count=0,count1=0,count2=0,count3=0;
	do{
		int b=d%10;
		d=d-b;
		d=d/10;
		count++;
	}while(d>0);
	d=n;
	int r=count;
	do{
		int m=PrimeNumber.PrimeNumber.test(d);
		if(m==0){
			int b=(int) (n%(Math.pow(10, (r-1))));
			d=b;
			count3++;
		}
		count2++;
		r--;
		}while(count2<count);
	d=n;
	do{
		int m=PrimeNumber.PrimeNumber.test(d);
		if(m==0){
		//	System.out.println(d);
		int b=d%10;
		d=d-b;
		d=d/10;
		count1++;
		
		}
		else{
			break;
		}
	}while(d>0);
	
	if(count1==count&&count==count3){
		sum=sum+n;
		System.out.println(n);
		s++;
	}
	n++;
	}while(n<1000000);
	System.out.println(sum);
}
}
