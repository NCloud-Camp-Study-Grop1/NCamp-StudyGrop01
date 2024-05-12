package assignments09;

import java.util.HashMap;
import java.util.Map;

public class Basic01_MapAlphabetUnicode {

	public static void main(String[] args) {
		// 1. mapAlphUni: 알파벳(String)과 유니코드(Integer) 값을 저장할 HashMap 메소드 객체 생성
		Map<String, Integer> mapAlphUni = new HashMap<String, Integer>();
		
		
		// 2. Map 구성
		// alph: 알파벳 변수
		// 2(1). Key: 영문 대문자 // Value: 상응하는 유니코드
		for (char alph = 'A'; alph <= 'Z'; alph++) {
			mapAlphUni.put(String.valueOf(alph), (int)alph);
		}
		
		// 2(2). Key: 영문 소문자 // Value: 상응하는 유니코드
		for (char alph = 'a'; alph <= 'z'; alph++) {
			mapAlphUni.put(String.valueOf(alph), (int)alph);
		}
		
		// 3. 출력(1): mapAlphUni를 한번에 출력
		// - Map의 내용을 한 눈에 볼 수 있으나, 항목 간의 구분이 명확하지 않을 수 있음.
		System.out.println("알파벳과 알파벳의 유니코드를 한 쌍의 Entry로 저장한 map을 출력합니다.");
		System.out.println(mapAlphUni);
		
		System.out.println("---------------------------------------------");
		
		// << chatGPT recommendation >>
		// 3. 출력(2): mapAlphUni를 각 Entry 별로 출력
		// - 각 항목을 구조적으로 출력하여 Map의 내용을 명확하게 볼 수 있음.
		System.out.println("알파벳과 알파벳의 유니코드를 한 쌍의 Entry별로 출력합니다.");
		// alphUniEntry: 알파벳(String)과 유니코드(Integer)를 mapAlphUni의 Entry 한 쌍을 가져와 출력하는 것
		for (Map.Entry<String, Integer> alphUniEntry : mapAlphUni.entrySet()) {
			// alphUniEntry.getKey: alphUniEntry의 Key 값을 불러오는 것
			// alphUniEntry.getValue: alphUniEntry의 Value 값을 불러오는 것
			System.out.println(alphUniEntry.getKey() + " : " + alphUniEntry.getValue());
		}
		
	}

}
