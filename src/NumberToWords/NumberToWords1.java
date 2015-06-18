package NumberToWords;

import java.util.Scanner;

public class NumberToWords1 {
public static void main(String[] args){
	int n;
	int b,count=0,c=0,k=0,l=0;
	String num="",a="";
	Scanner q=new Scanner(System.in);
	System.out.print("Enter the number : ");
	n=q.nextInt();
	do
	{
		b=n%10;
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
				}
		
			else
			{
				count=0;
				c++;
			}
				if(c==1){
					
				}
		}while(n>0);
			
}
}
