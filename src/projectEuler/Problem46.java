package projectEuler;

public class Problem46 {
	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		int[] z = new int[10000];
		int j1 = 0;
		int a = 0;
		z = PrimeNumber.PrimeNumber.allprime();
		for (int i = 3; i < 10000; i = i + 2) {
			int c = PrimeNumber.PrimeNumber.test(i);
			if (c == 1) {
				for (int j = 1; j < z.length; j++) {
					for (int k = 1; k < 100; k++) {
						if (i == (z[j] + 2 * k * k)) {
							a = k;
							j1 = z[j];
							break;
						}
					}
					if (i == (z[j] + 2 * a * a)) {
						break;
					}
				}
				if (i != (j1 + 2 * a * a)) {
					System.out.println(i);
					break;
				}
			}
		}
		long endtime = System.currentTimeMillis();
		float time = endtime - starttime;
		System.out.println(time);
	}
}
