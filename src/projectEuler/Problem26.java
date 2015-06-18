package projectEuler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class Problem26 {
	public static void main(String[] args) throws InterruptedException {
		String[] v = new String[2000];
		int p = 0;
		String qa=null;
		int length, max = 1;
		BigDecimal k = new BigDecimal("1");
		for (int i = 1; i < 1000; i++) {
			BigDecimal m = new BigDecimal(i);
			BigDecimal q;
			q = k.divide(m, 1000, 1);
		//	
			v[p] = q.toString();
			// String string = "aabbccdefatafaz";
		//	String longest = longestDuplicate(v[p]);
			String longest=findLongestSubstring(v[p]);
	//		System.out.println(longest.length());
			System.out.println(q);
		    System.out.println(longest+" "+longest.length()+" "+p);
		    System.out.println();
		    if (longest.length()>max &&longest.length()<990){
		    	max=longest.length();
		    	qa=v[p];
		    }
		    p++;
			}
			/*
			 * System.out.println(v[p].length()); for(int
			 * j=2;j<v[p].length();j++){ w.add(v[p].charAt(i)); //
			 * System.out.println(v[p].charAt(j)); }
			 */
			// System.out.println(w);
			
			// System.out.println(v);
			// System.out.println(v.hashCode());
System.out.println(max);
System.out.println(qa);
		}
	
public static String longestDuplicate(String text) {
    String longest = "";
    for (int i = 0; i < text.length() -  longest.length() * 2; i++) {
        OUTER:
        for (int j = longest.length() + 1; j * 2 < text.length() - i; j++) {
            String find = text.substring(i, i + j);
            for (int k = i + j; k <= text.length() - j; k++) {
                if (text.substring(k, k + j).equals(find)) {
                    longest = find;
                    continue OUTER;
                }
            }
            break;
        }
    }
    return longest;
}
public static String findLongestSubstring(String value) {
    String[] strings = new String[value.length()];
    String longestSub = "";

    //strip off a character, add new string to ch
    for(int i = 0; i < value.length(); i++){
      strings[i] = new String(value.substring(i));
    }

    //debug/visualization
    //before sort
    for(int i = 0; i < strings.length; i++){
  //      System.out.println(strings[i]);
    }

    Arrays.sort(strings);
//    System.out.println();

    //debug/visualization
    //after sort
    for(int i = 0; i < strings.length; i++){
   //     System.out.println(strings[i]);
    }

    Vector<String> possibles = new Vector<String>();
    String temp = "";
    int curLength = 0, longestSoFar = 0;

    /*
     * now that the ch is sorted compare the letters
     * of the current index to those above, continue until 
     * you no longer have a match, check length and add
     * it to the vector of possibilities
     */ 
    for(int i = 1; i < strings.length; i++){
        for(int j = 0; j < strings[i-1].length(); j++){
            if (strings[i-1].charAt(j) != strings[i].charAt(j)){
                break;
            }
            else{
                temp += strings[i-1].charAt(j);
                curLength++;
            }
        }
        //this could alleviate the need for a vector
        //since only the first and subsequent longest 
        //would be added; vector kept for simplicity
        if (curLength >= longestSoFar){
            longestSoFar = curLength;
            possibles.add(temp);
        }
        temp = "";
        curLength = 0;
    }

 //   System.out.println("Longest string length from possibles: " + longestSoFar);

    //iterate through the vector to find the longest one
    int max = 0;
    for(int i = 0; i < possibles.size();i++){
        //debug/visualization
//        System.out.println(possibles.elementAt(i));
        if (possibles.elementAt(i).length() > max){ 
            max = possibles.elementAt(i).length();
            longestSub = possibles.elementAt(i);
        }
    }
 //   System.out.println();
    //concerned with whitespace up until this point
    // "lemon" not " lemon" for example
    return longestSub.trim(); 
}
}
