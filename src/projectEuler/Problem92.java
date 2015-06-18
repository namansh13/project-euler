package projectEuler;

import java.util.Scanner;

public class Problem92 {
public static void main(String[] args){
	long s,e;
	s=System.currentTimeMillis();
	long n,d;
	
/*	Scanner q=new Scanner(System.in);
	System.out.print("Enter the no : ");
	n=q.nextLong();*/
	n=1;
	long sum;
/*	do{
		d=n;
		sum=0;
		if(d==89){
			break;
		}
		else{
			d=Problem92.square(d);
		}
	System.out.println(sum);
	n++;
	}while();
//	System.out.println(sum+" "+n);*/
	//System.out.println(square(145));
	long count=0;
	do{
		long g=square(n);
		if(g==0){
			count++;
		}
		n++;
	}while(n<10000000);
	System.out.println(count);
	e=System.currentTimeMillis();
	System.out.println(e-s);
	
}

public static long square(long n){
	long sum=0;
	do{
		int b=(int) (n%10);
		n=n-b;
		n=n/10;
		sum=sum+b*b;
		
	}while(n>0);
	//System.out.println(sum);
	if(sum==1){
		return 1;
	}
	else if(sum==89){
		return 0;
	}
	
	long g=square(sum);
	return g;
	
}
}
