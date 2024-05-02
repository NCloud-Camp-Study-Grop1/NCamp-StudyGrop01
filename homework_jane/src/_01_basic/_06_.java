package _01_basic;

public class _06_ {
	
	public static void main(String[] args) {
		//6.1 ~ 100까지 합을 while문으로 출력
		
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {		
			sum += i;
			i++;
		}
		System.out.println("1~100까지의 합: " + sum);
	}

}


//int i = 1;
//int sum = 0;
//
//while (i <= 100) {		
//	sum += i++;
//	
//}
//System.out.println("1~100까지의 합: " + sum);