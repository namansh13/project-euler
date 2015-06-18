package projectEuler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem54 {

	public static void main(String[] args) throws IOException {
		long e, st;
		int counta = 0;
		int countd = 0, countb = 0;
		st = System.currentTimeMillis();
		int[][] a = new int[5][2];
		int[][] a1 = new int[5][2];
		int[][] b = new int[5][2];
		int[][] b1 = new int[5][2];
		int x, y;
		int count = 0;
		FileInputStream fstream = new FileInputStream("c:\\poker.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String[] s = new String[1001];
		y = 0;
		while ((s[y] = br.readLine()) != null) {
			y++;
		}
		in.close();
		for (int t = 0; t < s.length; t++) {
			if (s[t] != null) {
				count = 0;
				for (int i = 0; i < 14; i = i + 3) {
					if (s[t].charAt(i) == 'T') {
						a[count][0] = 10;
					} else if (s[t].charAt(i) == 'J') {
						a[count][0] = 11;
					} else if (s[t].charAt(i) == 'Q') {
						a[count][0] = 12;
					} else if (s[t].charAt(i) == 'K') {
						a[count][0] = 13;
					} else if (s[t].charAt(i) == 'A') {
						a[count][0] = 14;
					} else {
						a[count][0] = s[t].charAt(i) - 48;
					}
					a[count][1] = s[t].charAt(i + 1);
					count++;
				}
				count = 0;
				for (int i = 15; i < 29; i = i + 3) {
					if (s[t].charAt(i) == 'T') {
						b[count][0] = 10;
					} else if (s[t].charAt(i) == 'J') {
						b[count][0] = 11;
					} else if (s[t].charAt(i) == 'Q') {
						b[count][0] = 12;
					} else if (s[t].charAt(i) == 'K') {
						b[count][0] = 13;
					} else if (s[t].charAt(i) == 'A') {
						b[count][0] = 14;
					} else {
						b[count][0] = s[t].charAt(i) - 48;
					}
					b[count][1] = s[t].charAt(i + 1);
					count++;
				}
				count = 0;
				x = priority(poker(a, a1));
				y = priority(poker(b, b1));
				arraysort(a1);
				arraysort(b1);
				if (x > y) {
					// System.out.println("first player");
					counta++;
				} else if (x == y) {
					if (samepriority(a1, b1) == 1) {
						// System.out.println("first player");
						counta++;
					} else if (samepriority(a1, b1) == 2) {
						// System.out.println("second player");
						countb++;
					} else {
						// System.out.println("draw");
						countd++;
					}
				} else {
					// System.out.println("second player");
					countb++;
				}
			}
		}
		System.out.println("A wins : " + counta + " times");
		e = System.currentTimeMillis();
		System.out.println("Total time taken : " + (e - st) + " ms");
	}

	public static String poker(int[][] c, int[][] c1) {
		int x = 0;
		int count = 1;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < 5; i++) {
			if (c[i][0] > 0) {
				for (int j = i + 1; j < 5; j++) {
					if (c[i][0] == c[j][0]) {
						count++;
						c[j][0] = 0;
					}
				}
				if (count == 1) {
					c1[x][0] = c[i][0];
					c1[x][1] = count;
					x++;
				}
				if (count == 2) {
					count2++;
					c1[x][0] = c[i][0];
					c1[x][1] = count;
					x++;
				}
				if (count == 3) {
					count3++;
					c1[x][0] = c[i][0];
					c1[x][1] = count;
					x++;
				}
				if (count == 4) {
					count4++;
					c1[x][0] = c[i][0];
					c1[x][1] = count;
					x++;
				}
			}
			count = 1;
		}
		if (count3 == 1 && count2 == 1) {
			return "full house";
		} else if (count2 == 1) {
			return "one pair";
		} else if (count3 == 1) {
			return "three of a kind";
		}
		if (count2 == 2) {
			return "two pairs";
		}
		if (count4 == 1) {
			return "four of a kind";
		}
		x = 0;
		c1 = new int[5][2];
		int k = ((2 * min(c) + 4) * 5) / 2;
		if (k == sum(c)) {

			if (suit(c) == "same suit") {
				if (min(c) == 10) {
					c1[x][0] = min(c);
					x++;
					return "royal flush";
				} else
					c1[x][0] = min(c);
				x++;
				return "straight flush";
			} else {
				c1[x][0] = min(c);
				x++;
				return "straight";
			}
		}
		if (suit(c) == "same suit") {

			c1[x][0] = max(c);
			x++;
			return "flush";
		}
		c1[x][0] = min(c);
		x++;
		return "null";
	}

	public static int min(int[][] a) {
		int min = a[1][0];
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] < min) {
				min = a[i][0];
			}
		}
		return min;
	}

	public static int max(int[][] a) {
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] > max) {
				max = a[i][0];
			}
		}
		return max;
	}

	public static int sum(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i][0];
		}
		return sum;
	}

	public static String suit(int[][] a) {
		if (a[0][1] == a[1][1] && a[0][1] == a[2][1] && a[0][1] == a[3][1]
				&& a[0][1] == a[4][1]) {
			return "same suit";
		} else
			return "different suit";
	}

	public static int priority(String s) {
		int p = 0;
		if (s == "null") {
			p = 1;
		}
		if (s == "one pair") {
			p = 2;
		}
		if (s == "two pairs") {
			p = 3;
		}
		if (s == "three of a kind") {
			p = 4;
		}
		if (s == "straight") {
			p = 5;
		}
		if (s == "flush") {
			p = 6;
		}
		if (s == "full house") {
			p = 7;
		}
		if (s == "four of a kind") {
			p = 8;
		}
		if (s == "straight flush") {
			p = 9;
		}
		if (s == "royal flush") {
			p = 10;
		}
		return p;
	}

	public static int samepriority(int[][] a, int[][] b) {
		for (int i = 0; i < 5; i++) {
			if (a[i][0] > b[i][0]) {
				return 1;
			} else if (a[i][0] < b[i][0]) {
				return 2;
			}
		}
		return 0;
	}

	public static void arraysort(int[][] a) {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (a[i][1] < a[j][1]) {
					int temp = a[i][1];
					a[i][1] = a[j][1];
					a[j][1] = temp;
					temp = a[i][0];
					a[i][0] = a[j][0];
					a[j][0] = temp;
				} else if (a[i][1] == a[j][1]) {
					if (a[i][0] < a[j][0]) {
						int temp = a[i][1];
						a[i][1] = a[j][1];
						a[j][1] = temp;
						temp = a[i][0];
						a[i][0] = a[j][0];
						a[j][0] = temp;
					}
				}
			}
		}
	}

}
