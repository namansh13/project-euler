package projectEuler;

public class Problem34 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		int pow = 5, h = 2;
		long i = 10, j, b, sum;
		do {
			j = i;
			sum = 0;
			do {
				b = j % 10;
				j = (j - b) / 10;
				sum = sum + fact(b);
				if (sum > i) {
					sum = 0;
					break;
				}
			} while (j > 0);
			if (sum == i) {
				System.out.println(i);
			}
			if (i == Math.pow(10, h)) {
				h++;
			}
			i++;
		} while (i < Math.pow(10, pow));
		e = System.currentTimeMillis();
		System.out.println(e - s);
	}

	public static long fact(long n) {
		long fact = 1;
		if (n == 0) {
			return 1;
		} else {
			do {
				fact = fact * n;
				n--;
			} while (n >= 1);
			return fact;
		}
	}
}
