package basic;

public class RemoveVowels {
	public String removevowels(String userInput) {
		String removeResult = "";
		String vowels = "aeiouAEIOU";
		
		for (int i = 0; i < userInput.length(); i++) {
			char currentChar = userInput.charAt(i);
			if (vowels.indexOf(currentChar) == -1) {
				removeResult += currentChar;
				// < indexOf method > 유빈님께서 사용하신 method 응용
				// - 문자열에서 특정 문자나 문자열이 처음으로 등장하는 인덱스를 반환하는 method
				// - 특정 문자나 문자열이 없을 경우 -1을 반환
				// - currentChar의 문자열 중 vowels(모음 문자열)에 해당하는 문자가 없다면, -1을 반환
				// - 해당 문자에 대해 indexOf가 -1을 반환할 때, removeResult에 해당 값을 넣음
			}
		}
		System.out.println("모음(대/소문자 구분 없음)을 제거한 문자열: ");
		return removeResult;
	}
}
