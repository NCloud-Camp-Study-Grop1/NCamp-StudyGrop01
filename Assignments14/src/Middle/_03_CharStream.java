package Middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_CharStream {

	public static void main(String[] args) {
		// 3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고
		// 스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
		
		// charList
        List<Character> charList = new ArrayList<>();
        
        // add inputs
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "번째 영문자를 입력해주세요:");
            char input = sc.nextLine().charAt(0);
            charList.add(input);
        }
        
        // Stream 생성 및 출력
        System.out.println("사용자가 입력한 10개의 문자열이 소문자면 대문자로 대문자면 소문자로 바꿔 출력");
		System.out.print("출력값: ");
        charList.stream().map(ch -> {
        	if (Character.isUpperCase(ch)) {
        		return Character.toLowerCase(ch);
        	} else {
        		return Character.toUpperCase(ch);
        		}
        	}).forEach(ch -> System.out.print(ch + " "));
	}

}
