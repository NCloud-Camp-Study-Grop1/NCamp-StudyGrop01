package advance;

public class MathStudent extends CommonStat implements Student {
	
	public MathStudent(int sno, String name) {
		super(sno, name);
	}
	
	@Override
	public void saveInfo(int index, String subject, int score) {
		super.saveInfo(index, subject, score);
	}

	@Override
	public double getAvg() {
		return super.getAvg();
	}

	@Override
	public void printInfo() {
		System.out.println("수학학생의 정보를 출력");
		System.out.println("학번: " + sno);
		System.out.println("이름: " + name);
		System.out.println("기말 성적: " + finalExamScore);
	}

}
