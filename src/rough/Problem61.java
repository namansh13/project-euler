package rough;

public class Problem61 {

	public static void main(String... args) {
		long e,s;
		s=System.currentTimeMillis();
		octagonal();
		System.out.println(istriangle(10));
		e=System.currentTimeMillis();
		System.out.printf("Total time taken : %d ms",(e-s));
	}

	public static void octagonal() {
		int n = 0, a = 1;
		int count = 0;
		while (n < 9999) {
			//n = a * (3 * a - 2); // octagonal
			n = a * (a + 1) / 2; // triangle
			a++;
			if (n > 1000) {
				System.out.println(n);
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean istriangle(int n){
		if(n<1){
			return false;
		}
		double k=(Math.sqrt(1+8*n)-1)/2;
		if(k==(int)k){
			return true;
		}
		return false;
	}
	
	public static boolean issquare(int n){
		if(n<1){
			return false;
		}
		double k=Math.sqrt(n);
		if(k==(int)k){
			return true;
		}
		return false;
	}
	
	public static boolean ispentagon(int n){
		if(n<1){
			return false;
		}
		double k=(1+Math.sqrt(1+24*n))/2;
		if(k==(int)k){
			return true;
		}
		return false;
	}
	
	
	public static boolean ishexagon(int n){
		if(n<1){
			return false;
		}
		double k=(1+Math.sqrt(1+8*n))/2;
		if(k==(int)k){
			return true;
		}
		return false;
	}
	
	public static boolean isheptagon(int n){
		if(n<1){
			return false;
		}
		double k=(3+Math.sqrt(9+40*n))/2;
		if(k==(int)k){
			return true;
		}
		return false;
	}

	public static boolean isoctagon(int n){
		if(n<1){
			return false;
		}
		double k=(2+Math.sqrt(4+12*n))/2;
		if(k==(int)k){
			return true;
		}
		return false;
	}
}
