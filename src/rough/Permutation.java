package rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Permutation {

	public static int counter = 0;
	public static List<Integer> q=new ArrayList<Integer>();
	public static void Permute(int[] input, int startindex) {
		int size = input.length;
		System.out.println(size+" "+(startindex+1));
		//String[] s = new String[1000000];
		if (size == startindex + 1) {
			long c = 0;
			for (int i = 0; i < size; i++) {
				c = c * 10 + input[i];
			}
			// System.out.println(c);
			// int d=PrimeNumber.PrimeNumber.test(c);
			/*
			 * if(d==0){ System.out.println(c); System.out.println();
			 * System.out.println(""); }
			 */

		//	System.out.print((counter + 1) + " Permutation is : ");
			int k = 0;
			for (int i = 0; i < size; i++) {
				k = k * 10 + input[i];

				// System.out.print(input[i]);
			}
			q.add(k);
			//System.out.println(k);
			// System.out.println();
			// System.out.println("");

			counter++;
		}

		else {
			for (int i = startindex; i < size; i++) {

				int temp = input[i];
				input[i] = input[startindex];
				input[startindex] = temp;
				//System.out.println(startindex);
				Permute(input, startindex + 1);
				
				temp = input[i];
				input[i] = input[startindex];
				input[startindex] = temp;

			}

		}
		/*
		 * if (counter == 1000000) { System.out.println(counter +
		 * " Permutation is"); for (int i = 0; i < size; i++) {
		 * 
		 * System.out.print(input[i] + ",  "); } System.out.println();
		 * System.out.println(""); return; }
		 */
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the no : ");
		long n = in.nextLong();
		long f = n;
		int count = 0;
		do {
			int b = (int) (f % 10);
			f = f - b;
			f = f / 10;
			count++;
		} while (f > 0);

		int[] input = new int[count];

		long d = n;
		int i = 0;
		do {
			long b = d % 10;
			d = d - b;
			d = d / 10;
			input[i] = (int) b;
			i++;
		} while (d > 0);

		counter = 0;
		Permute(input, 0);
		Collections.sort(q);
		System.out.println(q);
		// System.out.println(counter + "  number of permutations obtained");
	}

}
