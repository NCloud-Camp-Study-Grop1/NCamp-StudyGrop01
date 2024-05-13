package homework9;

import java.util.HashMap;
import java.util.Map;

public class _Middle01 {

	public static void main(String[] args) {
		// 1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
		//    4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		//    (이름 : 90)
		
		Map<String, Integer> studentMap = new HashMap<>();
		
		// 4명의 학생 데이터 입력
		studentMap.put("홍길동", 90);
		studentMap.put("임꺽정", 80);
		studentMap.put("김만수", 70);
		studentMap.put("곽두팔", 100);
		
		System.out.println("전체 학생 출력 : ");
		System.out.println(studentMap);
		
		
		int score = 0;
		int num = 0;
		
		for(int i = 0; i < 4; i++) {
			score = studentMap.get(i);
			// 만약에 그 다음 학생이 점수가 높을 시 
			if(score < studentMap.get(studentMap.get(i))) {
				// score 갱신
				score += studentMap.get(studentMap.get(i));
				num++;
				System.out.println("이 중 점수가 가장 높은 학생의 이름과 성적 " + studentMap.get(num));
			}
		}
		
		
		
	}

}
