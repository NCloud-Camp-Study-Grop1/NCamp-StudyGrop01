package homework6;

import java.util.Scanner;

public class _Middle03 {

	public static void main(String[] args) {
		// 3. 처음에 은행에 맡긴 돈은 10000원입니다
		//    금리는 연 10%입니다
		//    복리이자로 계산했을 때 10년후 얼마가 될까요?
		
		int money = 10000;
		
		for(int i = 0; i < 10; i++) {
			money *= 1.1; 
		}
		System.out.println(money);
	}

}
