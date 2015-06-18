package projectEuler;

import java.util.Scanner;

public class Problem24 {
public static void main(String[] args){
	Scanner q=new Scanner(System.in);
	System.out.print("Enter the no : ");
	long n=q.nextLong();
	long[] a=new long[10];
	long d=n;
	int i=0;
	do{
		long b=d%10;
		d=d-b;
		d=d/10;
		a[i]=b;
		i++;
	}while(d>0);
	for(int j=0;j<i;j++){
		System.out.print(a[j]);
	}

}
}
