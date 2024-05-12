package assignments09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Middle02_MapMultOfKeyValue {
	
	public static void main(String[] args) {
		// 2.  mapInt: 정숫값을 입력 받을 HashMap 메소드 객체 생성
		Map<Integer, Integer> mapInt = new HashMap<Integer, Integer>();
		
		// 3. Map 구성
		Scanner sc = new Scanner(System.in);
		
		// - 사용자로부터 정수A(intA)와 정수B(intB)를 입력 받을 변수 생성(3개)
		for (int i = 0; i < 3; i++) {
			// intA, intB: 개행문자(\n)의 존재로 인한 에러 발생 가능성 존재
			// --> String 타입으로 연락처를 입력 받은 후 Int 타입으로 변환
			System.out.println((i + 1) + "번째 정수A의 값을 입력해주세요.");
			int intA = Integer.valueOf(sc.nextLine());
			System.out.println((i + 1) + "번째 정수B의 값을 입력해주세요.");	
			int intB = Integer.valueOf(sc.nextLine());
			// Key: intA // Value: intB
			mapInt.put(intA, intB);
		}
		System.out.println("----------------------------------------------------");
		
		// 4. 출력
		Map.Entry<Integer, Integer> maxMultEntry = getMaxMult(mapInt);
		
		if (maxMultEntry != null) {
			System.out.println("Map에서 Key 값과 Value값이 가장 큰 Entry를 출력합니다.");
			System.out.printf(">> Key 값이 %d이고, Value 값이 %d일 때,", maxMultEntry.getKey(), maxMultEntry.getValue());
			System.out.printf("Key 값과 Value 값의 곱은 %d입니다.", (maxMultEntry.getKey() * maxMultEntry.getValue()));
		} else {
			System.out.println("정숫값에 대한 Map이 제대로 설정돼 있지 않습니다.");
		}
		
	}
	// 1. getMaxMult: Key 값과 Value 값의 곱 중 가장 큰 값을 가진 한 쌍의 Entry를 반환하는 메소드
	public static Map.Entry<Integer, Integer> getMaxMult(Map<Integer, Integer> getMaxmult){
		// getMaxMult Entry가 비어 있을 때 null을 반환
		if (getMaxmult == null || getMaxmult.size() == 0) {
			return null;
		}
		
		// maxEntry: Key 값과 Value 값의 곱이 최대인 한 쌍의 Entry를 저장
		// maxMult: Key 값과 Value 값의 곱이 최대인 값 저장
		Map.Entry<Integer, Integer> maxEntry = null;
		int maxMult = 0;
		
		// mult: Key 값과 Value 값의 곱
		for (Map.Entry<Integer, Integer> multEntry : getMaxmult.entrySet()){
			int mult = multEntry.getKey() * multEntry.getValue();
			if (mult > maxMult) {
				maxMult = mult;
				maxEntry = multEntry;
			}
		}
		return maxEntry;
	}
	
}
