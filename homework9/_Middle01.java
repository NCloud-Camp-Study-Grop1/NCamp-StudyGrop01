package homework9;

import java.util.HashMap;
import java.util.Map;

public class _Middle01 {

	public static void main(String[] args) {
		// 1. �л��̸��� key�� ���������� value�� ������ Map<String, Integer>�� �����ϰ�
		//    4���� �л� �����͸� �Է��� �� 4�� �� �ְ� ���� ���� �л��� �̸��� ������ ����ϼ���.
		//    (�̸� : 90)
		
		Map<String, Integer> studentMap = new HashMap<>();
		
		// 4���� �л� ������ �Է�
		studentMap.put("ȫ�浿", 90);
		studentMap.put("�Ӳ���", 80);
		studentMap.put("�踸��", 70);
		studentMap.put("������", 100);
		
		System.out.println("��ü �л� ��� : ");
		System.out.println(studentMap);
		
		
		int score = 0;
		int num = 0;
		
		for(int i = 0; i < 4; i++) {
			score = studentMap.get(i);
			// ���࿡ �� ���� �л��� ������ ���� �� 
			if(score < studentMap.get(studentMap.get(i))) {
				// score ����
				score += studentMap.get(studentMap.get(i));
				num++;
				System.out.println("�� �� ������ ���� ���� �л��� �̸��� ���� " + studentMap.get(num));
			}
		}
		
		
		
	}

}
