package projectEuler;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Problem23 {

	public static void main(String[] args) {
		int[] a = new int[8000];

		Set<Integer> y = new HashSet<Integer>();

		int k = 0;
		for (int i = 1; i < 29000; i++) {
			int sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum > i) {
				a[k] = i;
				k++;
			}
		}
		int count = 0;
		/*
		 * for (int i = 0; i < a.length; i++) { if (a[i] > 0) {
		 * System.out.println(a[i]); count++; } }
		 */
		// System.out.println(count);

		int m = 0;
		do {
			int n = 0;
			do {
				if (a[m] > 0 && a[n] > 0) {
					y.add(a[m] + a[n]);
				}
				n++;
			} while (n < a.length);
			m++;
		} while (m < a.length);

		List<Integer> list = new ArrayList<Integer>(y);

		Collections.sort(list);

		int[] array = new int[550000];
		Iterator it = list.iterator();
		int rr = 0;
		while (it.hasNext()) {
			array[rr] = (Integer) it.next();
			rr++;
		}
		long ans = 0;
		for (int j = 0; j < 28; j++) {

			for (int i = 0; i < array.length; i++) {
				int t=0;
				if (array[i] > 0 && array[i] < 28200) {
					if (j != array[i]) {
						t++;
					}
				}
				if(t==26743){
				System.out.println(j);
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && array[i] < 28200) {
				// System.out.println(ch[i]);
			}
		}

		System.out.println(ans);
	}

	// Create an ch containing the elements in a set

}
