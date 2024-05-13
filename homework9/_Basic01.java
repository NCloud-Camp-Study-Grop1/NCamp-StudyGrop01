package homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _Basic01 {

	public static void main(String[] args) {
		// 1. Map<String, Integer>�� �ϳ� �����Ͽ� key�� ���ĺ�(��ҹ��� ����) 
		//    value�� �ش� ���ĺ��� �����ڵ� ���� Integer���·� �����ϼ���.
		
		// Key => String, ���ĺ��� ��ҹ��ڸ� ����
		// value => Integer, �ش� ���ĺ��� �����ڵ� ���� ����
		Map<String, Integer> map = new HashMap();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �ϳ� �Է��ϼ���.");
		
		String userStr = sc.nextLine();
		
		// compareTo => �� ���� ���� ���Ͽ� int ������ ��ȯ
		// ������ �񱳴� ũ��(1), ����(0), �۴�(-1) ����
		// ���ڿ��� �񱳴� ����(0), �� �� (���/����)
		// �񱳴�� ���ڿ��� ���ԵǾ� �ִ����� ��
		// ex. "abcd" �� "ab" �� => ��� : 2
		//        4   -   2  = 2 (���ڿ��� ���̸� ��)
		// �� �ڸ� ���ڿ� ���� ���� �ƽ�Ű �ڵ尪���� ��
		
		// a�� ���� ���� 0, �� �ܿ��� userStr - a �̱⿡ 0���� ŭ
		// z�� ���� ���� 0, �� �ܿ��� userStr - z�̱⿡ ���̳ʽ� ���� �����⿡ 0���� ����
		// ex. c(99) - a(97) = 2
		// ex. c(99) - z(122) = -23
		// �ᱹ a���� z�ȿ� �ִ� ���ڿ��� ��� �� if���� ��
		if(userStr.compareTo("a") >= 0 && userStr.compareTo("z") <= 0) {
			map.put(userStr, (int)userStr.charAt(0));
			System.out.println("�Է��Ͻ� ���ڴ� �ҹ����̸�, �ƽ�Ű �ڵ��� ���� " + 
					(int)userStr.charAt(0) + "�Դϴ�.");
		}
		
		if(userStr.compareTo("A") >= 0 && userStr.compareTo("Z") <= 0) {
			map.put(userStr, (int)userStr.charAt(0));
			System.out.println("�Է��Ͻ� ���ڴ� �빮���̸�, �ƽ�Ű �ڵ��� ���� " + 
					(int)userStr.charAt(0) + "�Դϴ�.");
		}
	}

}
