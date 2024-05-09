package _09_usefulclass;

import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu

		
			Scanner sc  = new Scanner(System.in);
			
			StringBuilder str = new StringBuilder();
			System.out.println("문자열을 입력하세요.");
			String inputStr = sc.nextLine();
			
										//초기화 어떻게 하지??
			 char preChar = '\3'; // 대휘님 풀이 참고... 초기값으로는 아무 문자도 아닌 null 문자를 사용 >> 왜??
			
			System.out.println(preChar);
				for(int i = 0; i < inputStr.length(); i++) {
					char currentChar = inputStr.charAt(i);
					if(i == 0 || currentChar != preChar ) {
						str.append(currentChar);}
				}
				
				
				  // 대휘님 풀이 참고.. 이전 문자를 현재 문자로 업데이트 왜?? 
	           // preChar = currentChar;
				
				
				System.out.println(str.toString());
				
				
				}

	}


