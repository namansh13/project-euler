package projectEuler;
import java.util.Scanner;
public class Problem81 {
	public static void main(String[] args) {
		int b = 5;
		int[][] a = new int[b][b];
		Scanner q = new Scanner(System.in);
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				a[i][j] = q.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = b - 2; i >= 0; i--) {
			a[b - 1][i] += a[b - 1][i + 1];
			a[i][b - 1] += a[i + 1][b - 1];
		}
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = b - 2; i >= 0; i--) {
			for (int j = b - 2; j >= 0; j--) {
				a[i][j] += Math.min(a[i + 1][j], a[i][j + 1]);
			}
		}
		System.out.println(a[0][0]);
	}
}
