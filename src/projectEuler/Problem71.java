package projectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem71 {
	public static void main(String[] args) {
		long e,s;
		s=System.currentTimeMillis();
		// int d,n;
		List a = new ArrayList();
		List b=new ArrayList();
		for (int n = 1; n < 8; n++) {
			for (int d = n + 1; d < 8; d++) {
				if ((double) n / d == 0.42857142857142855) {
					b.add((double) n / d);
					b.add(n);
					b.add(d);
					a.add(b);
					System.out.println(n + "/" + d);
					break;
				}
				if (n == 1) {
					System.out.println(n + "/" + d);
					b.add((double) n / d);
					b.add(n);
					b.add(d);
					a.add(b);
				} else if (d % n != 0) {
					System.out.println(n + "/" + d);
					b.add((double) n / d);
					b.add(n);
					b.add(d);
					a.add(b);
				}
			}
		}
		Collections.sort(a.subList(0, 0));
		System.out.println(a);
		System.out.println((double) 3 / 7);
		
		// System.out.println(a);
		System.out.println(a.indexOf(0.42857142857142855));
		System.out.println(a.indexOf(0.42857142857142855) - 3);
		e=System.currentTimeMillis();
		System.out.printf("Total time taken : %d s",(e-s)/1000 );
		
		
	}
}
