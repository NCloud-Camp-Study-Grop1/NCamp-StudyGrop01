package homework;

public class _03_Basic03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 3) 10 ~ 1까지 거꾸로 while문으로 출력
		int a = 10;
		
		while (a >= 1) {
			System.out.print(a-- + " ");
		}
		
		System.out.println("");
		System.out.println("--------------------------------");
		
		// 문제 4) 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		int b = 10;
		
		do {
			System.out.print(b-- + " ");
		} while (b >= 1);
		
		System.out.println("");
		System.out.println("--------------------------------");

		// 문제 5) 10 ~ 1까지 거꾸로 for문으로 출력
		for (int c = 10; c >= 1; c--) {
			System.out.print(c + " ");
		}
		
	
	}

}
