package homework8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _Middle01 {

	public static void main(String[] args) throws ParseException {
		// 1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
	    //    yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. 
		//    SimpleDateFormat의 parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요. (양식 : yyyy-mm-dd) : ");
		// 2022-04-29
		
		// 사용자가 입력한 날짜 저장
		String userStr = sc.nextLine();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// 사용자가 입력한 날짜 저장할 Calendar, 현재 시간으로 저장되어 있음
		Calendar userCalendar = Calendar.getInstance();
		
		// 유저가 입력한 날짜 Calender로 변환
		// setTime => Calendar의 시간값을 변경하는 데 사용,
		// parse => String에서 Calendar로 변경
		userCalendar.setTime(simpleDateFormat.parse(userStr));
		// 즉 사용자가 입력한 값을 Calendar로 변경, 그 값을 setTime을 이용하여 시간값을 변경
		
		// 사용자가 입력한 날짜에서 3일 추가
		userCalendar.add(Calendar.DATE, 3);
		
		// getTime => 해당 Calendar가 나타내는 시간을 Date로 변환
		Date userDate = userCalendar.getTime();
		
		// SimpleDateFormat => Date 객체만 출력	
		System.out.println(simpleDateFormat.format(userDate));
		

	}

}
