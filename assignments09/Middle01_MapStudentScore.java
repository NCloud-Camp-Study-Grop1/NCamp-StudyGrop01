package assignments09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Middle01_MapStudentScore {

	public static void main(String[] args) {
		// 1. mapStudentScore: 이름(String)과 시험 점수(Integer)를 저장한 HashMap 메소드 객체 생성
		Map<String, Integer> mapStudentScore = new HashMap<String, Integer>();
		
		
		// 2. Map 구성
		Scanner sc = new Scanner(System.in);
		
		// - 사용자로부터 학생의 이름(name)과 시험 점수(score)을 입력 받을 변수 생성(4명)
		for (int i = 0; i < 4; i++) {
			System.out.println("학생의 이름을 입력해주세요.");
			String name = sc.nextLine();
			System.out.println(name + " 학생의 시험 점수를 입력해주세요.");
			// score: 개행문자(\n)의 존재로 인한 에러 발생 가능성 존재
			// --> String 타입으로 연락처를 입력 받은 후 Int 타입으로 변환		
			int score = Integer.valueOf(sc.nextLine());
			// Key: 이름 // Value: 시험 점수
			mapStudentScore.put(name, score);
		}
		
		// 3. 출력
		// topScorer: 시험 점수가 가장 높은 학생의 이름
		// topScore: 가장 높은 시험 점수
		String topScorer = "";
		int topScore = 0;
		
		// studentEntry: mapStudentScore의 Entry로부터 이름과 성적을 받아 한 쌍의 Entry로 저장
		for (Map.Entry<String, Integer> studentEntry : mapStudentScore.entrySet()) {
			if (studentEntry.getValue() >= topScore) {
				// 시험 점수가 가장 높은 학생의 이름과 시험 점수를 저장
				topScorer = studentEntry.getKey();
				topScore = studentEntry.getValue();
			}
		}
		System.out.printf("성적이 가장 높은 학생은 %s 이고, 시험 점수는 %d점 입니다.", topScorer, topScore);
		
	}

}
