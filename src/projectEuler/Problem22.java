package projectEuler;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Problem22 {
public static void main(String[] args) throws IOException{
	int count=0;
	long add=0;
	BufferedReader sd=new BufferedReader(new FileReader("c:\\names.txt"));
	String s=sd.readLine();
//	System.out.println(s);
	String[] out=s.split(",");
	Arrays.sort(out);
	for(int i=0;i<out.length;i++){
		count++;
		int sum=0;
		for(int j=0;j<out[i].length();j++){
			if(out[i].charAt(j)=='"'){
				continue;
			}
			int k=out[i].charAt(j);
			k=k-64;
			sum=sum+k;
		}
		add=add+ sum*count;
		System.out.println(out[i]+" "+count+" "+sum);
	//	System.out.println(out[i]);
		
	}
	System.out.println(add);
}
}
