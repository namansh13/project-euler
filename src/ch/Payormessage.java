package ch;

import java.util.ArrayList;

public class Payormessage {
	public static void main(String... args) {
		String string = "While the average life span of Indian women is currently said to be 68 years, Chhattisgarh, women, or at least some women, reportedly live to cross the hundred-year mark. And, in one admittedly exceptional case, a matriarch is said to have clocked up a truly venerable 532 years, which means she was born at the time of Mughal rule, and long before the British came to India.";
		for (String k : PayorMsg(string)) {
			System.out.println(k);
		}
		System.out.println(string.charAt(0));
	}

	public static ArrayList<String> PayorMsg(String str) {

		ArrayList<String> s = new ArrayList<String>();
		int i;
		if (str.length() > 95) {

			while (str.length() > 95) {
				i = str.lastIndexOf(" ", 95);
				s.add(str.substring(0, i));
				str = str.substring(i + 1);
			}
			s.add(str);
			return s;
		}

		else {
			s.add(str);
			return s;
		}
	}
}
