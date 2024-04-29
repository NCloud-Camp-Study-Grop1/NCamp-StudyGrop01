package homework;

import java.util.Scanner;

public class _05_Basic12 {

public static void main(String[] args) {
// TODO Auto-generated method stub
// 문제 12) 정수 10개를 입력받아 배열에 저장하고, 이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
Scanner sc = new Scanner(System.in);

// (1) int 배열 10개 생성
int[] intArr3 = new int[10];

// (2) 정수 10개를 입력 받아 배열에 저장
for (int c = 0; c < intArr3.length; c++) {
	System.out.println("사용자님 정수를 입력해주세요.");
	intArr3[c] = sc.nextInt();
	}

// (3) 2의 배수와 3의 배수만 출력하기
for (int c = 0; c < intArr3.length; c++) {
	if (intArr3[c] % 2 == 0 || intArr3[c] % 3 == 0) {
		System.out.print(intArr3[c] + " ");
		}
	}
}
}
