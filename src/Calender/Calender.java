package Calender;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.fusesource.jansi.AnsiConsole;

public class Calender {
	public static String day(int n) {
		if (n == 1) {
			return "Monday";
		}
		if (n == 2) {
			return "Tuesday";
		}
		if (n == 3) {
			return "Wednesday";
		}
		if (n == 4) {
			return "Thursday";
		}
		if (n == 5) {
			return "Friday";
		}
		if (n == 6) {
			return "Saturday";
		} else {
			return "Sunday";
		}
	}

	public static String month(int n) {
		if (n == 1) {
			return "January";
		}
		if (n == 2) {
			return "February";
		}
		if (n == 3) {
			return "March";
		}
		if (n == 4) {
			return "April";
		}
		if (n == 5) {
			return "May";
		}
		if (n == 6) {
			return "June";
		}
		if (n == 7) {
			return "July";
		}
		if (n == 8) {
			return "August";
		}
		if (n == 9) {
			return "September";
		}
		if (n == 10) {
			return "October";
		}
		if (n == 11) {
			return "November";
		} else {
			return "December";
		}

	}

	public static int days(String s, int year) {
		if (s == "Janurary") {
			return 31;
		}
		if (s == "February" && year % 100 == 0) {
			if (year % 400 == 0) {
				return 29;
			} else {
				return 28;
			}
		}
		if (s == "February" && year % 4 == 0) {
			return 29;
		}
		if (s == "February" && year % 4 != 0) {
			return 28;
		}
		if (s == "March") {
			return 31;
		}
		if (s == "April") {
			return 30;
		}
		if (s == "May") {
			return 31;
		}
		if (s == "June") {
			return 30;
		}
		if (s == "July") {
			return 31;
		}
		if (s == "August") {
			return 31;
		}
		if (s == "September") {
			return 30;
		}
		if (s == "October") {
			return 31;
		}
		if (s == "November") {
			return 30;
		} else {
			return 31;
		}
	}

	public static int yearFrom(int yearfrom) {
		int m = 1;
		int d = 1;
		int count = 0;
		int year = 1;
		if (yearfrom == 1900) {
			return d = 1;
		}
		do {
			if (m == 13) {
				m = 1;
			}

			String month = month(m);
			int totalDays = days(month, year);
			int date = 1;
			do {
				if (d == 8) {
					d = 1;
				}
				date++;
				d++;
				count++;
			} while (date <= totalDays);
			if (date == 32 && month == "December") {
				year++;
			}
			m++;
		} while (year < yearfrom);
		return d;
	}

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date todaydate = new Date();
		int m = 1;
		int redmonth = 1;
		int redyear = 1;
		int count = 0;
		int yearfrom;
		int yeartill;
		Scanner q = new Scanner(System.in);
		System.out.print("From Year : ");
		yearfrom = q.nextInt();
		System.out.print("Till Year : ");
		yeartill = q.nextInt() + 1;
		int d = (yearFrom(yearfrom)) % 7;
		System.out.println();
		int ans = 0;
		do {
			if (Integer.parseInt(dateFormat.format(todaydate).substring(0, 4)) == yearfrom) {
				redyear = 0;
			}
			int k = (d - 1);
			if (m == 13) {
				m = 1;
			}
			String month = month(m);
			if (Integer.parseInt(dateFormat.format(todaydate).substring(5, 7)) == m) {
				redmonth = 0;
			}
			int totalDays = days(month, yearfrom);
			int date = 1;
			System.out.println(month + " " + yearfrom);
			System.out.println();

			System.out.println("Mo Tu We Th Fr Sa Su");

			int h;
			h = d - 1;
			k = k % 7;

			if (k > 0) {
				do {

					System.out.print("   ");
					k--;
				} while (k >= 1);
			}

			do {
				if (d == 8) {
					d = 1;
				}
				if (h % 7 == 0 && date != 1) {
					System.out.println();
				}
				String day = day(d);
				if (date < 10) {
					if (redyear == 0
							&& redmonth == 0
							&& Integer.parseInt(dateFormat.format(todaydate)
									.substring(8, 10)) == date) {
						AnsiConsole.out.print("\033[31m" + " " + date + " "
								+ "\033[37m");

					} else {
						System.out.print(" " + date + " ");
					}
				} else {
					if (redyear == 0
							&& redmonth == 0
							&& Integer.parseInt(dateFormat.format(todaydate)
									.substring(8, 10)) == date) {
						AnsiConsole.out.print("\033[31m" + date + " "
								+ "\033[37m");

					} else {
						System.out.print(date + " ");
					}
				}
				if (date == 1 && day == "Sunday" && yearfrom != 1900) {
					ans++;
				}
				h++;
				date++;
				d++;
				count++;
			} while (date <= totalDays);
			System.out.println();
			if (date == 32 && month == "December") {
				yearfrom++;
				System.out.println("--------------------------");
			}
			m++;
			redyear = 1;
			redmonth = 1;
			System.out.println();
		} while (yearfrom < yeartill);
	}
}
