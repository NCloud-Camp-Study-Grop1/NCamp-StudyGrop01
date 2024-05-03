package homework.Homework05.Advance;

public class ComStudent extends CommonStat implements Student {

	int sno;
	String name;
	
	// CommonStat 클래스에 있는 subject 배열과 
	// finalExamScore 배열에 값을 저장하는 기능을 구현
	@Override
	public void saveInfo(int index, String subject, int score) {
		super.finalExamScore[index] = score; // score를 받아서 저장
		super.subject[index] = subject; // subject를 받아서 저장
	}

	// 정보를 출력하는 곳?
	@Override
	public void printInfo() {
		this.saveInfo(sno, name, sno); // saveInfo 출력
		this.getAvg(); // 평균 출력

	}

	
	//getAvg메소드는 CommonStat 클래스에 있는 
	// finalExamScore 배열에 있는 값의 평균을 구하면 됩니다.
	@Override
	public double getAvg() {
		// 값을 더해줄 총합
		double sum = 0;
		
		for(int score : this.finalExamScore) {
			sum += score;
		}
		return sum / this.finalExamScore.length;
	}

}
