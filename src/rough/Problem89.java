package rough;

import java.io.*;

public class Problem89 {
	public static void main(String[] args) throws IOException {

		
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream("c:\\roman.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String[] s=new String[1001];
			int i=0;
			// Read File Line By Line
			while ((s[i] = br.readLine()) != null) {
				// Print the content on the console
		i++;
			
			}
			// Close the input stream
			in.close();
			int h=0;
			int co=0;
			String[] p=new String[1001];
			for(int k=0;k<i;k++){
			//	System.out.println(s[k]);
			int y=	roman.RomanToDecimal.number(s[k]);
			if(y>3999){
				co++;
			}
			p[h]=roman.Roman.roman(y);
		//	if(s[h]!=p[h]){
				
			
			System.out.println(s[h]+" "+p[h]+" "+y+" "+h);
		//	}
			h++;
			

			}
			int count=0;
			int sum1=0,sum=0;
			for(int j=0;j<i;j++){
				sum=sum+s[j].length();
				sum1=sum1+p[j].length();
					if(s[j].equals(p[j])){
					count++;
					
				}
				
			}
			System.out.println(sum+" "+sum1);
			System.out.println(sum-sum1);
			System.out.println(count);
			System.out.println(co);
			
			
		//System.out.println(i);
	}
	
}
