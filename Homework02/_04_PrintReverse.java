package Basic;

public class _04_ {
	// 1. 메소드 구현
	// 1-1. int 배열 1개를 매개변수로 전달 받는 메소드 구현
	public static int printReverse(int[] intArr) {
		
		// 1-2(1). int 배열 값을 인덱스 역순으로 출력하는 공식 대입
		for (int i = intArr.length -1; i >= 0 ; i--) {
			System.out.print(intArr[i] + " ");
		}
		// 1-3. 리턴값의 의미가 없으므로 0을 리턴
		return 0;
	}

	public static void main(String[] args) {
		// 2. 메소드 테스트 단계
		// 2-1. 'int 배열 {1, 2, 3}'을 매개변수로 전달 받은 상황
		int[] intArr = {1, 2, 3};
		
		// 2-2. printReverse 메소드 호출
		printReverse(intArr);
	}
}
