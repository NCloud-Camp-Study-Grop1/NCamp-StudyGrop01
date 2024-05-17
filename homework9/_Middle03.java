package homework9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _Middle03 {

	public static void main(String[] args) {
		// 3. Map<Integer, Integer>�� �Ű������� �޾Ƽ� key�� �������� ���, 
		//    value�� �������� ����ϴ� printKVDesc��� �޼ҵ带 �����ϼ���. 
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
		// map�� key�� value�� ������ ���� Entry ���
		List<Entry<Integer, Integer>> entList = new ArrayList<Map.Entry<Integer,Integer>>();
		
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			entList.add(ent);
		}
		
		for(int i = 0; i < entList.size(); i++) {
			// Key�� ����, Value�� ����
			System.out.println(entList.get(i).getKey()
					           + " : " +
					           entList.get(entList.size() - (i + 1)).getValue());
			// ���� entList.size�� 5��� ���� ��
			// 5 - (0 + 1) = 4
			// 5 - (1 + 1) = 3
			// 5 - (2 + 1) = 2 ...
			// ���� i�� ���� ���
			// 5 - 0 = 5
			// 5 - 1 = 4
			// 5 - 2 = 3
			
		}
	}

}
