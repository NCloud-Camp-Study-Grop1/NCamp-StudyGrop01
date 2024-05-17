package middle.intArrUtils;

import java.util.Arrays;

public class IntArrUtils {
	// getMax Method
	public static int getMax(int[] intArr) {
		if (intArr.length == 0) {
			return Integer.MIN_VALUE;
		}
		
		int max = intArr[0];
		
		for (int num : intArr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	// getMin Method
	public static int getMin(int[] intArr) {
		if (intArr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		int min = intArr[0];
		
		for (int num : intArr) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
	
	// getMid Method
	public static int getMid(int[] intArr) {
		if (intArr.length == 0) {
			return 0;
		}
		
		// 원본 배열이 정렬되지 않도록 클론화
		int[] sortedIntArr = intArr.clone();
		// 클론 배열 오름차순 정렬
		Arrays.sort(sortedIntArr);
		
		int midIdx = sortedIntArr.length / 2;
		
		if (sortedIntArr.length % 2 == 0) {
	    	return (sortedIntArr[midIdx - 1] + sortedIntArr[midIdx]) / 2;
	    } else {
	    	return sortedIntArr[midIdx];
	    }
	}
	// 메소드 실행부
	public static void main(String[] args) {
		int[] arr = {9, 7, 8, 3, 1};
		
		maxOrMinOrMid getMax = (intArr) -> IntArrUtils.getMax(intArr);
		maxOrMinOrMid getMin = (intArr) -> IntArrUtils.getMin(intArr);
		maxOrMinOrMid getMid = (intArr) -> IntArrUtils.getMid(intArr);
		
		System.out.println("최대값: " + getMax.maxOrMinOrMid(arr));
        System.out.println("최소값: " + getMin.maxOrMinOrMid(arr));
        System.out.println("중간값: " + getMid.maxOrMinOrMid(arr));
	}
}
