package projectEuler;

import java.util.Scanner;

public class Problem63 {
	public static void main(String[] args) {
		int count = 0;
		long s,e;
		e=System.currentTimeMillis();
		Scanner q = new Scanner(System.in);
		// System.out.print("Enter value of n : ");
		// n=q.nextInt();
		// for(int i=(int) Math.pow(10, n-1);i<Math.pow(10, n);i++){
		for (int n = 1; n < 10000; n++) {
			for (int i = 1; i < 10; i++) {
				if (Math.pow(i, n) >= Math.pow(10, n - 1)
						&& Math.pow(i, n) < Math.pow(10, n)) {
					//System.out.println(i + " " + n + " " + Math.pow(i, n));
					count++;
				}
			}
		}
		System.out.println(count);
		s=System.currentTimeMillis();
		System.out.println(s-e);

	}
}
