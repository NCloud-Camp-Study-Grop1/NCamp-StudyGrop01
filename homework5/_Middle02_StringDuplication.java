package homework.homework5;

import java.util.Scanner;

public class _Middle02_StringDuplication {

	 public static void main(String[] args) {
	      // 2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
	      // aaabbccab
	      // abc
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("문자열을 입력하세요. : ");
	      String userStr = sc.nextLine();
	      
	      char userSum;
	      //문자를 저장해서 나중에 출력할 sum
	      String sum = "";
	      
	      // 문자열 돌아가면서 중복 체크
	      // 0번 째 자리가 1번째 자리랑 똑같은지 판단
	      for(int i = 0; i < userStr.length(); i++) { // 유저가 입력한 문자열까지 반복
	         userSum = userStr.charAt(i); // i번째의 자리 저장
	         if(userStr.indexOf(userSum) == i) {
	            // indexOf = 특정 부분 문자열(substring)이 처음으로 나타나는 인덱스를 반환
	        	// a가 처음 등장하는 자리가 i와 동일한가?
	        	// 동일하면 a를 sum에 저장
	        	// 결국 중복을 제거하는 것이 아닌 제외한 문자만 출력하는 것.
	            sum += userSum;
	         }
	      }
	      System.out.println(sum);

	}

}
