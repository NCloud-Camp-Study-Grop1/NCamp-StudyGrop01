package HomeWork;

import java.util.Scanner;

public class median {
	
	static int med3(int a, int b, int c) {
		
		int temp=0;
		
		if((a>=b && c>=a) || (a>=c && b>=a)) {
			return a;//a가 중간값
		}
		else if ((b>=a && c>=b) || (b>=c && a>=b)) {
			return b;
		}
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
