package projectEuler;

import java.math.BigInteger;

public class Problem97 {
	public static void main(String[] args){
		BigInteger a=new BigInteger("1");
		BigInteger two=new BigInteger("2");
		BigInteger c=new BigInteger("28433");
		BigInteger one=new BigInteger("1");
		BigInteger b=new BigInteger("10000000000");
		/*for(int i=1;i<=7830457;i++){
			a=a.multiply(two);
		}*/
		a=two.pow(7830457);
		a=a.multiply(c);
		a=a.add(one);
		a=a.mod(b);
		System.out.println(a);
		
	}

}
