package rough;

public class Problem40 {
public static void main(String[] args){
	int[] a=new int[10000000];
	int k,d=1;
	int count,i=0;;
	do{
		
		k=d;
		count=0;
		do{
	
		int b= k%10;
		k=k-b;
		k=k/10;
		count++;
		
	}while(k>0);
		k=d;
		int u=count;
		
		
		do{
			int b=(int) (k%Math.pow(10,(u-1)));
	//		System.out.println(b);
			int m=(int) ((k-b)/Math.pow(10,(u-1)));
	//		System.out.println(m);
			
			
			a[i]=m;
			
			k=(int) (k-(m*Math.pow(10, (u-1))));
		//	System.out.println("b: "+b+" m: "+m+" k: "+k+" a["+i+"]"+" : "+a[i]);
			i++;
			u--;
		}while(u>0);
		
	d++;
		
	}while(d<200000);
	for(int j=0;j<1000000;j++){
		
	
	System.out.println(a[j]+" "+j);	
}
	System.out.println(a[0]+" "+a[9]+" "+a[99]+" "+a[999]+" "+a[9999]+" "+a[99999]+" "+a[999999]+" ");
int p=a[0]*a[9]*a[99]*a[999]*a[9999]*a[99999]*a[999999];
System.out.println(p);
}
}
