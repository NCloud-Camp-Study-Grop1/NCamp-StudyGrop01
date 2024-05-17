package homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _Middle02 {

	public static void main(String[] args) {
		// 2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 
		//    가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(20, 30); // 600
		map.put(50, 20); // 1000
		map.put(60, 70); // 4200
		map.put(50, 80); // 4000
		
		System.out.println(getMaxMul(map));
	}
	
	// 매개변수로 Map<Integer, Integer>
	public static Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map) {
		Entry<Integer, Integer> maxEntry = null;
		int num = 0;
		
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			if(ent.getKey() * ent.getValue() > num) {
				num = ent.getKey() * ent.getValue();
				maxEntry = ent;
			}
		}
		
		return maxEntry;
		
	}

}
