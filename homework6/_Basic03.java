package homework6;

public class _Basic03 {

	public static void main(String[] args) {
		// 3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), 
		// Math.round 메소드 이용
		// Math.round : 주어진 실수를 가장 가까운 정수로 반올림하는 메소드
		
		double num = 16.459;
		
		System.out.println(Math.round(num*100) / 100.0);

	}

}
