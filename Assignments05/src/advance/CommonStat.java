package advance;

public class CommonStat {
	int sno;
	String name;
	String[] subject;
	int[] finalExamScore;
	
    // operator
    public CommonStat(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    // saveInfo
    public void saveInfo(int index, String subject, int score) {
        this.subject[index] = subject;
        this.finalExamScore[index] = score;
    }

    // getAvg
    public double getAvg() {
        int sum = 0;
        for (int score : finalExamScore) {
            sum += score;
        }
        return (double) sum / finalExamScore.length;
    }
}
