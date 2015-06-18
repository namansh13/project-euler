package projectEuler;

public class Problem309 {
	public static void main(String[] args) {
		long s, e;
		s = System.currentTimeMillis();
		double h;
		int i, j, count = 0;
		int limit = 10000;
		for (int x = 1; x < limit; x++) {

			for (int y = x + 1; y < limit; y++) {
				i = 1;
				for (int w = 1; w < x; w++) {
					h = 1 / ((1 / Math.sqrt(y * y - w * w)) + 1 / Math.sqrt(x
							* x - w * w));
					if (h == (int) h && h > 0) {
						System.out.println(x + " " + y + " " + h + " " + w);
						count++;
						i = 0;
						break;
					}
				}
				if (i == 0) {
					break;
				}
			}
			
		}
		System.out.println("Total count : " + count);
		e = System.currentTimeMillis();
		System.out.println("Total time taken : " + (e - s) + " ms");
	}
}
