package basic;

public class MathRound {

	public static void main(String[] args) {
		double dNum = 16.459;
		double roundNum = Math.round(dNum * 100) / 100;
		// < Math.round method >
		// Math.round method: 소수점 첫째자리에서 반올림한 값을 반환하는 method
		// - 소수점 세번째 자리에서 반올림을 진행하기 위해 "dNum * 100"값에 Math.round method를 사용
		// - 해당 값에 100을 나누어 소수점 세번째 자리에서 반올림한 값을 반환할 수 있도록 함
		System.out.println(roundNum);
	}

}
