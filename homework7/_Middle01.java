package homework7;

public class _Middle01 {

	public static void main(String[] args) {
		// 1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    // 비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		// hello b it b it  b  it
		// 01234 5 67 8 910 11
		StringBuffer str = new StringBuffer(30);
		str.append("hello");
		
		int size = str.capacity() - str.length();

		for(int i = 0; i < size;) {
			str.append("b");
			str.append("i");
			str.append("t");
			i = i + 3;
			if(str.length() >= 30)str.setLength(30);
		}
		System.out.println(str);
	}

}
