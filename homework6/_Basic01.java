package homework6;

import java.util.Scanner;

public class _Basic01 {

	public static void main(String[] args) {
		// 1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
		//    0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한글을 입력하세요.");
		String userStr = sc.nextLine();
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < userStr.length(); i++) {
			if(userStr.charAt(i) == '가') {
				sum1++;
			}
			else if(userStr.charAt(i) == '바') {
				sum2++;
			}
		}
		if(sum1 == 0 && sum2 == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		} else {
			System.out.println("가 개수는 " + sum1 + ", 바 개수는 " + sum2 + "개입니다.");
		}
	}

}
