package _01_basic;

import java.util.Scanner;

public class _12_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12. 정수 10개를 입력받아 배열에 저장하고, 
	    // 이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		
		Scanner sc  = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.println("정수 10개를 입력하세요");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();				//왜 arr[i] ?? arr 
		}		
	
		for(int i = 0 ; i < arr.length; i++) {
		if(arr[i] % 2==0 || arr[i]%3 == 0) {
			System.out.println("2의 배수와 3의 배수 :" + arr[i]);  //for 문 두번써주기??
		}
			
			
		}
		sc.close();
}

}