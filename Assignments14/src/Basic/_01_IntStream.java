package Basic;

import java.util.ArrayList;
import java.util.List;

public class _01_IntStream {

	public static void main(String[] args) {
		// 1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다.
		// intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
		
		// intList
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
		}
		
		// Stream 생성 및 출력
		System.out.println("랜덤값(1~10)을 호출한 리스트의 각 요소에 3을 곱한 값 출력");
		System.out.print("출력값: ");
		intList.stream().map(num -> num * 3).forEach(num -> System.out.print(num + " "));
		// forEach(System.out::printnl) 그냥 이렇게 출력해도 됨 
	}

}
