package homework7;

import java.util.Scanner;

public class _Middle02 {

	public static void main(String[] args) {
		// 2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 
		// StringBuffer이 있을 때 사용자가 정수를 입력하고 위 StringBuffer를 거꾸로 만든 
		// StringBuffer의 사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
		
		StringBuffer str = new StringBuffer(29);
		str.append("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		str.reverse();
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int userNum = sc.nextInt();
		char sum;
		
		// 유저가 입력한 정수가 29까지인지
		if(userNum >= 0 && userNum <= str.length()) {
			// 해당하는 숫자 더함
			sum = str.charAt(userNum);
			System.out.println(sum);
		} 
		// 예외처리
		else {
			System.out.println("유효하지 않은 정수입니다.");
		}
		
	}

}
