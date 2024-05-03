package homework.homework4;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {
	static int med3(int a, int b, int c) {
		//여기를 완성하세요.
		if(a >= b) { // a가 b보다 클 때 => a > ㅁ > ㅁ
			if(c < b) { // b가 c보다 클때 => a > b > c
				return b; // b가 중간값
			}
			// b가 c보다 작다는 것이 판별
			else if(c < a) { // c가 a보다 작을때 => a > c > b 
				return c; // c가 중간값
			}
			// a가 b보다 크지만 b가 c보다 작고 c가 a값보다 클 때
			// c > a > b
			else {
				return a;
			}
		}
		// 숫자가 같을 때 값 처리
		// 어차피 여기를 온거면 a가 b보다 작다는 것이 판별났으니까
		// 아니면 b가 c보다 작거나 같을 때
		else if(c >= b) { // c > b > a
			return b; // b가 중간값
		}
		// 아니면 a가 c보다 크거나 같을 때
		else if(a >= c) { // b > a > c ?  
			return a; // a가 중간값
		}
		// b > c > a
		else { 
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}
