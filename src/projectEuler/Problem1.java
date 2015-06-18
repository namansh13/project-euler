package projectEuler;

public class Problem1 {
	protected static int tt=1;
public static void main(String[] args){
	int i;
	//int i=3,j=5,k=15;
	
	long sum1=0,sum2=0,sum3=0,sum;
	do{
		sum1=sum1+i;
		i=i+3;
	}while(i<1000);
	do{
		sum2=sum2+j;
		j=j+5;
	}while(j<1000);
	do{
		sum3=sum3+k;
		k=k+15;
	}while(k<1000);
	sum=sum1+sum2-sum3;
	int i=3,j=5,k=15;
	System.out.println(sum);
}
}
private class problem 2 extends{
	
}
