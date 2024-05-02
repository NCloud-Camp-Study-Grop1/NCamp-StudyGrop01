package _02_middle;

import java.util.Random;

public class _04_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. 20개 배열을 선언하세요.
	   // 20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
	   // 인덱스의 홀수번째는 앞에서부터 출력하고
	   // 짝수번째는 뒤에서부터 출력하세요.
		
		Random random = new Random();
		int[] arr = new int[20];
		
		for(int i = 0; i <= arr.length; i++) {
			arr[i] = random.nextInt(101);  // 101
			}
		
//		for(int i = 0; i <= arr.length; i++) {
//			if(i%2==1) {
//				System.out.println("홀수번째: " +arr[i]);
//			}    
		// >> 홀수는 꼭 나머지가 1이 아니다 그래서 else 구문을 써주는게 좋다. 
			
	
		for(int i =arr.length-1; i >= 0; i--) {
			if(i%2==0) {
				System.out.println("짝수번째:" + arr[i]);
			} else {
				System.out.println("홀수번째: " +arr[i]);
			}
	

	}

	}
}
