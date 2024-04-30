package homework;

import java.util.Iterator;
import java.util.Scanner;

public class _basic {

	public static void main(String[] args) {
		// 2024. 04. 29
		
		// 1.  int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 
		//     출력된 값은 모두 증감연산자가 포함된 상태입니다.
	    // 11
	    // 12
	    // 12
	    // 10
	    // 10
	    // 8
//		
//		int num = 10;
//		
//		System.out.println(++num);
//		System.out.println(++num);
//		System.out.println(num--);
//		System.out.println(--num);
//		System.out.println(num--);
//		System.out.println(--num);
		// -----------------------------------------------------------
		
		// 2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 
		//    다음과 같이 출력하세요.
	    // true
	    // false
		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println(a<b);
//		System.out.println(a>b);
		// -----------------------------------------------------------
		
		// 3. 10 ~ 1까지 거꾸로 while문으로 출력
		
//		int i = 10;
		
//		while(true) {
//			System.out.println(i--);
//			if(i<=0) break;
//		}
		// -----------------------------------------------------------
		
		// 4. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		
//		int i = 10;
//		
//		do {
//			System.out.println(i--);
//		} while (i > 0);
		
		// -----------------------------------------------------------
		
		// 5. 10 ~ 1까지 거꾸로 for문으로 출력
		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
		// -----------------------------------------------------------
		
		//6. 1 ~ 100까지 합을 while문으로 출력
		
//		int i = 0;
//		int sum = 0;
//		
//		while(i<100) {
//			i++;
//			sum += i;
//		}
//		
//		System.out.println("1~100까지의 합은 : " + sum);
		
		// -----------------------------------------------------------
		
		//7. 1 ~ 100까지 합을 do ~ while문으로 출력
		
//		int i = 0;
//		int sum = 0;
//		
//		do {
//			i++;
//			sum += i;
//		} while (i < 100);
//		System.out.println("1~100까지의 합은 " + sum);
		
		// -----------------------------------------------------------
		
		// 8. 1 ~ 100까지 합을 for문으로 출력
		
//		int sum = 0;
//		
//		for(int i = 0; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("1~100까지의 합은 " + sum);
		
		// -----------------------------------------------------------
		
		// 9.  int 10개짜리 배열 생성하여
		//     int배열에 3의 배수를 차례대로 저장하세요.
		//     그리고 거꾸로 출력하세요.
//		int[] numArr = new int[10];
//		
//		for(int i = 0; i <= numArr.length; i++) {
//			numArr[i] = (i + 1) * 3;
//			// 3의 배수값 저장
//			System.out.println(numArr[10 - i]);
//			}
//		}
		// -----------------------------------------------------------
		
		// 10. int배열을 10개 생성해서
		//     사용자로부터 10개의 값을 입력받고
		//     순서대로 출력하고 총합을 구하세요.
		
//		Scanner sc = new Scanner(System.in);
//		int[] numArr = new int[10];
//		
//		int sum = 0;
//		
//		System.out.println("저장하고자 하는 숫자를 10개 입력하세요. (ex. 10 20 30 ...)");
//		
//		for(int i = 0; i < numArr.length; i++) {
//			int userNum = sc.nextInt(); // 사용자 입력값 저장
//			numArr[i] += userNum;
//			System.out.print(numArr[i] + " ");
//			
//			sum += userNum;
//		}
//		System.out.println();
//		System.out.println("당신이 입력하신 숫자의 총합은 : " + sum);
//		sc.close();

		
		// -----------------------------------------------------------
		
		//11. int 배열로 10개의 공간을 생성하세요.
		//    1 ~ 10까지의 임의의 수를 저장하고
		//    홀수만 골라서 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		int[] numArr = new int[10];
//		
//		System.out.println("저장하고자 하는 숫자를 10개 입력하세요. (ex. 10 20 30 ...)");
//		
//		for(int i = 0; i <= numArr.length; i++) {
//			int userNum = sc.nextInt();
//			numArr[i] += userNum;
//			
//			if(numArr[i] % 2 != 0) {
//				System.out.println(numArr[i]);
//			}
//		}
		// -----------------------------------------------------------
		
		// 12. 정수 10개를 입력받아 배열에 저장하고, 
	    // 이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		int[] numArr = new int[10];
//		
//		System.out.println("저장하고자 하는 정수를 10개 입력하세요.");
//		
//		for(int i = 0; i <= numArr.length; i++) {
//			int userNum = sc.nextInt();
//			numArr[i] += userNum;
//			
//			if (numArr[i] % 2 == 0 || numArr[i] % 3 == 0) {
//				System.out.println(numArr[i]);
//			}
//		}
	}
}

