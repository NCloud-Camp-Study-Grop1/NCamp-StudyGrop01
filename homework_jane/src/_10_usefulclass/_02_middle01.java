package _10_usefulclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _02_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
//
//		Date를 Calendar타입으로 변환
//		Date d = new Date();
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);
		
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		
		
		Calendar calendar = Calendar.getInstance();
     try {
	    System.out.println("날짜를 yyyy-MM-dd 형식으로 입력하세요:");
	    String inputDateStr = sc.nextLine();
	    
	    //parse로 string -> calendar로 변환후 calendar에 새롭게 set함.
	    calendar.setTime(simpleDateFormat1.parse(inputDateStr));
	   
	    //3일 뒤로 변경
	    calendar.add(Calendar.DATE,3);
	    calendar.getTime();
	    
	    System.out.println(simpleDateFormat1.format(calendar.getTime()));
	    
     } catch (ParseException pe) {
    	 pe.getStackTrace(); 						//print ? get ?
    	 System.out.println("잘못입력했습니다. yyyy-MM-dd 형식으로 입력하세요.");
    	 
     }
	   
	   
	    
//내가 푼것.
//		System.out.println(calendar);
		
//		Calendar cal =  Calendar.getInstance();
//		cal.set(2018, 6, 7);
//	
//		//1. Calendar 객체를 Date객체로 변환
//		// Date 생성자에 매개변수로 Calendar객체의 getTimeInMills() 메소드를 전달 
//		Date date = new Date(cal.getTimeInMillis());
//		
//		//2. Date 객체를 Calendar 객체로 변환
//		Calendar cal2 = Calendar.getInstance();
//		
//		//Calendar 객체의 setTime메소드의 매개변수로 Date객체 전달 
//		cal2.setTime(date);
//		
//		//3. Date객체는 toStirng이 오버라이드 되어있다. 
//		System.out.println(date);
//		System.out.println(cal2);
		
		
		
//		
//		
		

	}

}
