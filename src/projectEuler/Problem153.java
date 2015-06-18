package projectEuler;

import java.util.Scanner;

public class Problem153 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		int n;
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = q.nextInt();
		int count = 0;
		long sum = 0;
		long sum1 = 0;
		for (int x = 1; x <= n; x++) {
			System.out.println();
			System.out.println(x);
			System.out.println();
			sum = 0;
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					System.out.println(i);
					count++;
					sum = sum + i;
				}
				int a = 0;
				for (int j = 1; j < x / 2; j++) {
					int b = i * i + j * j;
					if (x % b == 0 || b % x == 0) {
						if (x * Math.min(i, j) % b == 0) {
							if (j != i) {
								sum = sum + 2 * (i + j);
								System.out.println(i + " + " + j + "i");
								System.out.println(i + " - " + j + "i");
								System.out.println(j + " + " + i + "i");
								System.out.println(j + " - " + i + "i");
							} else {
								System.out.println(i + " + " + j + "i");
								System.out.println(i + " - " + j + "i");
								count = count + 2;
								sum = sum + i * 2;
								a = 0;
							}
						}
					}
					a=j;
				}
				a++;
				if(x%(i*i+a*a)==0){
					sum=sum+a*2;
				}
			}
			sum1 = sum1 + sum;
		}
		System.out.println("Total count : " + count);
		System.out.println("Sum : " + sum1);
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d s", (e - s) / 1000);
	}
}
