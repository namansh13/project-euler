package projectEuler;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args){
	int[][] a=new int[20][20];
	long p1,p2,p3,p4,p5,p6;
	long m1=1,m2=1,m3=1,m4=1,m5=1,m6=1;
	Scanner q=new Scanner(System.in);
	for(int i=0;i<20;i++){
		for(int j=0;j<20;j++){
			a[i][j]=q.nextInt();
		}
	}
	for(int i=0;i<20;i++){
		for(int j=0;j<17;j++){
			p1=a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
			if(p1>m1){
				m1=p1;
				System.out.println(a[i][j]+" "+a[i][j+1]+" "+a[i][j+2]+" "+a[i][j+3]);
			}
		}
		}
	System.out.println();
		
		for(int k=0;k<17;k++){
			for(int j=0;j<20;j++){
				p2=a[k][j]*a[k+1][j]*a[k+2][j]*a[k+3][j];
				if(p2>m2){
					m2=p2;
					System.out.println(a[k][j]+" "+a[k+1][j]+" "+a[k+2][j]+" "+a[k+3][j]);
				}
			}
			}
			System.out.println();
			for(int l=0;l<17;l++){
				for(int j=0;j<17;j++){
					p3=a[l][j]*a[l+1][j+1]*a[l+2][j+2]*a[l+3][j+3];
					if(p3>m3){
						m3=p3;
						System.out.println(a[l][j]+" "+a[l+1][j+1]+" "+a[l+2][j+2]+" "+a[l+3][j+3]);
					}
				}
			}
			System.out.println();
			for(int l=3;l<20;l++){
				for(int j=0;j<20;j++){
					p4=a[l][j]*a[l-1][j]*a[l-2][j]*a[l-3][j];
					if(p4>m4){
						m4=p4;
						System.out.println(a[l][j]+" "+a[l-1][j]+" "+a[l-2][j]+" "+a[l-3][j]);
					}
				}
			}
			System.out.println();
			
			for(int l=0;l<20;l++){
				for(int j=3;j<20;j++){
					p5=a[l][j]*a[l][j-1]*a[l][j-2]*a[l][j-3];
					if(p5>m5){
						m5=p5;
						System.out.println(a[l][j]+" "+a[l][j-1]+" "+a[l][j-2]+" "+a[l][j-3]);
					}
				}
			}
			
			System.out.println();
			for(int l=0;l<17;l++){
				for(int j=3;j<20;j++){
					p6=a[l][j]*a[l+1][j-1]*a[l+2][j-2]*a[l+3][j-3];
					if(p6>m6){
						m6=p6;
						System.out.println(a[l][j]+" "+a[l+1][j-1]+" "+a[l+2][j-2]+" "+a[l+3][j-3]);
					}
				}
			}
			
		System.out.println(m1+" "+m2+" "+m3+" "+m4+" "+m5+" "+m6);
	
}
}
