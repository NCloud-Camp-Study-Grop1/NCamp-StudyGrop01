package homework9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _Middle03 {

	public static void main(String[] args) {
		// 3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순으로 출력, 
		//    value는 역순으로 출력하는 printKVDesc라는 메소드를 구현하세요. 
		//    {1: 3, 2: 4, 3: 5}
		//     1 : 5
		//     2 : 4
		//     3 : 3
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int j = 3;
		
		for(int i = 1; i <= 3; i++) {
			map.put(i, j);
			j++;
		}
		printKVDesc(map);
	}
	
	public static void printKVDesc(Map<Integer, Integer> map) {
		// map의 key와 value를 얻어오기 위해 Entry 사용
		List<Entry<Integer, Integer>> entList = new ArrayList<Map.Entry<Integer,Integer>>();
		
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			entList.add(ent);
		}
		
		for(int i = 0; i < entList.size(); i++) {
			// Key는 정순, Value는 역순
			System.out.println(entList.get(i).getKey()
					           + " : " +
					           entList.get(entList.size() - (i + 1)).getValue());
			// 만일 entList.size가 5라고 쳤을 때
			// 5 - (0 + 1) = 4
			// 5 - (1 + 1) = 3
			// 5 - (2 + 1) = 2 ...
			// 만약 i만 넣을 경우
			// 5 - 0 = 5
			// 5 - 1 = 4
			// 5 - 2 = 3
			
		}
	}

}
