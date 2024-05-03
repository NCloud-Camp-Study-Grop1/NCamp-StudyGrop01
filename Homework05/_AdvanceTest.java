package homework.Homework05;

import homework.Homework05.Advance.ComStudent;

public class _AdvanceTest {

	public static void main(String[] args) {
		ComStudent student = new ComStudent();
		
		student.saveInfo(5, "과목", 100);
		student.printInfo();
	}

}
