package projectEuler;

public class Problem19 {
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
		int n;
		if (s == "Janurary") {
			return  n = 31;
		}
		if (s == "February" && year % 100 == 0) {
			if (year % 400 == 0) {
				return n = 29;
			} else {
				return n = 28;
			}

		}
		if (s == "February" && year % 4 == 0) {
			return n = 29;
		}
		if (s == "February" && year % 4 != 0) {
			return n = 28;
		}

		if (s == "March") {
			return n = 31;
		}
		if (s == "April") {
			return n = 30;
		}
		if (s == "May") {
			return n = 31;
		}
		if (s == "June") {
			return n = 30;
		}
		if (s == "July") {
			return n = 31;
		}
		if (s == "August") {
			return n = 31;
		}
		if (s == "September") {
			return n = 30;
		}
		if (s == "October") {
			return n = 31;
		}
		if (s == "November") {
			return n = 30;
		} else {
			return n = 31;
		}

	}

	public static void main(String[] args) {
		long e,s;
		s=System.currentTimeMillis();
		int m = 1;
		int d = 1;
		int count = 0;
		int year = 1900;
		int yeartill = 2014;
		int ans = 0;
		do {
			int k=d;
			if (m == 13) {
				m = 1;
			}
			String month = month(m);
			int totalDays = days(month, year);
			int date = 1;
			System.out.println(month+" "+year);
			System.out.println();
		//	System.out.println(day((k%7)).charAt(0)+day(k%7).charAt(0)+" "+day((k+1)%7).charAt(0)+day((k+1)%7).charAt(1)+" "+day((k+2)%7).charAt(0)+day((k+2)%7).charAt(1)+ +day((k+3)%7).charAt(0)+day((k+3)%7).charAt(1)+" "+day((k+4)%7).charAt(0)+day((k+4)%7).charAt(1)+" "+day((k+5)%7).charAt(0)+day((k+5)%7).charAt(1)+" "+day((k+6)%7).charAt(0)+day((k+6)%7).charAt(1));
			System.out.println(day((k)%7).substring(0, 2)+" "+day((k+1)%7).substring(0, 2)+" "+day((k+2)%7).substring(0, 2)+" "+day((k+3)%7).substring(0, 2)+" "+day((k+4)%7).substring(0, 2)+" "+day((k+5)%7).substring(0, 2)+" "+day((k+6)%7).substring(0, 2));
		//	System.out.println("Su Mo Tu We Th Fr Sa");
			int h=0;
			do {
				if (d == 8) {
					
					d = 1;
					
				}
				if(h%7==0){
					System.out.println();
				}
				
				String day = day(d);
			//	System.out.println(date + " " + day + " " + month + " " + year);
				if(date<10){
					
					
				System.out.print("0"+date+" ");
				}
				else{
					System.out.print(date+" ");
				}
				if (date == 1 && day == "Sunday"&&year!=1900) {
					ans++;
				//	System.out.println(date + " " + day + " " + month + " " + year);
				}
				
				h++;
				date++;
				d++;
				count++;
			} while (date <= totalDays);
			System.out.println();
			if (date == 32 && month == "December") {
				year++;
				System.out.println("------------------------------");
			}
			m++;
			System.out.println();
		} while (year < yeartill);
	//	System.out.println(count + " " + ans);
		e=System.currentTimeMillis();
	//	System.out.println(e-s);
	}
}
