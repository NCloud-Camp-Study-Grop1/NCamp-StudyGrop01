package basic;

public class CountWords {
	public int countWords(String userInput) {
		int cnt = 0;
		
		System.out.println("사용자님께서 입력하신 문자열은" + userInput + "입니다.");
		for (int i = 0; i < userInput.length(); i++) {
			if ((userInput.charAt(i) == '가') || (userInput.charAt(i) == '바')) {
				cnt ++;
			}if (cnt == 0) {
				System.out.println("사용자님께서 입력하신 문자열 중 '가' 혹은 '바'는 존재하지 않습니다.");
			}
		} return cnt;
	}
}