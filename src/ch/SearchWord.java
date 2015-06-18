package ch;

public class SearchWord {
	public static void main(String[] args) {
		String s="Naman is a boy",n="is";
		int count=0;
		//System.out.println(s.indexOf(n));
		for(int i=0;i<s.indexOf(n);i++){
			if(s.charAt(i)==' ')
				count++;
		}
		System.out.printf("'%s' is %dth word in the sentence '%s'",n,count+1,s);
	}
}
