package assignments07;

public class Middle01_FillEmptySpace {

	public static void main(String[] args) {
		// fillEmptySpace: 빈 공간이 채워질 StringBuffer 변수 생성 + 공간은 30으로 지정
		StringBuffer fillEmptySpace = new StringBuffer(30);
		System.out.println("fillEmptySpace의 capacity: " + fillEmptySpace.capacity());
		
		// fillEmptySpace 변수에 "hello" 문자열 추가
		fillEmptySpace.append("hello");
		
		// remainSize: 남은 바이트 공간
		int remainSize = fillEmptySpace.capacity() - fillEmptySpace.length();
		System.out.println("fillEmptySpace의 remainCapacity: " + remainSize);
		
		// 남은 바이트 공간을 "a"로 채우는 반복문
		for (int i = 0; i < remainSize; i++) {
			if (i % 3 == 0) {
				fillEmptySpace.append("b");
			}
			else if (i % 3 == 1) {
				fillEmptySpace.append("i");
			}
			else if (i % 3 == 2) {
				fillEmptySpace.append("t");
			}
			// 혹은를 해도 된다. (남은 capacity가 25였으므로, 3으로 나누면 1부터 시작)
		// for (int i = 0; i < remainSize; i++) {
		// 	if ((remainSize- i) % 3 == 1) {
		// 		fillEmptySpace.append("b");
		// 	}
		// 	else if ((remainSize- i) % 3 == 2) {
		// 		fillEmptySpace.append("i");
		// 	}
		// 	else if ((remainSize- i) % 3 == 0) {
		// 		fillEmptySpace.append("t");
		// 	}
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("fillEmptySpace의 remainCapacity에 'b', 'i', 't'를 돌아가며 채웁니다.");
		System.out.println(fillEmptySpace);
	
	}

}
