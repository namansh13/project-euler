package rough;

public class RoughProblem44 {
	public static boolean pentagonal(long l,int m,int n){
		if(l==0){
			return false;
		}
		for(int i=n;i<m;i++){
			int k=i*(3*i-1)/2;
			if(k==l){
				return true;
			}
		}
	return false;
	}
	
public static void main(String[] args){
	long[] a=new long[10000];
	int k=0,l=1;
	do{
		a[k]=l*(3*l-1)/2;
		k++;
		l++;
	}while(k<a.length);
int g=0;
do{
	int h=g+1;
	if(h==a.length){
		break;
	}
	do{
	//	boolean c=pentagonal(a[g]+a[h],g+h,g);
		boolean d=pentagonal(a[h]-a[g],g+h,h-g);
	//	if(c==true&&d==true){
		if(d==true){
			boolean c=pentagonal(a[g]+a[h],g+h,g);
			if(c==true){
				System.out.println(a[g]+" "+a[h]+" "+(a[g]+a[h])+" "+Math.abs((a[h]-a[g]))+" c: "+c+" d: "+d);
			}
		}
	//	System.out.println(a[g]+" "+a[h]+" "+(a[g]+a[h])+" "+Math.abs((a[h]-a[g]))+" c: "+c+" d: "+d);
	//	}
	h++;	
	}while(h<a.length);
	g++;
}while(g<a.length);
}
}
