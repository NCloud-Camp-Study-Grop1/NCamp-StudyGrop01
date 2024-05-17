package Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_StrEngStream {

	public static void main(String[] args) {
		// 3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고
		// 스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
		
		// strList
		List<String> strList = new ArrayList<String>();
		
		// input String parametersQ
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 문자열을 입력해주세요.");
			strList.add(sc.nextLine());
		}
		
		// Stream 생성 및 출력
		/* <정규식 설명>
		 * 	.* : 문자열의 시작부터 영어 알파벳이 나올 때가지의 모든 문자
		 *  [a-zA-Z] : 대/소문자 영어 알파벳 중 하나와 일치
		 *  .* : 영어 알파벳 뒤에는 어떤 문자가 오든 상관하지 않음
		 *  → 총 정리: 해당 문자열에 영어 알파벳(대/소문자 구분x)이 하나라도 있으면 true
		 *  
		 *  <부연 설명>
		 *  . : 모든 문자와 일치 (줄바꿈 문자는 제외)
		 *  * : 앞의 부분식이 0개 이상 있어야 함
		 */
		System.out.println("사용자가 입력한 문자열 10개 중 영문자가 포함된 문자열 출력");
		System.out.print("출력값: ");
		strList.stream().filter(str -> str.matches(".*[a-zA-Z].*")).forEach(str -> System.out.print(str + " "));
		
	}

}
