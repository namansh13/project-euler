package ch;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentenceStack {
	public static void main(String str[]) {
	String s;
	Scanner q=new Scanner(System.in);
	System.out.print("Enter the sentence : ");
	s=q.nextLine();
	Stack<String> n=new Stack<String>();
	Scanner t=new Scanner(s);
	while(t.hasNext()){
		n.push(t.next());
	}
	do{
		System.out.print(n.pop());
		if(n.isEmpty()){
			break;
		}
		System.out.print(" ");
	}while(true);
	}
}
