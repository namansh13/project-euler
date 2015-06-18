package projectEuler;

public class Problem33 {
	public static void main(String[] args) {
		double s,e;
		s=System.currentTimeMillis();
		float i = 1, j, a, b, c, d,count=0,n=1,de=1;
		do {
			j = i + 1;
			do {
				a = i % 10;
				b = (i - a) / 10;
				c = j % 10;
				d = (j - c) / 10;
				if (a != 0 && b != 0 && c != 0 && d != 0) {
					if (a == d && (b / c) == i / j) {
						n=n*b;
						de=de*c;
						System.out.println(b +" "+ c);
						count++;
					} else if (b == c && a / d == i / j) {
						n=n*a;
						de=de*d;
						System.out.println(a +" "+ d);
						count++;
					}
				}

				j++;
			} while (j < 100);
			i++;
		} while (i < 100);
		System.out.println(count+" "+n/de);
		e=System.currentTimeMillis();
		System.out.println(e-s+" "+e);
	}
}
