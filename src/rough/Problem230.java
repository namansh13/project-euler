package rough;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem230 {
	public static void main(String[] args) throws IOException{
		Scanner q=new Scanner(System.in);
		String a,b;
		int m,i;
		double n=200000000;
		//double n=(127+19*17)+Math.pow(7, 17);
		//BigInteger n;
		BigInteger a1=new BigInteger("127");
		BigInteger a2=new BigInteger("19");
		BigInteger a3=new BigInteger("17");
		BigInteger a4=new BigInteger("7");
		//n=(a2.multiply(a3).add(a1)).multiply(a4.pow(17));
		System.out.println(n);
		
		System.out.print("Enter string a : ");
		a=q.next();
		System.out.print("Enter String b : ");
		b=q.next();
		System.out.print("Enter element no : ");
		m=q.nextInt();
		//BigInteger[] s=new BigInteger[10000];
		String[] s=new String[(int) n];
		//s[0]=new BigInteger(a);
		//s[1]=new BigInteger(b);
		s[0]=a;
		s[1]=b;
		i=1;
		StringWriter stringWriter = new StringWriter();
		BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
		
		do{
			i++;
			//s[i]=s[i-2]+s[i-1];
			bufferedWriter.write(s[i-2]+s[i-1]);
			//s[i]=new BigInteger(s[i-2].toString()+s[i-1].toString());
			bufferedWriter.
		}while(s[i].length()<n);
		System.out.println(s[i].toString().length());
		
		
		// perform write operations
		/*bufferedWriter.write(str1);
		bufferedWriter.newLine();
		bufferedWriter.write(str2);
		bufferedWriter.newLine();
		bufferedWriter.write(str3);*/
		
		
		
		
		
	//	System.out.println(charAt(s,m,n));*/
	}
	
	
}
