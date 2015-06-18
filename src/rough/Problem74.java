package rough;

import java.util.ArrayList;

public class Problem74 {
	public static void main(String... args) {
		long e, s;
		s = System.currentTimeMillis();
		System.out.println(breakfactnumber(999999));
		/*int n=872;
		int b=breakfactnumber(n);
		int count=0;
		while(b!=n){
			count++;
			System.out.println(b);
			b=breakfactnumber(b);
			
		}
		System.out.println(count+1);*/
		int count=0;
		for(int i=0;i<1000000;i++){
			if(cycle(i)==60){
		//System.out.println(i+" " +cycle(i));
		count++;
			}
		}
		
		System.out.println(count);
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d ms", (e - s));
	}

	public static int breakfactnumber(int n) {
		int sum = 0;
		while (n > 0) {
			int b = n % 10;
			n = (n - b) / 10;
			sum = sum + factnumber(b);
		}
		return sum;
	}

	public static int factnumber(int n) {
		switch (n) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 6;
		case 4:
			return 24;
		case 5:
			return 120;
		case 6:
			return 720;
		case 7:
			return 5040;
		case 8:
			return 40320;
		case 9:
			return 362880;
		default:
			return 1;

		}
	}
	static int cycle(int n){
		ArrayList a=new ArrayList();
		a.add(n);
		int b=breakfactnumber(n);
		int count=0;
		while(!a.contains(b)){
			a.add(b);
			b=breakfactnumber(b);
			
			
			count++;
		}
		//System.out.println(a);
		return count+1;
		
	}

}
