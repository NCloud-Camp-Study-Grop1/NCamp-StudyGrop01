package Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_StrStream {

	public static void main(String[] args) {
		// 2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
		
		// strList
		List<String> strList = new ArrayList<String>();
		
		// input String parameters
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 문자열을 입력해주세요.");
			strList.add(sc.nextLine());
		}
		
		// Stream 생셩 및 출력
		System.out.println("사용자가 입력한 문자열 10개 중 문자열의 길이가 5이상인 문자열만 출력");
		System.out.print("출력값: ");
		strList.stream().filter(str -> str.length() >= 5).forEach(str -> System.out.println(str));
	}

}
