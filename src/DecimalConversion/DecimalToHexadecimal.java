package DecimalConversion;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		long n, b;
		int c = 0;
		char s = 0, d = 0;
		long[] h = new long[100];
		int count = 0;
		System.out.print("Enter the number : ");
		n = scan.nextInt();
		long r = n;
		do {
			b = n % 16;
			if (b <= 9) {
				h[c] = b;
			} else {
				if (b == 10)
					s = 'A';
				if (b == 11)
					s = 'B';
				if (b == 12)
					s = 'C';
				if (b == 13)
					s = 'D';
				if (b == 14)
					s = 'E';
				if (b == 15)
					s = 'F';
				h[c] = s;
			}
			n = n / 16;
			count = count + 1;
			c++;
		} while (n >= 1);
		System.out.print("Hex of " + r + " is : ");
		for (int k = count - 1; k >= 0; k--) {
			if (h[k] <= 9) {
				System.out.print(h[k]);
			} else {
				if (h[k] == 65)
					d = 'A';
				if (h[k] == 66)
					d = 'B';
				if (h[k] == 67)
					d = 'C';
				if (h[k] == 68)
					d = 'D';
				if (h[k] == 69)
					d = 'E';
				if (h[k] == 70)
					d = 'F';
				System.out.print(d);
			}
		}
	}
}