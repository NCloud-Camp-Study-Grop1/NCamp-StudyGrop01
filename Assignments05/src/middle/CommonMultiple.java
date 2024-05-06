package middle;

public class CommonMultiple {
	public String commonMultiple(String userInput) {
		String commonMultipleResult = "";
		
		for (int i = 0; i < userInput.length(); i++) {
			char currentChar = userInput.charAt(i);
			
			if (((i + 1) % 3 == 0) && ((i + 1) % 5 == 0)) {
				commonMultipleResult += 35;
			}
			else if ((i + 1) % 3 == 0) {
				commonMultipleResult += 3;
			}
			else if ((i + 1) % 5 == 0) {
				commonMultipleResult += 5;
			}
			else {
				commonMultipleResult += userInput.charAt(i);
			}
		}
		System.out.println("사용자님께서 입력하신 문자열 중 인덱스가 3과 5의 배수일 경우 기존의 문자 대신 3, 5를 출력하고, 3과 5의 공배수일 경우 35를 출력합니다.");
		return commonMultipleResult;
	}
}

