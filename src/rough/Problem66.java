package rough;

public class Problem66 {
	public static void main(String... args){
		int d=1;
		int n=0;
		long max=0;
		while(d<=1000){
			if(Math.sqrt(d)!=(int)Math.sqrt(d)){
				//System.out.println(d);
				long y=1;
				while(Math.sqrt(1+d*y*y)!=(int)Math.sqrt(1+d*y*y)){
					y++;
				}
				if(max<Math.sqrt(1+d*y*y)){
					max=(long)Math.sqrt(1+d*y*y);
					n=d;
				}
				System.out.println("D : "+d+" X : "+(long)Math.sqrt(1+d*y*y)+" Y : "+y);
			}
			d++;
		}
		System.out.println(n);
	}
}
