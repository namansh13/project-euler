package rough;

public class Problem448 {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		System.out.println(lcm(24, 24));
		long sum = 0;
		long count = 0;
		long avg = 0;
		long n = 10000;
		for (int i = 1; i <= n; i++) {
			avg=avg+lcmavg(i);
			//sum = 0;
			/*for (int j = 1; j <= i; j++) {
				/*if (i % j == 0 || i == j || j == 1) {
					sum = sum + i;
				} else {
					sum = sum + lcm(i, j);
				}*/
				count++;
			//}
			//avg = avg + (sum / i);
		}
		System.out.println(avg + " " + count);
		e = System.currentTimeMillis();
		System.out.println("Total time taken : " + (e - s) + " ms");
	}
	public static long lcmavg(int i){
		long sum=0;
		for(int j=1;j<=i;j++){
			sum=sum+lcm(i,j);
		}
		return sum/i; 
	}

	public static long lcm(long a, long b) {
		long c = a, e = b;
		if (a % b == 0 || a == b) {
			return a;
		}
		long d = 1;
		do {
			d = a - b;
			a = Math.max(d, b);
			b = Math.min(d, b);
		} while (a != b);
		long lcm = (c / d) * e;
		return lcm;
	}
}
