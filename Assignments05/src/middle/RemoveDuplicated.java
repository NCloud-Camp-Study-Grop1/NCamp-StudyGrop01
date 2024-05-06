package middle;

public class RemoveDuplicated {
	
	// method
	public String removeDuplicated(String userInput) {
		String removeResult = "";
		
		System.out.println("사용자님께서 입력하신 문자열은 " + userInput + "입니다.");
		for (int i = 0; i < userInput.length(); i++) {
			boolean isDuplicated = false;
			
			for (int j = 0; j < i; j++) {
				if (userInput.charAt(i) == userInput.charAt(j)) {
					isDuplicated = true;
					break;
				}
			}
			if (!isDuplicated) {
				removeResult += userInput.charAt(i);
			}
		}
		System.out.println("사용자님께서 입력하신 문자열 중 중복값을 제거한 문자열을 출력합니다.");
		return removeResult;
	}
}
