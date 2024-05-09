package assignments08;

import java.util.Calendar;

public class Basic01_CalendarOneDay {

	public static void main(String[] args) {
		// generate Calendar Object
		Calendar oneDay = Calendar.getInstance();
		System.out.println("Pt1. 현재 날짜로 출력했는지 확인");
		System.out.println(oneDay.get(Calendar.YEAR) + "년 " + (oneDay.get(Calendar.MONTH) + 1) + "월 "
				+ oneDay.get(Calendar.DATE) + "일");
		System.out.println("--------------------------------------");
		
		// set oneDay
		oneDay.set(2020, 4, 8);
		System.out.println("Pt2. 날짜를 2020년 4월 8일로 변경");
		System.out.println(oneDay.get(Calendar.YEAR) + "년 " + oneDay.get(Calendar.MONTH) + "월 "
				+ oneDay.get(Calendar.DATE) + "일");
		System.out.println("--------------------------------------");
		
		// add (5 years, 2 months, 3 dates)
		oneDay.add(Calendar.YEAR, 5);
		oneDay.add(Calendar.MONTH, 2);
		oneDay.add(Calendar.DATE, 3);
		System.out.println("Pt3. 5년 2개월 3일 뒤의 날짜 출력");
		printCalendar(oneDay);
	}
	// printCalendar method: month pt는 이미 1을 더해 오늘 날짜를 출력했으므로 더하지 않아도 됨.
	public static void printCalendar(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH) + "월 "
				+ cal.get(Calendar.DATE) + "일");
	}

}
