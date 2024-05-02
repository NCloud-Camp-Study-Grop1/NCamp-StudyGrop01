package _03_advance;

import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 369게임을 작성합니다.
		// 1~99까지의 정수를 입력받고
		// 3,6,9중 하나가 있으면 "박수짝"을 출력하고
		// 2개가 있으면 "박수짝짝"을 출력하세요
		// 예를 들어 13은 "박수짝"
		// 36인 경우는 "박수짝짝"을 출력하면 됩니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		

		if(num >=1 && num <= 99) {
			int tenNum = num / 10;
			int oneNum = num - tenNum * 10; 
			
			
			
			if(tenNum % 3 == 0 && oneNum % 3== 0 ) {
				System.out.println("박수짝짝");
			} else if(tenNum % 3 == 0 || oneNum % 3 == 0 ) {
				System.out.println("박수짝");
			} else { 
			System.out.println("1~99까지의 정수로 다시 입력해주세요.");

		}
			
		}
	}
}
		
//int num = sc.nextInt();
//		
//		if(num >= 1 && num <= 99) {
//			int tenNum = num / 10;
//			int oneNum = num - tenNum * 10;
//			count = 0;
//			
//			if(tenNum > 0 && tenNum % 3 == 0) {
//				count++;
//			}
//			
//			if(oneNum > 0 && oneNum % 3 == 0) {
//				count++;
//			}
//			
//			if(count == 1) {
//				System.out.println("박수짝");
//			} else if(count == 2) {
//				System.out.println("박수짝짝");
//			} else {
//				System.out.println("3, 6, 9를 찾을 수 없습니다.");
//			}
//		} else {
//			System.out.println("99이하의 수만 입력하세요.");
//		}
//		sc.close();
		


	


