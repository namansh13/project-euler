package projectEuler;

public class Problem28 {
	public static void main(String[] args) {
		long e,s;
		s=System.currentTimeMillis();
		long sum = 0;
		int i = 1;
		int count = 1;
		int count1 = 0;
		int count2 = 0;
		do {
			int pow = (int) Math.pow(count, 2);
			int pow1 = 2 * count2;
			do {
				// System.out.print(i+" ");
				if (count1 == pow1) {
					sum=sum+i;
				//	System.out.print(i + " ");
					count1 = 0;
				}
				count1++;
				i++;
			} while (i <= pow);
			count2++;
			//System.out.println();
			count = count + 2;
		} while (count <= 1001);
		System.out.println("Diagonal sum : "+sum);
		e=System.currentTimeMillis();
		System.out.println("Time taken : "+(e-s)+" ms");
	}

}
