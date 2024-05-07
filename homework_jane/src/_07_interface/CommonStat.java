package _07_interface;

public class CommonStat {
	
	int sno; 
    String name;
    String[] subject;
    int[] finalExamScore;
    
	public CommonStat(int sno, String name, String[] subject, int[] finalExamScore) {
		super();
		this.sno = sno;
		this.name = name;
		this.subject = subject;
		this.finalExamScore = finalExamScore;
	}
	
	public void saveInfo(String subject, int finalExamScore) {
		
		for(int i = 0; i < this.subject.length; i++) {
			if(subject == null) {
			this.subject[i] = subject;
			this.finalExamScore[i] = finalExamScore;
			}
		}
		
		
	}

		public void printInfo() {	
			System.out.println("학번 : " + sno);
			System.out.println("이름 : " + name);
			for(int i = 0; i < this.subject.length; i++) {
				if(this.subject[i] != null) {
				System.out.println("과목 : " + this.subject[i]);
				System.out.println(subject[i]+"의 기말시험점수 : " + this.finalExamScore[i]);
				}
			}
		}

		
	
		

	public double getAvg() {
		double sum = 0;
		for(int i = 0; i < finalExamScore.length; i++) {
			 sum += finalExamScore[i];
		}
		return sum/finalExamScore.length;
		
	}
   
    
    
}
