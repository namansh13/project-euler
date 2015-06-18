package NumberToWords;

import java.util.Scanner;

public class Changes {
	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		int n, b;
		int k = 0, l = 0;
		int count = 0;
		String num = "", a = "";
		int z, r,s;
		System.out.print("Enter the value of number : ");
		z = temp.nextInt();
		r = z;
		do {
			b = z % 10;

			if (count == 0) {

				k = b;
				if (b == 1)
					num = "one";
				if (b == 2)
					num = "two";
				if (b == 3)
					num = "three";
				if (b == 4)
					num = "four";
				if (b == 5)
					num = "five";
				if (b == 6)
					num = "six";
				if (b == 7)
					num = "seven";
				if (b == 8)
					num = "eight";
				if (b == 9)
					num = "nine";
			} else if (count == 1) {
				l = b;
				if (b == 1) {

					if (k == 0)
						num = "ten";
					if (k == 1)
						num = "eleven";

					if (k == 2)
						num = "twelve";

					if (k == 3)
						num = "thirteen";
					if (k == 4)
						num = "fourteen";
					if (k == 5)
						num = "fifteen";
					if (k == 6)
						num = "sixteen";
					if (k == 7)
						num = "seventeen";
					if (k == 8)
						num = "eighteen";
					if (k == 9)
						num = "nineteen";

				}

				if (b == 2)
					num = "twenty";
				if (b == 3)
					num = "thirty";
				if (b == 4)
					num = "forty";
				if (b == 5)
					num = "fifty";
				if (b == 6)
					num = "sixty";
				if (b == 7)
					num = "seventy";
				if (b == 8)
					num = "eighty";
				if (b == 9)
					num = "ninety";
			} else if (count == 2) {
				s=b;
				if (k == 0 && l == 0) {
					
					if (b == 1)
						num = "onehundred";
					if (b == 2)
						num = "twohundred";
					if (b == 3)
						num = "threehundred";
					if (b == 4)
						num = "fourhundred";
					if (b == 5)
						num = "fivehundred";
					if (b == 6)
						num = "sixhundred";
					if (b == 7)
						num = "sevenhundred";
					if (b == 8)
						num = "eighthundred";
					if (b == 9)
						num = "ninehundred";
				} else {
					if (b == 1)
						num = "onehundredand";
					if (b == 2)
						num = "twohundredand";
					if (b == 3)
						num = "threehundredand";
					if (b == 4)
						num = "fourhundredand";
					if (b == 5)
						num = "fivehundredand";
					if (b == 6)
						num = "sixhundredand";
					if (b == 7)
						num = "sevenhundredand";
					if (b == 8)
						num = "eighthundredand";
					if (b == 9)
						num = "ninehundredand";
				}
			} else {
				if (b == 1)
					num = "onethousand";
				if (b == 2)
					num = "twothousand";
				if (b == 3)
					num = "threethousand";
				if (b == 4)
					num = "fourthousand";
					
				if (b == 5)
					num = "fivethousand";
				if (b == 6)
					num = "sixthousand";
				if (b == 7)
					num = "seventhousand";
				if (b == 8)
					num = "eightthousand";
				if (b == 9)
					num = "ninethousand";
			}

			n = z - b;
			z = z / 10;
			if (count == 1 && b == 1)
				a = num.concat("");
			else if (count == 1 && b == 0)
				a = num.concat("");
			else if (count==2&&b==0)
			{
				count++;
				continue;
			}
				else
				a = num.concat(a);
				a=" ".concat(a);
			count++;

		} while (n > 0);

		System.out.println(r + " In words : " + a);

	}
}
