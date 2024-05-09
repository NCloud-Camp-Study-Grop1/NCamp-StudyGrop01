package _09_usefulclass;

import java.util.Scanner;

public class _01_basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
//
//		
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer str1 = new StringBuffer();
		
		
		
		for(int i = 0; i < 3; i++) {
		System.out.println("문자열을 입력하세요.");
			str1.append(sc.nextLine());
			
		}
		
		
		System.out.println(str1);
		
		
		
		
		

	
	}

}
