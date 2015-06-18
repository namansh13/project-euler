package projectEuler;

import java.util.Scanner;

public class Problem406 {
	public static void main(String[] arg){
	int n,m,temp;
	int a,b,sum=0;
	Scanner q= new Scanner(System.in);
	System.out.print("enter value of n :");
	n=q.nextInt();
	System.out.print("enter value of a :");
	a=q.nextInt();
	System.out.print("enter value of b :");
	b=q.nextInt();
	System.out.print("enter value of hidden number :");
	m=q.nextInt();
	//System.out.println(n/2);
	temp=n/2;
	if(n%2==0){
	do{
		if(temp<m){
		sum=sum+a;
		temp=temp+(n-temp)/2 ;
		}
		else if(temp>m){
			sum=sum+b;
			temp=temp-(n-temp)/2  ;
		}
		else{
			break;
		}
		System.out.println(n+" "+sum+" "+m);
	}while(temp!=m);
	}
	else{
		do{
			if(temp<m){
			sum=sum+a;
			temp=temp+(n-temp)/2 +1;
			}
			else if(temp>m){
				sum=sum+b;
				temp=temp-(n-temp)/2  ;
			}
			
			System.out.println(temp+" "+sum+" "+m);
		}while(temp!=m);
	}
	System.out.println(sum);
	}

}
