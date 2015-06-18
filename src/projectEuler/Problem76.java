package projectEuler;

public class Problem76 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if (i + j == 10) {
					System.out.println(i + " + " + j + " = " + 10);
					count++;
				}
			}
		}

		System.out.println(count);
	}
	public static int factors(int n){
		for(int i=1;i<n/2;i++){
			for(int j=1;j<n;j++){
				if(i+j==n)
					return i;
			}
		}
		return 0;
	}

}
