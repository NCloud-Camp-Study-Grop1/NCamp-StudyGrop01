package homework.homework5;

import java.util.Scanner;

public class _Middle03_StringChange {

	public static void main(String[] args) {
		 // 3. 사용자가 입력한 문자열에서 인덱스가 3의 배수 자리의 문자는 3으로 
	      // 5의 배수 자리의 문자는 5로 변경하여 출력하세요.
	      // 3, 5의 공배수 인덱스 일 때는 35로 변경
	      // aaaaaaaaaaa
	      // aaa3a53aa35
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("문자열을 입력하세요. : ");
	      
	      String userStr = sc.nextLine();

	      char userSum;
	      String sum = "";
	      
	      for(int i = 0; i < userStr.length(); i++) {
	         userSum = userStr.charAt(i);
	         
	         if(i % 3 == 0  && i != 0) { // 자꾸 0번째 자리가 바뀌길래 넣어놓은 예외 사항
	            sum += "3";
	         }
	         else if(i % 5 == 0 && i != 0) {
	            sum += "5";
	         }
	         else if(i % 15 == 0 && i != 0) {
	            sum += "35";
	         }
	         else {
	            sum += userSum;
	         }
	      }
	      System.out.print(sum);


	}

}
