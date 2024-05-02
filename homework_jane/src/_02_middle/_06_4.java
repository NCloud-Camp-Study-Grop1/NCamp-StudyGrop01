package _02_middle;

public class _06_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	6-4) 중첩 for문을 이용해서 아래와 같이 출력하세요.
//	*****
//	 ****
//	  ***
//	   **
//	    *

		for(int i=0; i<5; i++) {
			System.out.println();
			for(int k=0; k<=i-1; k++) {
				System.out.print(" ");
			}
			for(int j=5; j>i ; j--) {
				System.out.print("*");
			}

		}
		
		
		
	}

}
