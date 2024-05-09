package assignments08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic03_ArrayList {

	public static void main(String[] args) {
	List<Integer> result = inputResult();
	System.out.println("사용자님께서 저장하신 정수들의 리스트는 " + result + " 입니다.");
	
	}
	// inputResult method
	public static  List<Integer> inputResult() {
		Scanner sc = new Scanner(System.in);
		
		// generate ArrayList
		// inputList: 사용자로부터 값을 입력 받아 저장할 List
		List<Integer> inputList = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("사용자님 정수값을 입력해주세요.");
			inputList.add(sc.nextInt());
		}
		sc.close();
		return inputList;
	}
}