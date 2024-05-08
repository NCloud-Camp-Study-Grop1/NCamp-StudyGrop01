package assignments07;
import java.util.Scanner;

public class Middle02_PrintReverse {

	public static void main(String[] args) {
		// stringBuffer: "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."는 StringBuffer 변수
		StringBuffer stringBuffer = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		// inputIndex: 사용자로부터 정수를 입력 받아 저장하는 변수
		try {
			Scanner sc = new Scanner(System.in);
			System.out.printf("사용자님 0부터 %d까지의 숫자를 입력해주세요.", stringBuffer.length() - 1);
			int inputIndex = sc.nextInt();
			
			// printReverse: 기존 문자열을 거꾸로 저장하는 StringBuffer 변수
			StringBuffer printReverse = stringBuffer.reverse();
			
			// 사용자가 입력한 인덱스에 해당하는 값 출력
			System.out.println(printReverse.charAt(inputIndex));
		// 사용자가 제대로된 정수값을 입력하지 않았을 때,
		// 에러코드를 송출하며, 용자로 하여금 문자열의 인덱스 사이값인 정수를 입력할 수 있도록 재유도하는 문장 출력
		} catch(IndexOutOfBoundsException ie) {
			System.out.println("  << Warning! ErrorCode 00  >>  ");
			System.out.printf("사용자님 정수를 0 ~ %d까지 다시 입력해주세요.", stringBuffer.length() - 1);
		}
		
		
		
	
	}

}
