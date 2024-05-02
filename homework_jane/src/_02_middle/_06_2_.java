package _02_middle;

public class _06_2_ {
	public static void main(String[] args) {
//6-2) 중첩 for문을 이용해서 아래와 같이 출력하세요.
//	     *
//	    **
//	   ***
//	  ****
//	 *****
		
		
		for(int i=1; i <= 5; i++) {
			System.out.println();
			for(int k =0 ; k <= 5-i; k++) {
				System.out.print(" ");
			}
			for(int j= 1; j <= i ; j++) {
				System.out.print("*");
		}
	}
	
	}
}


