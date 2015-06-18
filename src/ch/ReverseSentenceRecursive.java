package ch;

import java.util.Scanner;

public class ReverseSentenceRecursive {
	public static void main(String[] args) {
		String s;
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the sentence to reverse : ");
		s = q.nextLine();
		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		int k = s.indexOf(" ");
		if (k == -1)
			return s;
		else
			System.out.println(s.substring(0, k));
		return reverse(s.substring(k + 1)) + " " + s.substring(0, k);
	}
}
