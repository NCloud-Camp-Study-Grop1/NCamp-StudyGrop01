package _10_usefulclass;

import java.util.Calendar;

public class _01_basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	2. Calendar 객체를 오늘날짜로 생성하세요.
//		   오늘날짜를 2023-03-24 형식으로 출력하세요.
//		   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
//
		
		Calendar today = Calendar.getInstance();
		
		System.out.println(
					today.get(Calendar.YEAR) + "-" + 
					((today.get(Calendar.MONTH)-1) < 10
						? "0" + (today.get(Calendar.MONTH)+1) 
						:(today.get(Calendar.MONTH)+1)) + "-" +
						
					(today.get(Calendar.DATE) < 10
						? "0" + today.get(Calendar.DATE)
						: today.get(Calendar.DATE))
				
						);
		
		
		System.out.println(
				today.get(Calendar.YEAR) + "년 " + 
				((today.get(Calendar.MONTH)-1) < 10
					? "0" + (today.get(Calendar.MONTH)+1) 
					:(today.get(Calendar.MONTH)+1)) + "월 " +
					
				(today.get(Calendar.DATE) < 10
					? "0" + today.get(Calendar.DATE)
					: today.get(Calendar.DATE))+ "일 " +
				
				(today.get(Calendar.HOUR_OF_DAY) < 10
						? "0" + today.get(Calendar.HOUR_OF_DAY)
						: today.get(Calendar.HOUR_OF_DAY))+ "시 " +
						
				(today.get(Calendar.MINUTE) < 10
						? "0" + today.get(Calendar.MINUTE)
						: today.get(Calendar.MINUTE))+ "분 " +
					
				(today.get(Calendar.SECOND) < 10
						? "0" + today.get(Calendar.SECOND)
						: today.get(Calendar.SECOND))+ "초 " 
					);

	}

}
