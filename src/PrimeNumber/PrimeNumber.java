package PrimeNumber;

import java.util.*;

public class PrimeNumber {

	public static int test(long n) {
		int count = 0;
		if (n == 0 || n == 1 || n < 0) {
			count = 1;

			return count;

		}  else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					count = count + 1;
					break;
				}
			}

			return count;
		}
	}

	public static void main(String[] args) {
		long n;
		int count;

		Scanner q = new Scanner(System.in);
		System.out.print("Enter the no : ");
		n = q.nextLong();
		int[] a = new int[1000];
		/*
		 * if(n==1||n==0){ System.out.println("Number is not Prime");
		 * 
		 * }
		 */

		count = PrimeNumber.test(n);
		if (count == 1)
			System.out.println("Number is not prime");
		else
			System.out.println("Number is prime");
		/*
		 * a=PrimeNumber.allprime(); for(int i=0;i<10;i++){
		 * 
		 * System.out.println(a[i]); }
		 */

	}

	public static int[] allprime() {
		int[] a = new int[10000];
		int i = 0, j = 1;
		do {
			int c = PrimeNumber.test(j);
			if (c == 0) {
				a[i] = j;
				i++;

			}
			j++;
		} while (j < a.length);

		return a;
	}
}
