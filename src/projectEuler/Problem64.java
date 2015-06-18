package projectEuler;

public class Problem64 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		int a;
		int count = 0;
		for (int i = 2; i < 10000; i++) {
			if (isint(Math.sqrt(i)) == 0) {
				a = (int) Math.sqrt(i);
				int h = convergent(a, a, Math.sqrt(i), i);
				if (h % 2 == 1) {
					count++;
				}
			}
		}
		System.out.println("Total count : " + count);
		e = System.currentTimeMillis();
		System.out.println("Total time taken : " + (e - s) + " ms");
	}

	public static int convergent(int a, int b, double n, int N) {
		double c;
		int count = 0;
		int d = 1;
		do {
			c = (n + b) * d / (N - b * b);
			d = (int) ((N - b * b) / d);
			b = ((int) c * d) - b;
			count++;
		} while (d != 1);
		return count;
	}

	public static int isint(double n) {
		if (n == (int) n) {
			return 1;
		}
		return 0;
	}
}
