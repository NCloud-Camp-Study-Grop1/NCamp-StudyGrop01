package Homework_0511;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _0511_advance {

	public static void main(String[] args) {
		// 1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 
		// 그 개수를 출력하세요. (Map<Character, Integer> 형태 사용)
		
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> resultMap = new HashMap<Character, Integer>();

		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.nextLine();

		int[] charCnt = new int[128];
		int max = 0;
		char maxch = 0;
		
		// 각 문자가 문자열에 얼마나 들어가 있는지 확인
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 해당 문자의 ASCII 코드 값을 인덱스로 사용하여 등장 횟수를 증가
            charCnt[ch]++;
        }
		for(int k=0; k < charCnt.length; k++) {
			if(charCnt[k] >= max) {
				max = charCnt[k];
				maxch = (char)k;
			}
		}
		resultMap.put(maxch, max);
		System.out.println(resultMap);
		
	}

}
