package projectEuler;

public class Problem5 {
public static void main(String[] args){
	long p=0,count=1;
/*	for(long i=6000000;i<=60000000;i++){
		for(int j=1;j<20;j++){
			if(i%j==0)
				count++;
		}
	if(count==20)
    p=i;
		
	}*/
	p=(long) ((long) Math.pow(2,4)*Math.pow(3,2)*Math.pow(5, 1)*Math.pow(7, 1)*11*13*17*19);
System.out.println(p);
}
}
