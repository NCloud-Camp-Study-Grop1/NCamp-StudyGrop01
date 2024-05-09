package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Basic03 {

	public static void main(String[] args) {
		// 3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 
		//    사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		
		List<Integer> arr = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		// 5개를 입력받고 저장받음
		for(int i = 0; i < 5; i++) {
			System.out.println("문자열을 입력하세요. (총 5개) : ");
			// 사용자가 입력한 숫자를 저장할 int
			int sum = sc.nextInt();
			
			arr.add(sum);
		}
		System.out.println("입력한 정수는 " + arr);
	}

}
