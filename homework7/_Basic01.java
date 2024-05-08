package homework7;

import java.util.Scanner;

public class _Basic01 {

	public static void main(String[] args) {
		// 1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 1번을 입력하세요.");
		StringBuffer userStr1 = new StringBuffer(sc.nextLine());
		
		System.out.println("문자열 2번을 입력하세요.");
		StringBuffer userStr2 = new StringBuffer(sc.nextLine());
		
		System.out.println("문자열 3번을 입력하세요.");
		StringBuffer userStr3 = new StringBuffer(sc.nextLine());
		
		StringBuffer result = new StringBuffer();
		
		result = userStr1.append(userStr2).append(userStr3);
		
		System.out.println("문자열 3개를 합친 결과 : ");
		System.out.println(result);

	}

}
