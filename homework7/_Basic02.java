package homework7;

public class _Basic02 {

	public static void main(String[] args) {
		// 2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    //    비어있는 바이트의 공간을 a로 모두 채우시오.
		
		StringBuffer str = new StringBuffer(30);
		
		str.append("hello");
		
		int size = str.capacity() - str.length();
		
		for(int i = 0; i < size; i++) {
			str.append("a");
		}
		
		System.out.println(str);
		
	}

}
