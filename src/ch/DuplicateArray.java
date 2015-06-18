package ch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		HashMap t = new HashMap();
		// t.p
		Set a = new HashSet();
		Scanner q = new Scanner(System.in);
		int size;

		int[] n = { 1, 2, 2, 3, 2, 1, 4, 2, 5, 1, 1, 5, 5, 7, 7, 7, 7 };

		System.out.println(dupicateElements(n, a));
		e = System.currentTimeMillis();
		System.out.printf("Total Time taken : %d ms", (e - s));
	}

	public static Set<Integer> dupicateElements(int[] n, Set<Integer> a) {
		int count;
		for (int i = 0; i < n.length; i++) {
			count = 0;
			for (int j = i; j < n.length; j++) {
				if (n[j] == n[i]) {
					count++;
				}
			}
			if (count > 2) {
				a.add(n[i]);
			}
		}
		return a;
	}
}
