package homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _Basic01 {

	public static void main(String[] args) {
		// 1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) 
		//    value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		
		// Key => String, 알파벳의 대소문자를 구분
		// value => Integer, 해당 알파벳의 유니코드 값을 저장
		Map<String, Integer> map = new HashMap();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 하나 입력하세요.");
		
		String userStr = sc.nextLine();
		
		// compareTo => 두 개의 값을 비교하여 int 값으로 반환
		// 숫자의 비교는 크다(1), 같다(0), 작다(-1) 리턴
		// 문자열의 비교는 같다(0), 그 외 (양수/음수)
		// 비교대상에 문자열이 포함되어 있는지를 비교
		// ex. "abcd" 와 "ab" 비교 => 결과 : 2
		//        4   -   2  = 2 (문자열의 길이를 비교)
		// 한 자리 문자와 비교할 때는 아스키 코드값으로 비교
		
		// a는 같을 때는 0, 그 외에는 userStr - a 이기에 0보다 큼
		// z와 같을 때는 0, 그 외에는 userStr - z이기에 마이너스 값이 나오기에 0보다 작음
		// ex. c(99) - a(97) = 2
		// ex. c(99) - z(122) = -23
		// 결국 a부터 z안에 있는 문자열일 경우 이 if문에 들어감
		if(userStr.compareTo("a") >= 0 && userStr.compareTo("z") <= 0) {
			map.put(userStr, (int)userStr.charAt(0));
			System.out.println("입력하신 문자는 소문자이며, 아스키 코드의 값은 " + 
					(int)userStr.charAt(0) + "입니다.");
		}
		
		if(userStr.compareTo("A") >= 0 && userStr.compareTo("Z") <= 0) {
			map.put(userStr, (int)userStr.charAt(0));
			System.out.println("입력하신 문자는 대문자이며, 아스키 코드의 값은 " + 
					(int)userStr.charAt(0) + "입니다.");
		}
	}

}
