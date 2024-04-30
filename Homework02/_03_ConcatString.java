package Basic;

public class _03_ConcatString {
	// 1. 메소드 구현
	// 1-1. concatString 메소드 오버로딩: String 값 2개, int 값 1개
	public String concatString(String str1, String str2, int num) {
		
		// 1-2. 문자열 결합을 진행한 뒤 문자열을 리턴하는 공식 대입
		return str1 + str2 + num;
	}
	
	public static void main(String[] args) {
		// 2. 메소드 테스트 단계
		// 2-1. String 값 "Bit", "Camp", int 값 '12'를 매개변수로 전달 받은 상황
		String str1 = "Bit";
		String str2 = "Camp";
		int num = 12;
		
		// 2-2. ConcatString 객체 생성
		_03_ConcatString concatString = new _03_ConcatString();
		
		// 2-3. 오버로딩 된 concatString 메소드 호출
		String result = concatString.concatString(str1, str2, num);
		System.out.println(result);
	}
}
