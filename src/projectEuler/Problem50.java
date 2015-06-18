package projectEuler;

public class Problem50 {
	public static void main(String[] args) {
		long sum , count = 0, max = 1,u=1;
		int a,k,b;
		for (long j = 2; j < 1000; j++) {

			k = PrimeNumber.PrimeNumber.test(j);
			sum=0;
			count=0;
			if (k == 0) {
				

				for (long i = j; i <= 10000; i++) {
					a = PrimeNumber.PrimeNumber.test(i);
					// System.out.println(a);
					if (a == 0) {
						sum = sum + i;
						count++;
						if(u<count){
							u=count;
						//	System.out.println(u);
						}
					
					//	System.out.println(u);
						b = PrimeNumber.PrimeNumber.test(sum);
						if (b == 0 && sum < 1000000) {

							System.out.println(sum + " " + count);
							
						}
				//		System.out.print(" "+count);
					}
				}
			}
		}
	System.out.println(u);
	}
}
