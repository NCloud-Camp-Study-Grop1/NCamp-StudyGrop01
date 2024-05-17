package homework12.middle;

import java.util.Arrays;

public class IntArrUtils {
	public static int getMax(int[] numArr) {
		// max의 값을 numArr의 0번째로 넣어버리고 비교
		// 최대값 구하기
		int max = numArr[0];
		
		for(int i : numArr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static int getMin(int[] numArr) {
		// 최소값 구하기
		int min = numArr[0];
		
		for(int i : numArr) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}

	public static int getMid(int[] numArr) {
		// Array : 배열의 개념, 객체의 순서있는 컬렉션으로 사용
		//         import java.lang.reflect.Array; 에 속해있다.
		//         ㄴ 리플랙션 기능을 통해 배열에 접근, 조작하는 데 사용되는 클래스 및 인터페이스 제공
		// Arrays : 배열과 관련된 유틸리티 기능을 제공하는 클래스, 
		//          배열을 정렬, 복사, 변환 등의 기능을 제공한다.
		//          java.util.Arrays 패키지에 속해있다.
		// Arrays.sort(numArr) : 배열을 오름차순으로 정렬
		Arrays.sort(numArr);
		
		// 그 중 가운데 있는 배열의 숫자를 뽑음
		// 그러면 중간값이지롱~
		// 진짜 천재같은 생각인것같아
		int mid = numArr[numArr.length / 2];
		
		return mid;
	}	

}
