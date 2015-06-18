package projectEuler;

import java.util.Scanner;

public class Problem39 {
	public static void main(String[] args) {
		int p, count ,max=1;
		Scanner q = new Scanner(System.in);
//		System.out.print("Enter the number : ");
//		p = q.nextInt();
		for (p = 1; p <= 1000; p++) {
			count=0;
			for (int i = 1; i < p; i++) {
				for (int j = i; j < p; j++) {
					double c = Math.sqrt((i * i + j * j));
					if (p == (i + j + c)) {
			//			System.out.println(i + " " + j + " " + c);
						count++;
					}
				}
			}
			if(count>max){
				max=count;
				System.out.println(p+" "+max);
			}
		}
	}
}
