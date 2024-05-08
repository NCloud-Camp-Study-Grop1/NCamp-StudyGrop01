package _08_mix;

import java.util.Scanner;

public class _02_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
//	    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
//
//	2. 1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
//	   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.bit => 0, 4, 8 com => 1, 5, 9 sql => 2, 6, 10 int => 3, 7, 11
//
//	3. 처음에 은행에 맡긴 돈은 10000원입니다
//	   금리는 연 10%입니다
//	   복리이자로 계산했을 때 10년후 얼마가 될까요?
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		char[] strArr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			strArr[i] = str.charAt(i);
	}
		
		// 문자열의 가운데 인덱스를 계산
		int middleIndex = str.length() / 2;
		

		// 문자열의 길이가 짝수일 경우
		if(str.length() % 2 == 0) {
		    // 가운데 두 문자를 출력하기
		    System.out.println(strArr[middleIndex - 1] + "" + strArr[middleIndex]);
		} else { // 문자열의 길이가 홀수일 경우
		    // 가운데 문자를 출력
		    System.out.println(strArr[middleIndex]);
		}
	}
}
