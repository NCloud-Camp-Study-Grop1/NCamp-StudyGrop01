package homework;

import java.util.Random;
import java.util.Scanner;

public class _04_Basic10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 10) int배열을 10개 생성해서 사용자로부터 10개의 값을 입력받고, 순서대로 출력하고 총합을 구하세요.
		// (1) int 배열 10개 생성
		int[] intArr1 = new int [10];
		
		// (2) 사용자로부터 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int a = 0; a < intArr1.length; a++) {
			System.out.println("사용자님 정수를 입력해주세요.");
			int inputVal1 = sc.nextInt();
			intArr1[a] = inputVal1;
			sum += inputVal1;
		}
		for (int a = 0; a < intArr1.length; a++) {
			System.out.print(intArr1[a] + " ");
		}
		System.out.print(" || ");
		System.out.printf("사용자님께서 입력하신 값들의 총합은 %d 입니다.", sum);

		System.out.println("");
		System.out.println("--------------------------------");
		
		// 문제 11) int 배열로 10개의 공간을 생성하세요. 1 ~ 10까지의 임의의 수를 저장하고 홀수만 골라서 출력하세요.
		// (1) int 배열 10개 생성
		int[] intArr2 = new int [10];
		
		// (2) 1 ~ 10까지의 임의의 수를 저장하고, 홀수만 출력하기
		Random random = new Random();
	
		
		for (int b = 0; b < intArr2.length; b++) {
			intArr2[b] = random.nextInt(10) + 1;
			if (intArr2[b] % 2 != 0) {
				System.out.println(intArr2[b] + " ");
			}
		}		
		
	}

}
