package projectEuler;

import java.util.Scanner;

public class Problem82 {
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
				if(a[i][j]<100)
				System.out.print(" "+a[i][j] + " ");
			
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=)
		
	}
}
