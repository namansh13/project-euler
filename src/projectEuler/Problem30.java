package projectEuler;

public class Problem30 {
	public static void main(String[] args) {
		int sum;
		int b;
		int n = 2;
		int i;
		int m = 0;
		do {
			i = n;
			sum = 0;
			do {
				b = i % 10;
				i = i - b;
				i = i / 10;
				sum = sum + (b * b * b * b * b);
			} while (i > 0);
			if (sum == n) {
				m = m + sum;
			}
			n++;
		} while (n < 2600000);
		System.out.println(m);
	}
}