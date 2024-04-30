package Basic;

// 1. ConcatString 클래스 생성
// (문제 2번이므로 원래 지시한 클래스명 앞에 _02_를 붙여 생성했음)
public class _02_ConcatString {
	// 2. 메소드 구현
	// 2-1. String 값 2개를 매개변수로 전달 받는 메소드 구현
	public String concatString(String str1, String str2) {
		
		// 2-2. 문자열 결합을 진행한 뒤 문자열을 리턴하는 공식 대입
		return str1 + str2;
	}

	public static void main(String[] args) {
		// 3. 메소드 테스트 단계
		// 3-1. ConcatString 객체 생성
		_02_ConcatString concatString = new _02_ConcatString();
		
		// 3-2. String 값 "Bit", "Camp"를 매개변수로 전달 받은 상황
		String str1 = "Bit";
		String str2 = "Camp";
		
		// 3-3. ConcatString객체의 concatString 메소드 호출
		String result = concatString.concatString(str1, str2);
		System.out.println(result);
		
	}
}
