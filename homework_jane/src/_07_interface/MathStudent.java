package _07_interface;

public class MathStudent extends CommonStat implements Student {

	public MathStudent(int sno, String name, String[] subject, int[] finalExamScore) {
		super(sno, name, subject, finalExamScore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
	}
		public void printInfo() {	
		System.out.println("학번 : " + sno);
		System.out.println("이름 : " + name);
		for(int i = 0; i < this.subject.length; i++) {
			System.out.println(subject[i]+"의 기말시험점수 : " + this.finalExamScore[i]);
			}
		}
	}


