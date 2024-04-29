package homework;

public class _03_Basic06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 6) 1 ~ 100까지 합을 while문으로 출력
		int a = 1;
		int sum1 = 0;
		
		while (a <= 100) {
			sum1 += a++;
		}
		System.out.println("1 ~ 100까지의 합: " + sum1);
		
		System.out.println("");
		System.out.println("--------------------------------");
		
		// 문제 7) 1 ~ 100까지 합을 do ~ while문으로 출력
		int b = 1;
		int sum2 = 0;
		
		do {
			sum2 += b++;
			}while (b <= 100);
		System.out.println("1 ~ 100까지의 합: " + sum2);
		
		System.out.println("");
		System.out.println("--------------------------------");
		
		// 문제 8) 1 ~ 100까지 합을 for문으로 출력
		int sum3 = 0;
		
		for (int c = 1; c <= 100; c++) {
			sum3 += c;
		}
		System.out.println("1 ~ 100까지의 합: " + sum3);
		
		System.out.println("");
		System.out.println("--------------------------------");
		
		// 문제 9) int 10개짜리 배열 생성하여 int배열에 3의 배수를 차례대로 저장하세요. 그리고 거꾸로 출력하세요.
		// (1) int 10개자리 배열 생성
		int[] intArr = new int [10];
		
		// (2) int 배열에 3의 배수를 차례대로 저장
		for (int d = 0; d < intArr.length; d++) {
			intArr[d] = (d + 1) * 3;
		}
		
		// (3) 거꾸로 출력
		for (int e = 9; e >= 0; e--) {
			System.out.print(intArr[e] + " ");
		}
		
		
		
	}

}
