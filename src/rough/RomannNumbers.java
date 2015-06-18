package rough;

import roman.Roman;

public class RomannNumbers {
	public static void main(String[] args){
		
		
		for(int i=0;i<5000;i++){
			System.out.println(Roman.roman(i)+" "+i);
		}
	}

}
