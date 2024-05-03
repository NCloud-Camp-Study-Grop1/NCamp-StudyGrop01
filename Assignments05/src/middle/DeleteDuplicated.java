package middle;

import java.util.Scanner;

public class DeleteDuplicated {
	// method
	public String deleteDuplicated(String input) {
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (input.charAt(i) != input.charAt(j)) {
					System.out.println("값이 중복됩니다.");
				}
			}
		}
	}
	
	// UseOfMethod
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("문자열을 입력해주세요.");
    	String input = sc.nextLine();
    	String result = deleteDuplicated(input);
    	System.out.println("중복된 문자가 제거 된 문자열: " + result);
    	sc.close();
    }
}