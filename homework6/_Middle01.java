package homework6;

import java.util.Scanner;

public class _Middle01 {

   public static void main(String[] args) {
      // 1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
      //    문자열의 길이가 짝수면 가운데 두 글자 출력. 
      //    ex) 비둘기 -> 둘, 비트캠프 -> 1,2인 트캠
	   
	  // 가나다라마바 => 2,3인 다라 6
	  // 가나다라마바사아 => 3,4인 라마 8
	  // 가나다라마바사아자차 => 4,5인 마바 10
	   
	  // 비둘기는밥 => 2인 기 출력 5
	  // 비둘기는밥을먹 => 3인 는 출력 7
	  // 비둘기는밥을먹어요 => 4인 밥 출력 9
	   
      Scanner sc = new Scanner(System.in);
      System.out.println("문자열을 입력하세요 (가운데 글자만 출력합니다.) : ");
      
      String userStr = sc.nextLine();
      
      char userSum;
      String sum = "";
      
      for(int i = 0; i < userStr.length(); i++) {
    	  // 문자열의 길이가 짝수면 가운데 두 글자 출력
    	  if(userStr.length() % 2 == 0) {
    		  sum += userStr.charAt(userStr.length() / 2 - 1);
    		  sum += userStr.charAt(userStr.length() / 2);
    		  break;
    	  }
    	  else {
    		  sum += userStr.charAt(userStr.length() / 2);
    		  break;
    	  }
      }
      System.out.println(sum);
   }

}