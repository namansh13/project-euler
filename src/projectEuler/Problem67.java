package projectEuler;

import java.util.Scanner;

public class Problem67 {
	public static void main(String[] args) {
		int[][] a = new int[100][100];
		Scanner q = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = q.nextInt();
			}
		}
		System.out.println();
		for (int i = 98; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (a[i + 1][j] > a[i + 1][j + 1]) {
					a[i][j] = a[i][j] + a[i + 1][j];
				} else
					a[i][j] = a[i][j] + a[i + 1][j + 1];
			}
		}
		System.out.println(a[0][0]);

	}
}
