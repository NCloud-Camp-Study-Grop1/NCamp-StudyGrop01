package homework12;

import java.util.Scanner;

import homework12.basic.PrintNumber;

public class _Basic01 {

	public static void main(String[] args) {
		// 1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 
		//    람다식으로 구현하세요. PrintNumber 함수형 인터페이스 생성, 
		//    printEnvenNum(int[] numArr) 추상 메소드로 선언.
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		printEnvenNum(numArr, printNumber -> System.out.println(printNumber));

	}
	
	public static void printEnvenNum(int[] numArr,PrintNumber printNumber) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numArr.length; i++) {
			
			if(numArr[i] % 2 == 0) {
				System.out.print(numArr[i] + " ");
				
			}
		}
	}

}
