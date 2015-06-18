package rough;

import java.util.Scanner;

public class Problem35 {
public static void main(String[] args){
	int n,b;
	Scanner q=new Scanner(System.in);
	System.out.print("Enter the number : ");
	n=q.nextInt();
	int d=n;
	do{
		b=n%10;
		n=n-b;
		n=n/10;
		n=10000*b+n;
		System.out.println(n);
	}while(n!=d);
}
}
