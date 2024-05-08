package assignments07;

import java.util.Scanner;

public class Basic01_PrintString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// str1, str2, str3: 사용자로부터 문자열을 입력 받음
		System.out.println("첫번째 문자열을 입력해주세요.");
		String str1 = sc.nextLine();
		System.out.println("두번째 문자열을 입력해주세요.");
		String str2 = sc.nextLine();
		System.out.println("마지막 문자열을 입력해주세요.");
		String str3 = sc.nextLine();
		
		// appendResult: 사용자로부터 입력 받은 문자열들을 합칠 StringBuffer 변수 생성
		StringBuffer appendResult = new StringBuffer();
		appendResult.append(str1);
		appendResult.append(str2);
		appendResult.append(str3);
		
		System.out.println(appendResult.toString());
	}

}
