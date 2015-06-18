package rough;

import java.util.Scanner;


public class Main {
public static void main(String[]args) throws NumberFormatException, Exception{
	java.io.BufferedReader r = new java.io.BufferedReader
	(new java.io.InputStreamReader (System.in));
	long n=Integer.parseInt(r.readLine());
	System.out.println(xyz(n));
	
	
	/*Scanner q=new Scanner(System.in);
	while(q.hasNext()){
		long n=Integer.parseInt(q.next());
		System.out.println(xyz(n));
	}*/
	/*while(r.readLine()!=null){
		System.out.println(r.readLine());
	}
*/	/*int n=Integer.parseInt(r.readLine());
	if((n/2)+(n/3)+(n/4)>=n)
	System.out.println((n/2)+(n/3)+(n/4));
	else
	System.out.println(n);
	}*/
}
public static long xyz(long n)
	
{
	System.out.println(n);
	if(n==0){
		return n;
	}
	long sum=xyz(n/2)+xyz(n/3)+xyz(n/4);
	
	if(sum>=n)
		return sum;
	return n;
		
}
}

/*13
9244998
248604
745745845
1000000000
10378474
672523451
12793817
12793817
245756745*/