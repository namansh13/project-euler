package projectEuler;

public class Problem125 {
	public static void main(String[] args) {
		palindrome(5);
	}

	public static void palindrome(int digit) {
		int a = 1, b = 0;
		int m;
		int[] n = new int[digit];
		if (digit % 2 == 0) {
			int k = 0;
			m = digit / 2 + 1;
		} else {
			int k = 1;
			m = digit / 2;
		}
		int t = 1;
		n[0] = n[digit - 1] = 1;
		int j = 1;
		do {
			n[t] = n[(digit - 1) - t] = 0;
			t++;
			System.out.println("intialise complete");
		} while (t <= digit / 2);
		t = 0;
		do {
			System.out.print(n[t] + " ");
			t++;
		} while (t < digit);
		System.out.println();
		System.out.println("m : " + m);
		do {
			
			do {
				n[m] = 0;
				do {
					int i = 0;
					int num = 0;
					do {
						n[(digit - 1) - i] = n[i];
						i++;
					} while (i < m);
					i = 0;
					do {
						num = n[i] + num * 10;
						i++;
					} while (i < digit);
					System.out.println(num);
					n[m]++;
				} while (n[m] < 10);
				System.out.println(m - j + " " + n[m - j]);
				n[m - j]++;
				System.out.println("outside second do");
				System.out.println(m - j + " " + n[m - j]);
			} while (n[m - j] < 10);
			j++;
			int y = m - j+1;
			do {
				
				n[y] = 0;
				y++;
			} while (y <= m + j-1);
			
		} while (m - j >= 0);
	}
}
