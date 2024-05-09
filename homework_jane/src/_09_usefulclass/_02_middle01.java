package _09_usefulclass;

public class _02_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.

	
		StringBuffer str = new StringBuffer(30);
		str.append("hello");
		
		int remainBufferSize = str.capacity() - str.length();
		for(int i = 0; i < remainBufferSize; i++) {
			str.append("bit");
		}
		
		str.setLength(30);
		
		
		System.out.println(str);
	}

}
