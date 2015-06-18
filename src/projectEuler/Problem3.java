package projectEuler;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		long s=System.currentTimeMillis(),e,t;
		long m = 0;
		long num;
		Scanner f = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		num = f.nextLong();
		for (long i = 2; i <10000; i++) {
			int k = PrimeNumber.PrimeNumber.test(i);
			if (k == 0) {
				if (num % i == 0) {
					m = i;
					//System.out.println(i);
				}
			}
		}
		System.out.println("Largest Prime Factor is " + m);
		e=System.currentTimeMillis();
		System.out.println((e-s));
	}

}
