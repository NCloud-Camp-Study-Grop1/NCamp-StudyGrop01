package _01_basic;

import java.util.Random;

public class _11_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11. int 배열로 10개의 공간을 생성하세요.
		//1 ~ 10까지의 임의의 수를 저장하고
		//홀수만 골라서 출력하세요.
		
		
		Random random = new Random();
		
		int[] arr = new int[10];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = random.nextInt(10)+1; 		//random.nextInt()
			
			if(arr[i]%2 != 0) {
				System.out.println("1~10까지의 임의의 10개 홀수 :" + arr[i]);
			}
		}
		
	}

}
