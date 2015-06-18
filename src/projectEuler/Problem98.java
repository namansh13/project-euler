package projectEuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem98 {
	public static void main(String[] args) throws IOException {
		int max = 0;
		String[] st = new String[6];
		int count = 0;
		BufferedReader sd = new BufferedReader(new FileReader("c:\\words.txt"));
		String s = sd.readLine();
		String a,b;
		// System.out.println(s);
		String[] out = s.split(",");
		for (int i = 0; i < out.length; i++) {
			// System.out.println(out[i]);
			if (out[i].length() == 16) {
				max = out[i].length();
				st[count] = out[i];
				count++;
				System.out.println(out[i]);
			}

		}
		for (int i = 0; i < st.length; i++) {
			char[] chars = st[i].toCharArray();
			Set<Character> charSet = new LinkedHashSet<Character>();
			for (char c : chars) {
				charSet.add(c);
			}

			StringBuilder sb = new StringBuilder();
			for (Character character : charSet) {
				sb.append(character);
			}
			System.out.println(sb.toString());
		}
		System.out.println(max);
		a="REPSNTAIO";
		b="REPSNTAIV";
		count=0;
		
	}

}
