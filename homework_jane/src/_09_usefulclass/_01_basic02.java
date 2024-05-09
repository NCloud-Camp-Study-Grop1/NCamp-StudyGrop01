package _09_usefulclass;

import java.util.Scanner;

public class _01_basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
//
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
		
		
		
		StringBuffer str1 = new StringBuffer(30);
		str1.append("hello");
		
		int remainBufferSize = str1.capacity() - str1.length();
		for(int i = 0; i < remainBufferSize; i++) {
			str1.append('a');}
		
	
		
		System.out.println(str1);
		

	
	}

}
