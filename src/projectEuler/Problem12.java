package projectEuler;


public class Problem12 {
	public static int factor(long n){
		int count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				count++;
		}
	return count+2;
	}
public static void main(String[] args){

int count=0;
long n;
	for(long i=10000;i<=100000;i++){
		n=(i*(i+1))/2;

count=projectEuler.Problem12.factor(n);
		
		if(count>500){
		System.out.println(n+" "+count);
	}
	}
	
}
}