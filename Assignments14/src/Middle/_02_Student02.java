package Middle;

import java.util.ArrayList;
import java.util.List;

public class _02_Student02 {

	public static void main(String[] args) {
		// 2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
		
		// studentList
		List<Student> studentList = new ArrayList<Student>();
		
		// add Students
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		// Stream 생성 및 출력
		System.out.println("시험에서 95점 이상의 점수를 받은 학생 출력");
		studentList.stream().filter(student -> student.getScore() >= 95)
							.peek(student -> student.setGrade("A+"))
							.forEach(student -> System.out.println(student));

	}

}
