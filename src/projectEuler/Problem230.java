package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem230 {
	public static void main(String[] args){
		Scanner q=new Scanner(System.in);
		String a,b;
		int m,i=1;
		//double n=20;
		//double n=(127+19*17)+Math.pow(7, 17);
		BigInteger n;
		BigInteger a1=new BigInteger("127");
		BigInteger a2=new BigInteger("19");
		BigInteger a3=new BigInteger("17");
		BigInteger a4=new BigInteger("7");
		n=(a2.multiply(a3).add(a1)).multiply(a4.pow(17));
		System.out.println(n);
		System.out.print("Enter string a : ");
		a=q.next();
		System.out.print("Enter String b : ");
		b=q.next();
		System.out.print("Enter element no : ");
		m=q.nextInt();
		String[] s=new String[10000];
		s[0]=a;
		s[1]=b;
		do{
			i++;
			s[i]=s[i-2]+s[i-1];
			//i++;
		}while(s[i].length()<n);
		
		
		System.out.println(charAt(s,m,n));
	}
	
	
	
	
	
	public static char charAt(String[] s, int m,double n) {
		//String a,b;
		
		//int n=10;
		//int m;
		char c = 0;
		//String[] s=new String[n];
		int i=2,j=0;
		
		
		/*System.out.print("Enter string a : ");
		a=q.next();
		System.out.print("Enter String b : ");
		b=q.next();
		System.out.print("Enter element no : ");
		m=q.nextInt();*/
		/*s[0]=a;
		s[1]=b;
		do{
			s[i]=s[i-2]+s[i-1];
			i++;
		}while(i<n);*/
		
		/*for(int e=0;e<n;e++){
			System.out.println(s[e]);
		}*/
		i=0;
		do{
			if(s[i].length()>=m){
			//System.out.println("Char at : "+s[i].charAt(m-1));
				c=s[i].charAt(m-1);
				break;
			}
			i++;
		}while(i<n);
		//System.out.println("Char at : "+m+" is "+c);
		return c;
	}

}
