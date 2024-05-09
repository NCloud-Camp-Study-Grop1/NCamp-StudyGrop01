package homework8;

import java.util.Calendar;

public class _Middle03 {

	public static void main(String[] args) {
		// 3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 
		//    2021-07-08 11:58:04의 차이를
		//    시 분 초 형태로 나타내시오.
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2023, 3, 15, 20, 31, 45);
		cal2.set(2021, 7, 8, 11, 58, 04);
		
		// getTimeInMillis() => 현재 날짜 시간을 밀리세컨드로 (long 타입으로)변환
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		
		// 시간
		long diffTime = diff / ((long)1000 * 60 * 60);
		diff %= ((long)1000 * 60 * 60);
		
		// 분
		long diffMin = diff / ((long)1000 * 60);
		diff %= ((long)1000 * 60);
		
		// 초
		long diffSec = diff / ((long)1000);
		
		System.out.println("cal1부터 cal2까지 " 
				 + diffTime + "시간 " + diffMin + "분 " + diffSec + "초가 지났습니다");
	}

}
