package _09_usefulclass;

import java.util.Scanner;

public class _02_middle02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때 사용자가 정수를 입력하고
//		위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.

		
		//StringBuffer reverse() : 역순으로 정렬된 StringBuffer를 리턴.
		StringBuffer str1 = new StringBuffer();
			str1.append("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
			str1.reverse();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하세요.");
			int num = sc.nextInt();
			
	
			System.out.println(str1.charAt(num));
		
				
			}
	}


