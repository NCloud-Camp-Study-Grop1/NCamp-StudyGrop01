package homework8;

import java.util.Calendar;

public class _Basic01 {

	public static void main(String[] args) {
		// 1. Calendar 객체를 오늘날짜로 생성하세요.
		//    객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		//    위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		
		// 오늘 날짜 불러오기
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 4, 8);
		System.out.println("기존 날짜는 " + calendar.get(Calendar.YEAR) + "년 " + 
				calendar.get(Calendar.MONTH) + "월 " 
				+ calendar.get(Calendar.DATE) + "일");
		
		// 5년 추가
		calendar.add(Calendar.YEAR, 5);
		
		// 2달 추가
		calendar.add(Calendar.MONTH, 2);
		
		// 3일 추가
		calendar.add(Calendar.DATE, 3);
		

		System.out.println("바뀐 날짜는 " + calendar.get(Calendar.YEAR) + "년 " + 
				calendar.get(Calendar.MONTH) + "월 " 
				+ calendar.get(Calendar.DATE) + "일");
		

	}

}
