package projectEuler;

import java.util.Scanner;

public class Problem196 {
	public static void main(String[] args) {
		long[][] a = new long[1000][1000];
		long n = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				a[i][j] = n;
				n++;
			}
		}
		long sum;
		for (int i = 0; i < 10; i++) {
			sum=0;
			for (int j = 0; j < i; j++) {
		//		if (i > 0 && j > 0) {
					int l = PrimeNumber.PrimeNumber.test(a[i][j]);
					if (l == 0) {
						sum = sum + a[i][j];
		//			}
					}
					
					  if (a[i][j] < 10) { System.out.print(a[i][j] + "  "); }
					 else { System.out.print(a[i][j] + " "); } 
					 
					 
				

			}
			System.out.print("  "+sum);
			System.out.println();
		}
		/*
		 * Scanner q=new Scanner(System.in);
		 * System.out.print("Enter 1st number : "); long i=q.nextLong(); i=i-1;
		 * // System.out.print("Enter 2nd number : "); // long j=q.nextLong();
		 * long n1=((i+1)*i/2)+1; // long n2=((j+1)*j/2)-1; long sum1=0;
		 * for(long k=n1;k<=n1+i;k++){ int l=PrimeNumber.PrimeNumber.test(k); //
		 * System.out.println(k+" "+l); if(l==0){
		 * 
		 * sum1=sum1+k;
		 * 
		 * }
		 * 
		 * }
		 */
		// System.out.println(sum1);

	}

}
