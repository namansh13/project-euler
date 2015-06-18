package Reverse;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		char a;
		int l;
		String z=null;
		Scanner x = new Scanner(System.in);

		String array = new String();
		System.out.print("Enter the String : ");
		array = x.nextLine();
		l = array.length();
		for (int i = l - 1; i >= 0; i--) {
			a = array.charAt(i);
			System.out.print(a);
		}

	}

}
