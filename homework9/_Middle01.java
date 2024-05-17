package homework9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class _Middle01 {

	public static void main(String[] args) {
		// 1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
		//    4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		//    (이름 : 90)
		
		// 학생 데이터를 저장할 Map 생성. String은 Key, Integer는 value
		Map<String, Integer> studentMap = new HashMap<>();
		
		// 4명의 학생 데이터 입력
		studentMap.put("홍길동", 90);
		studentMap.put("임꺽정", 50);
		studentMap.put("김만수", 70);
		studentMap.put("곽두팔", 100);
		
		// set은 중복을 허용하지 않는다고 했는데, 그렇다면 key는 똑같으나 value는 다른 데이터를
		// 넣으면 어떻게 될까? => 결과는 얘 자체가 출력이 안됐다!
		studentMap.put("홍길동", 60);
		
		// key와 value 모두 다른 것은 정상적으로 출력된다.
		studentMap.put("이민주", 60);
		
		System.out.println("전체 학생 출력 : ");
		System.out.println(studentMap);
		
		
		// Entry : entry라는 하나의 클래스에 저장되어 key, value를 모두 한번의 조작으로
		// 얻을 수 있다. entry는 인터페이스로 구현클래스가 필요하다. (Map은 인터페이스)
		
		// Set : 중복 요소를 허용하지 않는 collection, 특정한 순서를 가지고 있지 않다.
		// 인덱싱을 제공하지 않기 때문에 인덱스를 사용할 수 없다. 
		// entrySet : 맵에 있는 모든 Entry(Key-Value)를 가져와서 Set 객체로 반환
		
		// 중복을 제외하기 위한 Set을 사용하여 Entry로 key와 Value를 얻고
		// studentMap에 있는 key와 value를 set으로 반환하여 entrySet에 저장
		// set을 사용했기 때문에 순서 상관없이 출력된다.
		Set<Entry<String, Integer>> entrySet = studentMap.entrySet();
		
		// Iterator : 직역하면 반복하다. ArrayList, HashSet과 같은 컬렉션들을 반복하는데
		// 사용할 수 있는 객체, 반복자이다.
		// 반복자를 사용해 요소들을 순회하며 읽어오는 it을 생성
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		
		String name = "";
		int score = 0;
		
		// hasNext : 읽어올 요소가 남아있는지 확인하는 메소드, boolean 타입으로 반환된다.
		// 요소가 있으면 true, 요소가 없으면 false
		// next : 다음 데이터를 반환, 데이터의 타입이 어떤거인지에 따라 반환하는 것이 다르다.
		// ex. 데이터가 String이면 String값으로 반환한다.
		while (it.hasNext()) {
			// 다음 학생의 데이터를 저장하는 Entry(Map의 일부분)
			Entry<String, Integer> ent = it.next();
			
			// 만약에 다음 학생의 점수(value)가 score보다 높으면
			if(ent.getValue() > score) {
				// score에는 그 학생의 점수(value)를
				score = ent.getValue();
				// name에는 그 학생의 이름(Key)을
				name = ent.getKey();
			}
		}
		
		System.out.println("가장 점수가 높은 학생의 이름과 점수는");
		System.out.println(name + " : " + score);
		
	}

}
