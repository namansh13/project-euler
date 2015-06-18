package projectEuler;

public class Problem2 {
	public static void main(String[] args){
long i=0;
long j=1;
long f,sum=0;
do{
	f=i+j;
//	System.out.println(f);
	if(f%2==0){
		sum=sum+f;
	}
	i=j;
	j=f;
}while(f<4000000);
System.out.println(sum);
	}
}
