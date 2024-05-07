package homework.homework5.reverse;

public class Reverse {
	public String reverseString(String str) {
		String sum = "";
			
		for(int i = str.length() - 1; i >= 0; i-- ) {
			sum += str.charAt(i); // 특정 자리의 문자열을 출력해줌
		}
		return sum;
	}
}
