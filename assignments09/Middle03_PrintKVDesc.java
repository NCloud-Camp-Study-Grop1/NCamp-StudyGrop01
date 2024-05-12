package assignments09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Middle03_PrintKVDesc {

	public static void main(String[] args) {
        // 2. mapPrintKVDesc: 두 정수값을 입력 받는 HashMap 메소드 객체 생성
        Map<Integer, Integer> mapPrintKVDesc = new HashMap<Integer, Integer>();

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
            mapPrintKVDesc.put(intA, intB);
        }
        
        // 4. 출력
        System.out.println("사용자님께서 처음 입력하신 ");
        System.out.println("Key 값들은 ");
        printKVDesc(mapPrintKVDesc);
		
	}
	// 1. printKVDesc: Key 값들은 정순으로 출력하고 Value 값들은 역순으로 출력하는 메소드 생성
	public static void printKVDesc(Map<Integer, Integer> mapKV) {
		// kList: Key 값들을 저장할 리스트 생성 // vList: Value 값들을 저장할 리스트
		List<Integer> kList = new ArrayList<Integer>(mapKV.keySet());
		List<Integer> vList = new ArrayList<Integer>(mapKV.values());

		// Collections.sort: 리스트를 정렬하는 메소드
		// - Key 값들을 정순으로 정렬
		Collections.sort(kList);
		
		// Collections.reverseOrder: 리스트를 역순으로 배치하는 인터페이스 메소드 객체
		// - Value 값들을 역순으로 정렬
		Collections.sort(vList, Collections.reverseOrder());
		
		for (int i = 0; i < kList.size(); i++) {
			System.out.println(kList.get(i) + " : " + vList.get(i));
		}
		
	}
}
