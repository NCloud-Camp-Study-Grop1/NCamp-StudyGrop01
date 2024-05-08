package _08_mix;

import java.util.Scanner;

public class _01_basic02 {
	public static void main(String[] args) {
		
	
	
	//2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//  대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
//


 
		Scanner sc = new Scanner(System.in);
		System.out.println("영어단어를 입력하세요");
		String alpha = sc.nextLine();
		
	
		String newStr = alpha.replaceAll("[aeiou]", "");
		
		System.out.println(newStr);

	
		//3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용
		
		double value = 16.459;
		
		double result = Math.round(value * 100) / 100.0; 
			System.out.println(result);
		
		
		
		
	}
}