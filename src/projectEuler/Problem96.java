package projectEuler;

import java.util.Scanner;

public class Problem96 {
	public static void main(String[] args) {
		int[][] a = new int[9][9];
		Scanner q = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				a[i][j] = q.nextInt();
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (a[i][j] == 0) {
					int count = 0;
					for (int x = 0; i < 9; i++) {
						if (a[i][x] == 0) {
							count++;
						}
						if(a[x][i]==0){
							count++;
						}
					}
					if(count==1){
						
					}

				}
			}
		}
	}
}
