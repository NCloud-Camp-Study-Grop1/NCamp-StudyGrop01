package _08_mix;

import java.util.Scanner;

public class _01_basic01 {
	
	
//  1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//  0개면 '가, 바가 존재하지 않습니다.'라고 출력.
//
//2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//  대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
//
//3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용

	public static void main(String[] args) {
  
	//  1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
	//  0개면 '가, 바가 존재하지 않습니다.'라고 출력.

		Scanner sc = new Scanner(System.in);

		char ga = '가';
		char ba = '바';

		int gaCnt = 0;
		int baCnt = 0;

		System.out.println("한글 문장을 입력하세요.");
		String str = sc.nextLine();

		char[] strArr = new char[str.length()];

		
		for(int i = 0 ; i < str.length(); i++) {
			strArr[i] = str.charAt(i);
		}

		for(int i = 0 ; i < str.length(); i++) {
			if(strArr[i]==(ga)) {
				++gaCnt;
				
			} else if(strArr[i]==(ba)) {
				++baCnt;
				
			} 
			
			
			
		}
		
		if(gaCnt == 0 && baCnt ==0){
			
			System.out.println("가, 바가 존재하지 않습니다.");
		}
		System.out.println("가의 갯수 :" + gaCnt);
		System.out.println("바의 갯수 :" + baCnt);

	}
}
