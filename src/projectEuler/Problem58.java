package projectEuler;

public class Problem58 {
	public static void main(String[] args) {
		long e,s;
		s=System.currentTimeMillis();
		int count = 1;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 3;
		int i = 1;
		do {
			do {
				int pow = (int) Math.pow(count, 2);
				int pow1 = 2 * count2;
				do {
					if (count1 == pow1) {
						if (PrimeNumber.PrimeNumber.test(i) == 0) {
							count4++;
						}
						count3++;
						count1 = 0;
					}
					count1++;
					i++;
				} while (i <= pow);
				count = count + 2;
				count2++;
			} while (count <= count5);
			if ((float) count4 / count3 < 0.1) {
				System.out.println("Side Length : "+count5);
				break;
			}
			count5 = count5 + 2;
		} while (count5 < 27000);
		e=System.currentTimeMillis();
		System.out.println("Time Taken : "+(e-s)+" ms");
	}
}
