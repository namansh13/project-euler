package NumberToWords;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the number : ");
		long n, b, z;
		long k = 0, l = 0;
		long count = -1, c = -1;
		z = q.nextLong();
		String num = "", a = "";
		do {
			b = z % 10;
			n = z - b;
			z = z / 10;
			count++;
			c++;
			System.out.println(count+" "+c);
			if (count == 0) {

				k = b;
				if (b == 1)
					num = "One";
				if (b == 2)
					num = "Two";
				if (b == 3)
					num = "Three";
				if (b == 4)
					num = "Four";
				if (b == 5)
					num = "Five";
				if (b == 6)
					num = "Six";
				if (b == 7)
					num = "Seven";
				if (b == 8)
					num = "Eight";
				if (b == 9)
					num = "Nine";
				a = num.concat(a);
				a=" ".concat(a);
			} else if (count == 1) {
				l = b;
				 if (b == 0)
						a = num.concat("");
				 		a=" ".concat(a);
				if (b == 1) {

					if (k == 0)
						num = "Ten";
					if (k == 1)
						num = "Eleven";

					if (k == 2)
						num = "Twelve";

					if (k == 3)
						num = "Thirteen";
					if (k == 4)
						num = "Fourteen";
					if (k == 5)
						num = "Fifteen";
					if (k == 6)
						num = "Sixteen";
					if (k == 7)
						num = "Seventeen";
					if (k == 8)
						num = "Eighteen";
					if (k == 9)
						num = "Nineteen";
					a = num.concat("");
					a=" ".concat(a);
					continue;

				}

				if (b == 2)
					num = "Twenty-";
				if (b == 3)
					num = "Thirty-";
				if (b == 4)
					num = "Forty-";
				if (b == 5)
					num = "Fifty-";
				if (b == 6)
				
					num = "Sixty-";
				if (b == 7)
					num = "Seventy-";
				if (b == 8)
					num = "Eighty-";
				if (b == 9)
					num = "Ninety-";
				
				
				
					
				
				a = num.concat(a);
				a=" ".concat(a);
			} else  if(count==2) {
				
				
					if (b == 1)
						num = "One Hundred";
					if (b == 2)
						num = "Two Hundred";
					if (b == 3)
						num = "Three Hundred";
					if (b == 4)
						num = "Four Hundred";
					if (b == 5)
						num = "Five Hundred";
					if (b == 6)
						num = "Six Hundred";
					if (b == 7)
						num = "Seven Hundred";
					if (b == 8)
						num = "Eight Hundred";
					if (b == 9)
						num = "Nine Hundred";
			//		if(l==0){
			//		a=	num.concat("");
			//		}
				
					a = num.concat(a);
					a=" ".concat(a);
				
				
			}
			else{
				count = 0;
				if (c > 2&&c<5) {
					
					
					a = " Thousand".concat(a);
					if (b == 1)
						num = "One";
					if (b == 2)
						num = "Two";
					if (b == 3)
						num = "Three";
					if (b == 4)
						num = "Four";
					if (b == 5)
						num = "Five";
					if (b == 6)
						num = "Six";
					if (b == 7)
						num = "Seven";
					if (b == 8)
						num = "Eight";
					if (b == 9)
						num = "Nine";
					a = num.concat(a);
					a=" ".concat(a);
				//	continue;
					
				}
				else if(c>=5&&c<8){
					a=" Million".concat(a);
					if (b == 1)
						num = "One";
					if (b == 2)
						num = "Two";
					if (b == 3)
						num = "Three";
					if (b == 4)
						num = "Four";
					if (b == 5)
						num = "Five";
					if (b == 6)
						num = "Six";
					if (b == 7)
						num = "Seven";
					if (b == 8)
						num = "Eight";
					if (b == 9)
						num = "Nine";
					a = num.concat(a);
					a=" ".concat(a);
				//	continue;
				}
				else if(c>=8){
					a=" Billion".concat(a);
					if (b == 1)
						num = "One";
					if (b == 2)
						num = "Two";
					if (b == 3)
						num = "Three";
					if (b == 4)
						num = "Four";
					if (b == 5)
						num = "Five";
					if (b == 6)
						num = "Six";
					if (b == 7)
						num = "Seven";
					if (b == 8)
						num = "Eight";
					if (b == 9)
						num = "Nine";
					a = num.concat(a);
					a=" ".concat(a);
				//	continue;
				}
			}
			
		/*	if (count == 1 && b == 1)
			
				a = num.concat("");
			else if (count == 1 && b == 0)
				a = num.concat("");
			else
				a = num.concat(a);
			a = " ".concat(a);*/
			
		/*	if (c == 1) {

				a = "thousand".concat(a);

				continue;
				// num="Thousand";
			}*/


		} while (n > 0);

		System.out.println(a.trim());

	}
	
	/*
	 * public static void main(String[] args) { String cal = ""; for (int i = 1;
	 * i <=1; i++) { cal = cal.concat(calc(i));
	 * 
	 * } int l = cal.length(); System.out.println(cal); System.out.println(l); }
	 */
}
