package homework.Homework05;

import java.util.Iterator;
import java.util.Scanner;

public class _Middle02_StringDuplication {

	public static void main(String[] args) {
		// 2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
		// aaabbccab
		// abc
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. : ");
		String userStr = sc.nextLine();
		
		
		// 문자열 돌아가면서 중복 체크
		// 0번 째 자리가 1번째 자리랑 똑같은지 판단
		for(int i = 0; i < userStr.length() - 1; i++) { // 유저가 입력한 문자열의 길이만큼 반복
			int j = 1;
			char userChr = userStr.charAt(i); // i번째에 있는 문자열 저장
			// 중복되었으면 덮어씌워버리기
			// 대박이다 자리값을 이동시켰어~~~
			if(userChr == userStr.charAt(j)) {
				userChr += userStr.charAt(j);
				System.out.print(userChr);
				j++;
			}
			else {
				System.out.print(userChr);
			}
		}
	}

}
