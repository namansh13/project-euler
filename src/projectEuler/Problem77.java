package projectEuler;

import java.util.Scanner;

public class Problem77 {
public static void main(String[] args){
	int n,i=2;
	Scanner q=new Scanner(System.in);
	System.out.print("Enter value of no : ");
	n=q.nextInt();
	//System.out.println(factors(n));
	factors(n);
	do{
		int o=PrimeNumber.PrimeNumber.test(i);
		if(o==0){
			factors(i);
			if(PrimeNumber.PrimeNumber.test(n-i)==0){
				System.out.println(n+"="+i+"+"+(n-i));
				//return i;
			}
			
		}
	}while(i<n/2);
	
}
public static void factors(int n){
	int i=2;
	do{
	int o=PrimeNumber.PrimeNumber.test(i);
	if(o==0){
		if(PrimeNumber.PrimeNumber.test(n-i)==0){
			System.out.println(n+"="+i+"+"+(n-i));
			//return i;
		}
	}
	i++;
}while(i<=n/2);
//return 0;	
	
}
}
