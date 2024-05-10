package _10_usefulclass;

import java.util.Calendar;

public class _01_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Calendar 객체를 오늘날짜로 생성하세요.
//		   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//		   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
//
//		

		
		Calendar today = Calendar.getInstance();
		today.set( 2024, 3, 8);
		today.add(today.YEAR,5);
		today.add(today.MONTH,2);
		today.add(today.DATE,3);
		System.out.println(DateToString(today));
	}
		
		public static String DateToString(Calendar today) {
		     
		  return today.get(Calendar.YEAR) + "년" +
		  		(today.get(Calendar.MONTH)+1)  + "월" +
		  		 today.get(Calendar.DATE) + "일";
		}

		
	

}
