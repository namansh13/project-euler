package ch;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args){
		String s="I am writing java program";
		Scanner q=new Scanner(System.in);
		
		//System.out.print("Enter the sentence : ");
		//s=q.next();
		//s=q.
		System.out.println(s.length());
		String[] r=s.split("\\s");
		System.out.println(r.length);
		for(int i=r.length-1;i>=0;i--){
			System.out.print(r[i]+" ");
		}
	}

}
