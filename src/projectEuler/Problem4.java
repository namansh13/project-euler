package projectEuler;

public class Problem4 {
public static int palindrome(int n){
	int count=0,c=0,r,b;
	r=n;
	
	do
	{
		b=n%10;
		n=n-b;
		n=n/10;
		c=c*10+b;
	}while(n>0);
	if (c==r){
count=count+1;		
	}
	return count;
}
public static void main(String[] args){
	int p,m,temp=0;
	for(int i=100;i<1000;i++){
		for(int j=100;j<1000;j++){
		p=j*i;
		m=Problem4.palindrome(p);
		if(m>0){
			temp=p;
			System.out.println(temp);
		}
		}
		
	}
//System.out.println("Largest Palindrome is : "+temp);
}
}
