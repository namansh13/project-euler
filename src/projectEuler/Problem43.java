package projectEuler;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem43 {
	static BigInteger sum = new BigInteger("0");
	public static void main(String[] args) {
		long e,s;
		s=System.currentTimeMillis();
		permute("0123456789");
		System.out.println("Sum : "+sum);
		e=System.currentTimeMillis();
		System.out.println("Time taken : "+(e-s)+" ms");
	}
	
	 public static   void permute( String input)
	    {
	        int inputLength = input.length();
	        boolean[ ] used = new boolean[ inputLength ];
	        StringBuffer outputString = new StringBuffer();
	        char[ ] in = input.toCharArray( );
	       doPermute ( in, outputString, used, inputLength, 0 );
	       //count++;
	       
	    }
	    
	    public static    void doPermute ( char[ ] in, StringBuffer outputString,
	    boolean[ ] used, int inputLength, int level)
	    {
	    	 //count=0;
	    	//count++;
	        if( level == inputLength) {
	            //System.out.println ( outputString.toString());
	        	
	           // BigInteger sum = new BigInteger("0");
	        	
	    		BigInteger n;
	    		BigInteger m = new BigInteger(outputString.toString());
	    		BigInteger y = new BigInteger("10");
	    		BigInteger x = new BigInteger("100");
	    		BigInteger z = new BigInteger("0");
	    		BigInteger k = new BigInteger("2");
	    		BigInteger l = new BigInteger("3");
	    		BigInteger o = new BigInteger("5");
	    		BigInteger p = new BigInteger("7");
	    		BigInteger q = new BigInteger("11");
	    		BigInteger r = new BigInteger("13");
	    		BigInteger s = new BigInteger("17");
	    		BigInteger t = new BigInteger("1");
	    	//BigInteger u = new BigInteger("9999999999");

	    		int i;
	    		
	    		BigInteger[] a = new BigInteger[10];
	    		
	    		
	    		
	    		
	    		//do {
	    	//		String str = m.toString();
	    		//	System.out.println(str);
	    			//if (isAnagram(str,"0123456789"))
	    			//{
	    				//System.out.println(str);
	    				n = m;
	    				i = 9;
	    				do {
	    					BigInteger b = n.mod(y);
	    					n = n.subtract(b);
	    					n = n.divide(y);
	    					a[(int) i] = b;
	    					i--;
	    				} while (n.compareTo(z) > 0);
	    				BigInteger c = a[1].multiply(x).add(a[2].multiply(y).add(a[3]));
	    				BigInteger d = a[2].multiply(x).add(a[3].multiply(y).add(a[4]));
	    				BigInteger e = a[3].multiply(x).add(a[4].multiply(y).add(a[5]));
	    				BigInteger f = a[4].multiply(x).add(a[5].multiply(y).add(a[6]));
	    				BigInteger g = a[5].multiply(x).add(a[6].multiply(y).add(a[7]));
	    				BigInteger h = a[6].multiply(x).add(a[7].multiply(y).add(a[8]));
	    				BigInteger j = a[7].multiply(x).add(a[8].multiply(y).add(a[9]));

	    				if (c.mod(k).equals(z) && d.mod(l).equals(z)
	    						&& e.mod(o).equals(z) && f.mod(p).equals(z)
	    						&& g.mod(q).equals(z) && h.mod(r).equals(z)
	    						&& j.mod(s).equals(z)) {

	    					sum = sum.add(m);
	    					// if(c%2==0&&d%3==0&&e%5==0&&f%7==0&&g%11==0&&h%13==0&&j%17==0){
	    					System.out.println(m);
	    				}
	    			//}
	    			m = m.add(t);
	    		//} while (m.compareTo(u)
	           
	            
	            
	            
	           // count++;
	            return ;
	        }
	        
	        for( int i = 0; i < inputLength; ++i )
	        {
	        	//count++;
	            
	            if( used[i] ) continue;
	            
	            outputString.append( in[i] );
	            used[i] = true;
	           // count++;
	            doPermute( in,   outputString, used, inputLength, level + 1 );
	            used[i] = false;
	            outputString.setLength(   outputString.length() - 1 );
	        }
		
	    }
	    
	}


