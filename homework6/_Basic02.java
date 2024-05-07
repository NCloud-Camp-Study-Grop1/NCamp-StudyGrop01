package homework6;

import java.util.Scanner;

public class _Basic02 {

	public static void main(String[] args) {
		// 2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
		//    대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
		//    abcdefghij
		//    bcdfghj => a와 i 제거

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요. :");
		
		String userStr = sc.nextLine();
		
		char userSum;
		String sum = "";
		
		for(int i = 0; i < userStr.length(); i++) {
			userSum = userStr.charAt(i);
			if(userStr.charAt(i) == 'a' || userStr.charAt(i) == 'A') {
				continue;
			}
			else if(userStr.charAt(i) == 'e' || userStr.charAt(i) == 'E') {
				continue;
			}
			else if(userStr.charAt(i) == 'i' || userStr.charAt(i) == 'I') {
				continue;
			}
			else if(userStr.charAt(i) == 'o' || userStr.charAt(i) == 'O') {
				continue;
			}
			else if(userStr.charAt(i) == 'u' || userStr.charAt(i) == 'U') {
				continue;
			}
			else {
				sum += userSum;
			}
		}
		System.out.println(sum);
	}

}
