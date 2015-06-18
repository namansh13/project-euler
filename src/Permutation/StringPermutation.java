package Permutation;

import java.math.BigInteger;
import java.util.Scanner;

public class StringPermutation {
	static int count;
	static long e;
	static long s;
	public static void main(String args[]) {
		s=System.currentTimeMillis();
		BigInteger a=new BigInteger("2");
		System.out.println(a.pow(38));
		System.out.print("Please enter the string : ");
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();
		
		permute(original);
		System.out.println(count);
		
	}

	public static void permute(String input) {
		int inputLength = input.length();
		boolean[] used = new boolean[inputLength];
		StringBuffer outputString = new StringBuffer();
		char[] in = input.toCharArray();
		//int i = doPermute(in, outputString, used, inputLength, 0);
		doPermute(in, outputString, used, inputLength, 0);
		
		// count++;

	}

	public static void doPermute(char[] in, StringBuffer outputString,
			boolean[] used, int inputLength, int level) {
		// count=0;
		// count++;
		if (level == inputLength) {
			System.out.println(outputString.toString());
			count++;
			/*if (count == 1000000) {
				System.out.println(outputString.toString());
				System.out.println(count);
				e=System.currentTimeMillis();
				System.out.println("Time taken : "+(e-s)+" ms");
			System.exit(level);	
			}*/
			//return 0;
		}

		for (int i = 0; i < inputLength; ++i) {
			// count++;

			if (used[i])
				continue;

			outputString.append(in[i]);
			used[i] = true;
			//count++;
			doPermute(in, outputString, used, inputLength, level + 1);
			used[i] = false;
			outputString.setLength(outputString.length() - 1);
		}
		//return ;

	}

}
