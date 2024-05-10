package _10_usefulclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.

		
		List<Integer> intList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int inputNum = 0;
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("정수를 입력하세요.");	
			intList.add(sc.nextInt());
		}


		for(int i = 0; i < 5; i++) {
			System.out.println(intList.get(i));
			
		}
		
		
		
//		Object get(int index) : 해당 index의 데이터를 꺼내는 메소드
	}

}
