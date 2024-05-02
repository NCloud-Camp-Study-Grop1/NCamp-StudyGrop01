package _01_basic;

import java.util.Scanner;

public class _10_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10. int배열을 10개 생성해서
		// 사용자로부터 10개의 값을 입력받고
		//순서대로 출력하고 총합을 구하세요.
		
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; 
		
		System.out.println("숫자10개를 입력하세요");
		for (int i=0; i<= arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			
			System.out.println("총합: "+ sum);
			
			
		} 
		
		sc.close();
		
		

	}

}
