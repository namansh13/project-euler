package roman;

import java.util.Scanner;

public class Roman {
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the no. : ");
		int n = q.nextInt();
		String s=roman.Roman.roman(n);
		System.out.println(s);

	}
	public static String roman(int n){
		String s = "";
	/*	if(n/1000>4){
			s=s.concat("V");
			n=n%1000;
		}
		if (n / 1000 > 3) {
			
				s = s.concat("IV");
			
			n = n % 1000;
		}*/
		if (n / 1000 > 0) {
			for (int i = 0; i < n / 1000; i++) {
				s = s.concat("M");
			}
			n = n % 1000;
		}
		if (n / 500 > 0) {
			if (n / 100 > 8) {
				s = s.concat("CM");
				n = n % 100;
			} else {
				for (int i = 0; i < n / 500; i++) {
					s = s.concat("D");
				}
				n = n % 500;
			}
		}
		if (n / 100 > 0) {
			if (n / 100 > 3) {
				s = s.concat("CD");
			} else {
				for (int i = 0; i < n / 100; i++) {
					s = s.concat("C");
				}
			}
			n = n % 100;
		}
		if (n / 50 > 0) {
			if (n / 10 > 8) {
				s = s.concat("XC");
				n = n % 10;
			} else {
				for (int i = 0; i < n / 50; i++) {
					s = s.concat("L");
				}
				n = n % 50;
			}
		}
		if (n / 10 > 0) {
			if (n / 10 > 3) {
				s = s.concat("XL");
			} else {
				for (int i = 0; i < n / 10; i++) {
					s = s.concat("X");
				}
			}
			n = n % 10;
		}
		if (n / 5 > 0) {
			if (n % 5 > 3) {
				s = s.concat("IX");
				n = 0;
			} else {
				for (int i = 0; i < n / 5; i++) {
					s = s.concat("V");
				}
			}

			n = n % 5;

		}

		if (n % 5 > 3) {
			s = s.concat("IV");
		} else {
			for (int i = 0; i < n; i++) {
				s = s.concat("I");

			}
		}
		return s;
		//System.out.println(s);
		
	}
}
