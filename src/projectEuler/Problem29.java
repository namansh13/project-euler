package projectEuler;

import java.util.HashSet;

public class Problem29 {
	public static void main(String[] args) {
		HashSet<Double> u = new HashSet<Double>();
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				u.add(Math.pow(i, j));
			}
		}
		System.out.println(u.size());
	}
}
