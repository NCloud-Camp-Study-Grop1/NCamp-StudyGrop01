package _07_interface;

import java.util.Scanner;

public class Reverse {
	
//	1. Reverse라는 클래스를 만들고 메소드로 
//	   String reverseString(String str)를 만듭니다.
//	    매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.
//
//	2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
//	// aaabbccab
//	// abc
//
//	3. 사용자가 입력한 문자열에서 인덱스가 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는 5로 변경하여 출력하세요.
//	3, 5의 공배수 인덱스 일 때는 35로 변경
//	// aaaaaaaaaaa
//	// aaa3a53aa35
	
	
	//String str = "abcdef";
//  System.out.println(str.charAt(2)); => 하면 c가 출력.
 

 //String str2 = "";
 //str2 += str.charAt(1);
 //str2 += str.charAt(4);
 //str2 += str.charAt(3);
 //System.out.println(str2); => 하면 bed가 출력
	
	 
	 String reverseString(String str) {
		
		String result1 ="";
		for(int i = str.length()-1; i >= 0; i--) {
			result1 += str.charAt(i);

		} return result1; 
	 }
	 
	 
	 
//		2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
//		// aaabbccab
//		// abc
	 String removeDuplicates(String str) {
	 
	
	
	 
	 char[] charArr = new char[str.length()];
	 
	 String result2 = "";
	 
	 for(int i =0; i < charArr.length; i++) {
	 		charArr[i] += str.charAt(i);	
	 		for(int j = 0 ; j < i; j++ ) {
	 			if(charArr[i] == charArr[j]) {
	 				result2 += charArr[i--];
	 			}
	 		} 
	 	} return result2;
	 	
	 }
	 
	 
	 
//	 3. 사용자가 입력한 문자열에서 인덱스가 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는
//	 5로 변경하여 출력하세요.
//	 3, 5의 공배수 인덱스 일 때는 35로 변경
//	 // aaaaaaaaaaa
//	 // aaa3a53aa35
	 
	 
	 
	 
	 
}
	 
	 
	 

	
	


