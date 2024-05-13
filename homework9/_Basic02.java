package homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _Basic02 {

	public static void main(String[] args) {
		// 2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 
		//    특정 이름의 전화번호를 조회하는 기능을 구현하세요.
		
		Map<String, String> map = new HashMap<>();
		
		map.put("홍길동", "010-1111-1111");
		map.put("곽두팔", "010-1234-5678");
		map.put("임꺽정", "010-3333-3333");
		map.put("김만수", "010-2222-2222");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---- 주소록 시스템 ----");
		System.out.println("주소록에서 검색하고자 하는 분의 성함을 입력해주세요.");
		
		String userStr = sc.nextLine();
		
		System.out.println(userStr + "님의 전화번호는 " + map.get(userStr));
		
		System.out.println("작업을 종료합니다.");
	}

}
