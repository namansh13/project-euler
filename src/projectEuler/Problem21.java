package projectEuler;

import java.util.Scanner;

public class Problem21 {
	public static int factor(int a){
	//	int a;
		int sum=0;
		Scanner q=new Scanner(System.in);
	//	System.out.print("Enter the no : ");
	//	a=q.nextInt();
		for(int i=1;i<=a/2;i++){
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	return sum;
	}
	public static void main(String[] args){
int sum=0,u;
for(int i=1;i<=10000;i++){
	u=projectEuler.Problem21.factor(i);
	if(projectEuler.Problem21.factor(u)==i&&u!=i){
		sum=sum+i;
	}
}
	System.out.println("Sum is : "+sum);
	}

}
