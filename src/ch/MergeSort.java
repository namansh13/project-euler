package ch;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = { 5, 3, 8 };
		int[] b = { 2, 1, 5, 6, 7, 7, 3, 4, 6, 2, 4, 4 };
		int[] d = new int[a.length + b.length];
		long e, s;
		s = System.currentTimeMillis();
		d = merge(a, b, d);
		for (int i = 0; i < d.length; i++) {
			// System.out.print(d[i]+" , ");
		}
		int[] c = breaker(d);
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d s", (e - s) / 1000);
	}

	public static int[] merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		do {
			if (i >= a.length) {
				c[k] = b[j];
				k++;
				j++;
			} else if (j >= b.length) {
				c[k] = a[i];
				k++;
				i++;
			} else {
				if (a[i] > b[j]) {
					c[k] = b[j];
					k++;
					j++;
				} else if (b[j] > a[i]) {
					c[k] = a[i];
					k++;
					i++;
				} else {
					c[k] = a[i];
					k++;
					c[k] = b[j];
					k++;
					i++;
					j++;
				}
			}
		} while (i < a.length || j < b.length);
		return c;
	}

	public static int[] breaker(int[] a) {
		if (a.length <= 1) {
			// System.out.println(a[0]);
			return a;
		}
		int[] b = new int[a.length / 2];
		int[] c = new int[a.length - b.length];
		System.arraycopy(a, 0, b, 0, b.length);
		System.arraycopy(a, b.length, c, 0, c.length);
		System.out.println(b.length);
		System.out.println("Printting b");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " , ");
		}
		System.out.println();
		System.out.println();
		breaker(b);
		breaker(c);
		merge(b, c, a);
		return a;
	}
}
