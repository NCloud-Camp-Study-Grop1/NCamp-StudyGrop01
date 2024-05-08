package assignments07;
import java.util.Scanner;

public class Advance01_ConsecutiveDuplicates {

    public static void main(String[] args) {
        // input: 사용자로부터 문자열을 입력 받아 저장하는 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자님 문자열을 입력해주세요.");
        String input = sc.nextLine();
        
        // modifiedResult: 연속된 동일한 문자 중 하나만 포함한 문자열을 저장할 StringBuilder 변수
        StringBuilder modifiedResult = new StringBuilder();
        
        // 이전 문자와 현재 문자가 같은지 비교하기 위한 변수
        char prevChar = '\0'; // 초기값으로는 아무 문자도 아닌 null 문자를 사용

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // 현재 문자가 이전 문자와 다를 때만 추가
            if (currentChar != prevChar) {
                modifiedResult.append(currentChar);
            }
            // 이전 문자를 현재 문자로 업데이트
            prevChar = currentChar;
        }
        System.out.println("연속된 동일한 문자를 하나만 남기고 제거한 결과:");
        System.out.println(modifiedResult);
    }

}
