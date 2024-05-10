package _10_usefulclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class _02_middle02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
//
		List<String> day = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		
		//날짜 입력받기 
		 System.out.println("날짜를 yyyy-MM-dd 형식으로 입력하세요:");
		 String inputDateStr = sc.nextLine();
	try {	 
		 //String 날짜를 Calendar로 변환
		 calendar.setTime(simpleDateFormat1.parse(inputDateStr));
		 
		 String[] dayArr = {"","일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		 System.out.println(inputDateStr +"은" + dayArr[calendar.get(Calendar.DAY_OF_WEEK)]+"입니다.");
		 
		} catch(ParseException pe) {
		 pe.getStackTrace(); 						
    	 System.out.println("잘못입력했습니다. yyyy-MM-dd 형식으로 입력하세요.");
		
		}
	}
}


