package projectEuler;

public class Problem27 {
	public static void main(String[] args) {
		long sum;
		int k;
		int count;
		int max = 1;
		int i = -1000, j;
		do {
			j = -1000;
			do {
				int n = 0;
				count = 0;
				do {
					sum = n * n + i * n + j;
					k = PrimeNumber.PrimeNumber.test(sum);
					n++;
					count++;
				} while (k < 1);
				if (count > max) {
					max = count;
					System.out.println(i + " " + j + " " + (count - 1));
				}
				j++;
			} while (j < 1000);
			i++;
		} while (i < 1000);
	}
}