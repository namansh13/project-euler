package projectEuler;

public class Problem467 {
	public static void main(String[] ars) {
		System.out.println(superString("naman", "sharma").length());
		// System.out.println(superString("naman","sharma"));
	}

	public static String superString(String a, String b) {
		String ss = "";
		int a1 = 0, b1 = 0;

		/*while (a1 < a.length() && b1 < b.length()) {
			int i = a.charAt(a1);
			int j = b.charAt(b1);
			if (i > j) {
				temp = a;
				a = b;
				b = temp;
				System.out.println("yes");
				break;
			} else if (i < j) {
				break;
			} else {
				a1++;
				b1++;
			}

		}*/
		System.out.println(a.substring(1).toLowerCase());
		// System.out.println(a + " " + b);
		String q=null;
		// System.out.println(a.substring(a1).indexOf(b.charAt(b1)));
		 a1 = 0;
		 b1 = 0;
		// if (a.charAt(0) > b.charAt(0)) {
		while (a1 < a.length() || b1 < b.length()) {
			// System.out.println(ss+" "+a1+" "+b1);
			if (a1 < a.length() && b1 < b.length()) {
				if (a.substring(a1).toLowerCase().indexOf(b.toLowerCase().charAt(b1)) > 0) {
					int count = 0;
					while (a.substring(a1).toLowerCase().indexOf(b.toLowerCase().charAt(b1)) >= count) {
						ss = ss + a.substring(a1).charAt(count);
						// a1++;
						count++;
					}
					a1 = a1 + count;
					b1++;
					count = 0;
					q = "loop 1";

				} else if (b.substring(b1).toLowerCase().indexOf(a.toLowerCase().charAt(a1)) > 0) {
					int count = 0;
					// System.out.println(b.substring(b1).indexOf(a.charAt(a1)));
					while (b.substring(b1).toLowerCase().indexOf(a.toLowerCase().charAt(a1)) >= count) {
						ss = ss + b.substring(b1).charAt(count);
						// b1++;
						count++;
						// System.out.println(ss);
					}
					b1 = b1 + count;
					count = 0;
					a1++;
					q = "loop 2";
				} else if (a.toLowerCase().charAt(a1) < b.toLowerCase().charAt(b1)) {
					ss = ss + a.charAt(a1);
					a1++;
					q = "loop 3";
				} else if (a.toLowerCase().charAt(a1) == b.toLowerCase().charAt(b1)) {
					ss = ss + a.charAt(a1);
					a1++;
					b1++;
					q = "loop 4";
				}

				else {
					ss = ss + b.charAt(b1);
					b1++;
					q = "loop 5";
					// a1++;
				}

				// System.out.println(ss + " " + a1 + " " + b1);
			} else if (a1 >= a.length()) {
				// b1=b1-1;
				ss = ss + b.charAt(b1);
				b1++;
				q = "loop 6";
				// System.out.println(ss + " " + a1 + " " + b1);
			} else {
				// a1=a1-1;
				ss = ss + a.charAt(a1);
				a1++;
				q = "loop 7";
				// System.out.println(ss + " " + a1 + " " + b1);
			}
			//System.out.println(ss + " " + a1 + " " + b1 + " " + q);
			// System.out.print(" "+q);
		}
		System.out.println(ss);
		return ss;
	}
}
