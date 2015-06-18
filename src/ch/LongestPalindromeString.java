package ch;

import java.util.Scanner;

public class LongestPalindromeString {
	public static void main(String[] args) {
		String s;
		Scanner q = new Scanner(System.in);
		System.out.print("Enter the String : ");
		s = q.nextLine();
		for (int i = 0; i < s.length(); i++) {
			// System.out.println(s.substring(i, s.length()));
			if (palindromelast(s.substring(i, s.length()))) {
				System.out.println(s.substring(i, s.length()));
			}
		}
	}

	public static boolean palindromelast(String s) {
		String a = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			a = a + s.charAt(i);
		}
		System.out.println(a);
		if (a.equals(s)) {
			return true;
		}
		return false;
	}

	public static boolean palindromefirst(String s) {
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			a = a + s.charAt(i);
		}
		return false;
	}
}
