package ch;

import java.util.Scanner;

public class RemoveCharacterString {
	public static void main(String[] args) {
		String s;
		Scanner q = new Scanner(System.in);
		System.out.print("Enetr the string : ");
		s = q.nextLine();
		System.out.print("Enter character to remove : ");
		char c = q.next().charAt(0);
		String buffer = null;
		String n = "";
		int f = s.indexOf(c);
		if (f == -1) {
			System.out.println(s);
			return;
		}
		do {
			//System.out.println(f);
			buffer = s.substring(0, f);
			//System.out.println(buffer);
			n = n.concat(buffer);
			//System.out.println(n);
			s = s.substring(buffer.length() + 1, s.length());
			//System.out.println(s);
			f = s.indexOf(c);
		} while (f != -1);
		System.out.println(n.concat(s));
	}
}
