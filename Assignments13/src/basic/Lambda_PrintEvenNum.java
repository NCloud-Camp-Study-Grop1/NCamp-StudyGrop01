package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lambda_PrintEvenNum {

	public static void main(String[] args) {
		// intList: 3개의 값을 가진 정수 배열
		List<Integer> intList = new ArrayList<Integer>();
		int[] intArray = new int[3];
		
		for(int i = 0; i < 3; i++) {
			intList.add(i);
			intArray[i] = i;
		}
		
		// evenNum
		// - intList를 스트림으로 변환
		// → filter(): 입력 받은 정수가 짝수인지 확인
		Stream<Integer> evenNum = intList.stream().filter(num -> num % 2 == 0);
		// System.out::println: System.out 객체의 println 메소드 참조
		evenNum.forEach(System.out::println);
		}
}
