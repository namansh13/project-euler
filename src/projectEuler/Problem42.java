package projectEuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem42 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\words.txt"));
		String s;
	
		s = br.readLine();
		
		int count = 0;
		String[] out = s.split(",");
		for (int i = 0; i < out.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < out[i].length(); j++) {
				if (out[i].charAt(j) == '"') {
					continue;

				}
				int c = out[i].charAt(j) - 64;
				sum = sum + c;

			}
			boolean m = match(sum);
		
			if (m == true) {
				System.out.println(m+" "+sum+" "+out[i]);
				count++;
			}

		}

		System.out.println(count);
	}

	public static boolean match(int sum) {
		for (int n = 0; n < sum+1; n++) {
			int i = (n * (n + 1)) / 2;
			if (i == sum) {
				return true;
			}
		}

		return false;

	}

}
