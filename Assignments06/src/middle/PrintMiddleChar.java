package middle;

public class PrintMiddleChar {
	
	public String printMiddleChar(String userInput) {
		String result = "";
		int middleIndex = userInput.length() / 2;
		// int는 소수점 숫자들을 버림함
		
		if (userInput.length() % 2 == 0) {
			result = new String(new char[] {userInput.charAt(middleIndex - 1), userInput.charAt(middleIndex)});
		} else {
			result = new String(new char[] {userInput.charAt(middleIndex)});
		}
		return result;
		// userInput.length()가 짝수일 때
		// - {a, b, c, d}
		// -  0  1  2  3  << index
		// userInput.length()가 홀수일 때
		// - {a, b, c}
		// -  0  1  2  << index
	}
}