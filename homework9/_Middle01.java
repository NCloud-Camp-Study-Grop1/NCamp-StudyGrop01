package homework9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class _Middle01 {

	public static void main(String[] args) {
		// 1. �л��̸��� key�� ���������� value�� ������ Map<String, Integer>�� �����ϰ�
		//    4���� �л� �����͸� �Է��� �� 4�� �� �ְ� ���� ���� �л��� �̸��� ������ ����ϼ���.
		//    (�̸� : 90)
		
		// �л� �����͸� ������ Map ����. String�� Key, Integer�� value
		Map<String, Integer> studentMap = new HashMap<>();
		
		// 4���� �л� ������ �Է�
		studentMap.put("ȫ�浿", 90);
		studentMap.put("�Ӳ���", 50);
		studentMap.put("�踸��", 70);
		studentMap.put("������", 100);
		
		// set�� �ߺ��� ������� �ʴ´ٰ� �ߴµ�, �׷��ٸ� key�� �Ȱ����� value�� �ٸ� �����͸�
		// ������ ��� �ɱ�? => ����� �� ��ü�� ����� �ȵƴ�!
		studentMap.put("ȫ�浿", 60);
		
		// key�� value ��� �ٸ� ���� ���������� ��µȴ�.
		studentMap.put("�̹���", 60);
		
		System.out.println("��ü �л� ��� : ");
		System.out.println(studentMap);
		
		
		// Entry : entry��� �ϳ��� Ŭ������ ����Ǿ� key, value�� ��� �ѹ��� ��������
		// ���� �� �ִ�. entry�� �������̽��� ����Ŭ������ �ʿ��ϴ�. (Map�� �������̽�)
		
		// Set : �ߺ� ��Ҹ� ������� �ʴ� collection, Ư���� ������ ������ ���� �ʴ�.
		// �ε����� �������� �ʱ� ������ �ε����� ����� �� ����. 
		// entrySet : �ʿ� �ִ� ��� Entry(Key-Value)�� �����ͼ� Set ��ü�� ��ȯ
		
		// �ߺ��� �����ϱ� ���� Set�� ����Ͽ� Entry�� key�� Value�� ���
		// studentMap�� �ִ� key�� value�� set���� ��ȯ�Ͽ� entrySet�� ����
		// set�� ����߱� ������ ���� ������� ��µȴ�.
		Set<Entry<String, Integer>> entrySet = studentMap.entrySet();
		
		// Iterator : �����ϸ� �ݺ��ϴ�. ArrayList, HashSet�� ���� �÷��ǵ��� �ݺ��ϴµ�
		// ����� �� �ִ� ��ü, �ݺ����̴�.
		// �ݺ��ڸ� ����� ��ҵ��� ��ȸ�ϸ� �о���� it�� ����
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		
		String name = "";
		int score = 0;
		
		// hasNext : �о�� ��Ұ� �����ִ��� Ȯ���ϴ� �޼ҵ�, boolean Ÿ������ ��ȯ�ȴ�.
		// ��Ұ� ������ true, ��Ұ� ������ false
		// next : ���� �����͸� ��ȯ, �������� Ÿ���� ��������� ���� ��ȯ�ϴ� ���� �ٸ���.
		// ex. �����Ͱ� String�̸� String������ ��ȯ�Ѵ�.
		while (it.hasNext()) {
			// ���� �л��� �����͸� �����ϴ� Entry(Map�� �Ϻκ�)
			Entry<String, Integer> ent = it.next();
			
			// ���࿡ ���� �л��� ����(value)�� score���� ������
			if(ent.getValue() > score) {
				// score���� �� �л��� ����(value)��
				score = ent.getValue();
				// name���� �� �л��� �̸�(Key)��
				name = ent.getKey();
			}
		}
		
		System.out.println("���� ������ ���� �л��� �̸��� ������");
		System.out.println(name + " : " + score);
		
	}

}
