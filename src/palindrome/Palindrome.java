package palindrome;

public class Palindrome {
	public static void main(String[] args) {

	}

	public void palindrome(int digit) {
		int[] n = new int[digit];
		int num;
		int i = 1;
		int m = (digit / 2);
		do {
			n[(digit - 1) - i] = n[i] = 0;
			i++;
		} while (i < digit);
		n[digit - 1] = n[0] = 1;
		int j = 0;
		do {
			int y = m - j;
			n[m] = 0;
			do {
				num = 0;
				do {
					num = n[i] + num * 10;
				} while (i < digit);
				System.out.println(num);
				n[m]++;
			} while (n[m] < 10);
			j++;
		} while (j <= m);

	}
}
