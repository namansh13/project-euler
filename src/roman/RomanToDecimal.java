package roman;

import java.util.Scanner;

public class RomanToDecimal {
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		String s = q.next();
		int sum;
		sum = roman.RomanToDecimal.number(s);
		System.out.println(sum);
	}

	public static int number(String s) {
		int n = 0;
		int i = 0, sum = 0;
		int z = s.length();
		do {
			if (s.charAt(i) == 'M') {
				n = 1000;
			}
			if (s.charAt(i) == 'D') {
				n = 500;
			}

			if (s.charAt(i) == 'C') {
				if (i + 1 < z) {
					if (s.charAt(i + 1) == 'M') {
						n = 900;
						i++;
					} else if (s.charAt(i + 1) == 'D') {
						n = 400;
						i++;
					}

					else {
						n = 100;
					}
				}
				else{
					n=100;
				}
			}

			if (s.charAt(i) == 'L') {
				n = 50;
			}
			if (s.charAt(i) == 'X') {
				if (i + 1 < z) {
					if (s.charAt(i + 1) == 'C') {
						n = 90;
						i++;
					} else if (s.charAt(i + 1) == 'L') {
						n = 40;
						i++;
					} else {
						n = 10;

						// System.out.println("he");
					}
				} else {
					n = 10;
				}
			}
			if (s.charAt(i) == 'V') {
				n = 5;
			}
			if (s.charAt(i) == 'I') {
				if (i + 1 < z) {
					if (s.charAt(i + 1) == 'V') {
						n = 4;
						i++;
					} else if (s.charAt(i + 1) == 'X') {
						n = 9;
						i++;
					} else {

						n = 1;

					}
				} else {
					n = 1;
				}
			}
			sum = sum + n;

			i++;
			// System.out.println(n + " " + i);

		} while (i < z);
		return sum;
		// System.out.println(sum);
	}

}
