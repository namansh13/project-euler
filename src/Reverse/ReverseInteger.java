package Reverse;

import java.util.*;

public class ReverseInteger {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);

		int a;
		int b;
		int c = 0;
		System.out.print("enter Value of a : ");
		a = x.nextInt();
		do {
			b = a % 10;
			a = a - b;
			a = a / 10;
			c = c * 10 + b;

		} while (a > 0);
		System.out.println(c);
	}

}
