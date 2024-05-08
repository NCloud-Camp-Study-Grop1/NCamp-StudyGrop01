package assignments07;

public class Basic02_FillEmptySpace {

	public static void main(String[] args) {
		// fillEmptySpace: 빈 공간이 채워질 StringBuffer 변수 생성 + 공간은 30으로 지정
		StringBuffer fillEmptySpace = new StringBuffer(30);
		System.out.println("fillEmptySpace의 capacity: " + fillEmptySpace.capacity());
		
		// fillEmptySpace 변수에 "hello" 문자열 추가
		fillEmptySpace.append("hello");
		
		// remainSize: 남은 바이트 공간
		int remainSize = fillEmptySpace.capacity() - fillEmptySpace.length();
		
		// 남은 바이트 공간을 "a"로 채우는 반복문
		for (int i = 0; i < remainSize; i++) {
			fillEmptySpace.append("a");
		}
		System.out.println(fillEmptySpace);
	}

}
