package assignments09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basic02_MapNamePhoneNum {

	public static void main(String[] args) {
		// 1. mapNamePhoneNum: 이름(String)과 연락처(Integer)를 저장할 HashMap 메소드 객체 생성
		Map<String, Integer> mapNamePhoneNum = new HashMap<String, Integer>();
		
		// 2. Map 구성
		Scanner sc = new Scanner(System.in);
		
		// - 사용자로부터 이름과 연락처를 입력 받을 변수 생성(3명)
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ". 연락처를 저장하실 분의 성함을 입력해주세요.");
			String name = sc.nextLine();
			System.out.println(name + "님의 연락처를 입력해주세요.");
			// phoneNum: 개행문자(\n)의 존재로 인한 에러 발생 가능성 존재
			// --> String 타입으로 연락처를 입력 받은 후 Int 타입으로 변환
			int phoneNum = Integer.parseInt(sc.nextLine());
			// - Key: 이름 // Value: 연락처
			mapNamePhoneNum.put(name, phoneNum);
			System.out.println();
		}
		
		// 3. 사용자에게 연락처를 찾고 싶은 사람의 이름을 입력 받아 연락처를 출력
		System.out.println("사용자님 연락처를 찾으시는 분의 성함을 입력해주세요.");
		String searchName = sc.nextLine();
		if (mapNamePhoneNum.containsKey(searchName)) {
			System.out.println(searchName + "님의 연락처: " + mapNamePhoneNum.get(searchName));
		} else {
			System.out.println(searchName + "님은 연락처에 저장돼 있지 않습니다.");
		}
		
	}

}
