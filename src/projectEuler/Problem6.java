package projectEuler;

/**
 * @author nsharma4
 *
 */
public class Problem6 {
	public static void main(String[] args){
		long sum=0,s=0;
		for(int i=0;i<=100;i++){
			s=s+i;
			sum=(long) (sum + Math.pow(i, 2));
		}
		s=(long) Math.pow(s, 2);
	sum=s-sum;
	System.out.println(sum);
	}
	

}
