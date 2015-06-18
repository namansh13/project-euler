package projectEuler;

public class Problem94 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		long i = 7;
		double h1;
		double h2;
		long p = 0, p1 = 0;
		int j = 0;
		while (p < 1000000000) {
			long x = i + 1;
			long y = i - 1;
			if (j == 0) {
				h1 = Math.sqrt(i * i - (x * x / 4));
				if (h1 == (int) h1) {
					p1 = 2 * i + x;
					if (p1 >= 1000000000) {
						break;
					}
					p = p + 2 * i + x;
					System.out.println("in h1 " + i + " " + x + " " + p);
					 i=i*4;
				}
				j = 1;
			} else {
				h2 = Math.sqrt(i * i - (y * y / 4));
				if (h2 == (int) h2) {
					p1 = 2 * i + y;
					if (p1 >= 1000000000) {
						break;
					}
					p = p + 2 * i + y;
					System.out.println("in h2 " + i + " " + y + " " + p);
					 i=i*4;
				}
				j = 0;
			}
			i--;
		}
		System.out.println("perimeter : " + p);
		e = System.currentTimeMillis();
		System.out.println("Total Time taken : " + (e - s) + " ms");
	}
}
