package homework12;

import homework12.middle.IntArrUtils;
import homework12.middle.MaxMinMid;

public class _Middle03 {

	public static void main(String[] args) {
		// 3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 
		// static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 
		// 구현하고 maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 
		// 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
		
		maxminmid(IntArrUtils::getMax);
		System.out.println("----------------------");
		maxminmid(IntArrUtils::getMin);
		System.out.println("----------------------");
		maxminmid(IntArrUtils::getMid);
		
	}
	
	public static void maxminmid(MaxMinMid maxMinMid) {
		int[] numArr = new int[20];
		
		for(int i = 0; i < numArr.length; i++) {
			// 랜덤으로 값을 생성해서 배열에 저장
			numArr[i] = (int)(Math.random() * 20) + 1;
			System.out.print(numArr[i] + ", ");
			
		}
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println(maxMinMid.maxOrMinOrMid(numArr));
	}
}
