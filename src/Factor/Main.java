package Factor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception  {
		Scanner m = new Scanner(System.in);
		int test;
		test = m.nextInt();
		int[] y = new int[10];
		for (int d = 0; d < test; d++) {
			int k, count = 0;
			int[] p = new int[10];
			long t = 1;
			k = m.nextInt();
			for (int j = 0; j < k; j++) {

				p[j] = m.nextInt();
				t = t * p[j];
			}

			for (int i = 2; i <= (t / 2); i++) {
				if (t % i == 0) {
					count = count + 1;
				} else
					continue;
			}
			y[d] = count + 2;
			
		}
for (int b=0;b<test;b++){
	System.out.println(y[b]);
}
	
	}
}
