package projectEuler;

public class Problem35 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int n = 1;
		int count = 0;
		int m, b, c, d, u;
		do {
			m = PrimeNumber.PrimeNumber.test(n);
			if (m == 0) {
				d = n;
				int t = n;
				int count1 = 0;
				int count2 = 0;
				int r = 0;
				do {
					int a = t % 10;
					t = t - a;
					t = t / 10;
					count1++;
				} while (t > 0);
				do {
					b = d % 10;
					d = d - b;
					d = d / 10;
					d = ((int) Math.pow(10, (count1 - 1))) * b + d;
					int h = PrimeNumber.PrimeNumber.test(d);
					if (h == 0) {
						count2++;
						if (count2 == count1) {
							System.out.println(d);
						}
					} else if (d == n && h == 0) {
						count2++;
						System.out.println(d);
					}
				} while (d != n);
				if (count1 == count2) {
					count++;
				}
			}
			n++;
		} while (n <= 1000000);
		System.out.println(count + 1);
	}
}