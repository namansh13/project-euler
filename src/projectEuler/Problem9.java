package projectEuler;

public class Problem9 {
	public static void main(String[] aaw){
		long e,s;
		s=System.nanoTime();
		double m;
		double p=1;
		for(long i=1;i<100000;i++){
			for(long j=i;j<100000;j++){
				m=(i*i + j*j);
				m= Math.sqrt(m);
			//	System.out.println(m);
				if(m==(int)m){
					
					if(i+j+m==1000){
						p=i*j*m;
						System.out.println(i+" "+j+" "+m);
						break;
					}
					
				}
			}
		}
	System.out.println(p);
	e=System.nanoTime();
	System.out.println((e-s)/1000000000);
	}

}
