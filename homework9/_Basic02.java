package homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _Basic02 {

	public static void main(String[] args) {
		// 2. �̸��� ��ȭ��ȣ�� ������ �ϴ� �ּҷ��� HashMap���� �����ϰ�, 
		//    Ư�� �̸��� ��ȭ��ȣ�� ��ȸ�ϴ� ����� �����ϼ���.
		
		Map<String, String> map = new HashMap<>();
		
		map.put("ȫ�浿", "010-1111-1111");
		map.put("������", "010-1234-5678");
		map.put("�Ӳ���", "010-3333-3333");
		map.put("�踸��", "010-2222-2222");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---- �ּҷ� �ý��� ----");
		System.out.println("�ּҷϿ��� �˻��ϰ��� �ϴ� ���� ������ �Է����ּ���.");
		
		String userStr = sc.nextLine();
		
		System.out.println(userStr + "���� ��ȭ��ȣ�� " + map.get(userStr));
		
		System.out.println("�۾��� �����մϴ�.");
	}

}
