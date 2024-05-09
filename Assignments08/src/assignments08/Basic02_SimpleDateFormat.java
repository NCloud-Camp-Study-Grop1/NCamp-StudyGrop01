package assignments08;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Basic02_SimpleDateFormat {

	public static void main(String[] args) {
		// generate Date Object
		Date oneDay = new Date();
		
		// change DateFormat1
		SimpleDateFormat oneDayFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Pt1. 날짜 형식 변경: 2023-03-24");
		System.out.println(oneDayFormat1.format(oneDay));
		System.out.println("--------------------------------------");
		
		// change DateFormat
		SimpleDateFormat oneDayFormat2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("Pt2. 날짜 형식 변경: 2023년 03월 24일 HH시 MM분 SS초");
		System.out.println(oneDayFormat2.format(oneDay));
	}
	
}
