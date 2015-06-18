package projectEuler;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class Problem99 {
	public static void main(String[] args) throws IOException {
		double max = 1;
		Scanner q = new Scanner(new File("C:\\Users\\nsharma4\\Desktop\\base_exp.txt"));
		String[] tall = new String[1000];
		int i = 0;
		int count = 1;
		while (q.hasNext()) {
			tall[i++] = q.next();
		}
		q.close();
		for (int j = 0; j < i; j++) {
			String[] out = tall[j].split(",");
			int a = Integer.parseInt(out[0]);
			int b = Integer.parseInt(out[1]);
			double n = b * Math.log(a);

			if (max < n) {
				max = n;
				count = j;
			}
		}
		System.out.println(count+1);
		
		
	}
}
