package _10_usefulclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_advance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
//	    
//	2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//	    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).
//	    ex) 2023-01-29 2023-02-05 입력
//		출력       2023-01-29
//	             2023-01-30
//	             2023-01-31
//	             2023-02-01
//	             2023-02-02
//	             2023-02-03
//	             2023-02-04
//	             2023-02-05
//
//	3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력
		
		Scanner sc = new Scanner(System.in);
		List<Integer> listInt = new ArrayList<>();
		for(int i =0; i <5; i++) {
			System.out.println("정수를 입력하세요.");
			 listInt.add(sc.nextInt());
		}

			for(int i = 0; i < 5; i++) {
			int sum = listInt.get(i) + listInt.get(i+1);
				if(sum )
				}
			
		

		
		
		
//
//	4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		
		
	}

}
