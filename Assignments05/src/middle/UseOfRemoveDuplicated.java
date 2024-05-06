package middle;

import java.util.Scanner;

public class UseOfRemoveDuplicated {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("사용자님 문자열을 입력해주세요.");
		String userInput = input.nextLine();
		input.close();
		
		RemoveDuplicated removeDup = new RemoveDuplicated();
		String removeResult = removeDup.removeDuplicated(userInput);
		
		System.out.println(removeResult);
	}
}
