package homework;

import java.util.Scanner;

public class _0508_middle02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer strb1 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num1 = sc.nextInt();
		StringBuffer strb2 = new StringBuffer();
		
		strb2 = strb1.reverse();
		
		System.out.println(strb2.charAt(num1));
		
		

	}

}
