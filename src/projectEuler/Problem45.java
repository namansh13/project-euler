package projectEuler;

import java.math.BigInteger;

public class Problem45 {
	static BigInteger v=new BigInteger("1");
	static BigInteger w=new BigInteger("2");
	static BigInteger q=new BigInteger("3");
	
	public static boolean pentagonal(BigInteger l,int a ){
		
		BigInteger h=new BigInteger("1");
		int count=0;
//		System.out.println(l);
		do{
			BigInteger z=(h.multiply((h.multiply(q)).subtract(v))).divide(w);
	//		System.out.print(z+" ");
			if(z.equals(l)){
				return true;
			}
			h=h.add(v);
			count++;
		}while(count<a);
		
	return false;
	}
	
	public static boolean hexagonal(BigInteger l, int a){
		
		BigInteger h=new BigInteger("1");
		int count=0;
		do{
			BigInteger z=h.multiply((h.multiply(w)).subtract(v));
			count++;
			if(z.equals(l)){
				return true;
			}
			h=h.add(v);
		}while(count<a);
	return false;
	}
	
	public static void main(String[]args){
		long s=System.currentTimeMillis();
		long e;
		/*for(int i=2;i<100000;i++){
			long m=i*(i+1)/2;
			System.out.println(m);
			boolean c=pentagonal(m,i);
			boolean d=hexagonal(m,i);
		//	System.out.println(m+" c: "+c+" d: "+d);
			if(c==true&&d==true){
		
				System.out.println(m+" "+i);//+" c: "+c+" d: "+d);
			}
		}*/
		BigInteger m=new BigInteger("1");
		int t=1;
		int count=0;
		do{
			BigInteger a=(m.multiply(m.add(v))).divide(w);
			boolean c=pentagonal(a,t);
			boolean d=hexagonal(a,t);
//			System.out.println(a+" c: "+c+" d: "+d+" t: "+t);
			if(c==true&&d==true){
				System.out.println(a+" "+t);//+" c: "+c+" d: "+d);
				count++;
			}
			t++;
			m=m.add(v);
			
			if(count==3){
				break;
			}
		}while(t<100000);
		e=System.currentTimeMillis();
		long q=e-s;
		System.out.println(q);
		
	}

}
