package projectEuler;

import java.util.Scanner;

public class Problem47 {
	static int f;
	Scanner q = new Scanner(System.in);
	public static int[] factors(int n) {
		int h = 0;
		int count = 0, v;
		int[] p = new int[100];
		for (int i = 2; i <= n; i++) {
			v = PrimeNumber.PrimeNumber.test(i);
			if (v == 0) {
				int m = 0;
				if (n % i == 0) {
					for (int e = 2; e < n; e++) {
						if (n % (Math.pow(i, e)) == 0) {
							p[h] = (int) Math.pow(i, e);
						//	h++;
							count++;
							m++;
						} else {
							h++;
							break;
						}
					}
					if (m == 0) {
						p[h] = i;
						h++;
						count++;
					}
				}
			}
		}
	//	System.out.println(count);
		
		int j=0;
		for(int i=0;i<p.length;i++){
			if(p[i]!=0){
				p[j++]=p[i];
			}
		}
		int[] k=new int[j];
		System.arraycopy(p, 0, k, 0, j);
		f = j;
		return k;
	}
	public static void main(String[] args) {
		int[] a = new int[100];
		int[] m = new int[100];
		Scanner q = new Scanner(System.in);
		int n, z;
		int l = 0;
	//	System.out.print("Enter the number of numbers : ");
	//	z = q.nextInt();
	/*	for (int y = 0; y < z; y++) {

			m[y] = 15000 + l;
			System.out.println(m[y]);
			l++;
		}*/
		int u=1;
		int[] g=new int[100];
		int[] h=new int[4];
		do{
			for(int y=0;y<h.length;y++){
				h[y]=y+u;
			}
			int ab=0,iu=0;;
			/*g= projectEuler.Problem47.factors(u);
			if(f==4){
				System.out.print(u+" : ");
				for(int j=0;j<f;j++){
					System.out.print(g[j]+",");
					
				}
				System.out.println();
				//break;
			}*/
			do{
				g= projectEuler.Problem47.factors(h[ab]);
			//	System.out.println(h[ab]);
				if(f==4){
				//	System.out.println(h[ab]);
					iu++;
				}
				ab++;
			}while(ab<4);
			if(iu==4){
			//	g= projectEuler.Problem47.factors(u);
				System.out.print(u+" : ");
			/*	for(int j=0;j<f;j++){
					System.out.print(g[j]+",");
					
				}
				System.out.println();
				break;
			}*/
			}
			u++;
		}while(u<100000);
		
			
		/*	for (int j = 0; j < z; j++) {
			a = projectEuler.Problem47.factors(m[j]);
			System.out.print("factor for " + m[j] + " are : ");
			for (int i = 0; i < f; i++) {
				System.out.print(a[i] + ",");
			}
			System.out.println();
		}*/

}
	public static boolean compare(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
}