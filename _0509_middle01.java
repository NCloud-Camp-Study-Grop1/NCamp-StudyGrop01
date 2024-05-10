package homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _0509_middle01 {

    public static void main(String[] args) throws Exception {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("yyyy-MM-dd 형태로 입력해주세요 : ");
        String str = sc.nextLine(); // String 형식으로 입력 받음
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // SimpleDateFormat 형태

        
        // 입력된 문자열을 날짜로 파싱
        Calendar cal = Calendar.getInstance();
        cal.setTime(simpleDateFormat.parse(str));

        
        // 3일 후로 변경
        cal.add(Calendar.DATE, 3);

        
        // 출력 형식 지정
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        
        // 결과 출력
        String result = outputFormat.format(cal.getTime());
        System.out.println("3일 뒤 : " + result);
    }
}