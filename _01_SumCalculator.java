package Basic;

public class _01_SumCalculator {
	// 1. 메소드 구현 단계
	// 1-1. int 값 1개를 매개변수로 전달 받는 메소드 구현
	public static int sumCalculator(int num) {
		
		// 1-2. '1부터 매개변수로 전달 된 값'의 총합을 계산해 리턴하는 공식 대입
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		
		// 1-3. 계산된 총합을 리턴
		return sum;
		
	}

	
	// 2. 메소드 테스트 단계
	public static void main(String[] args) {
		// 2-1. int 값 '3'을 매개변수로 전달 받은 상황
		int num = 3;
		
		// 2-2. sumCaculator 메소드 호출
		int sum = sumCalculator(num);
		System.out.printf("1 ~ %d까지의 합은: ", num);
		System.out.print(sum);
	}
}
