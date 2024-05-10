package assignments08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Middle02_SimpleDateFormatWeek {

	public static void main(String[] args) {
		// generate Calendar Object
		Calendar oneDay = Calendar.getInstance();
		
        // 사용자로부터 YEAR, MONTH, DAY 값을 받기
        Scanner sc = new Scanner(System.in);

        System.out.println("사용자님 년에 해당하는 값을 입력해주세요.");
        int yearInput = sc.nextInt();
        int monthInput = monthMethod();
        int dayInput = dayMethod();
        
        oneDay.set(yearInput, monthInput - 1, dayInput);
        
        // generate WeekArr & dayOfWeek
     	String[] weekArr = {"0", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
     	int dayOfWeek = oneDay.get(Calendar.DAY_OF_WEEK);
     	String week = weekArr[dayOfWeek];
     	
        // SimpleDateFormat: 날짜 형식 변환
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateformat.format(oneDay.getTime());
        
        // 최종 날짜 출력
        System.out.println("사용자님께서 입력하신 날짜 및 해당 요일을 출력합니다.");
        System.out.println(formattedDate + "-" + week);
	}

    // month method
    public static int monthMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자님 달에 해당하는 값을 입력해주세요.");
        int month = sc.nextInt();
        if ((month >= 1) && (month <= 12)) {
            return month;
        } else {
            System.out.println("사용자님 1 ~ 12 사이의 숫자만 달로 지정할 수 있습니다.");
            return monthMethod(); // 재귀메소드 출력(재실행)
        }
    }

    // day method
    public static int dayMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자님 일에 해당하는 값을 입력해주세요.");
        int day = sc.nextInt();
        if ((day >= 1) && (day <= 31)) {
            return day;
        } else {
            System.out.println("사용자님 1 ~ 31 사이의 숫자만 달로 지정할 수 있습니다.");
            return dayMethod(); // 재귀메소드 출력(재실행)
        }
    }
}