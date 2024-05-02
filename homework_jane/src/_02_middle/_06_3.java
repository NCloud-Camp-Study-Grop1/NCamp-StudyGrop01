package _02_middle;

public class _06_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	6-3)중첩 for문을 이용해서 아래와 같이 출력하세요.
//	*****
//	****
//	***
//	**
//	*
		
		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=0;j<5-i; j++) {
				System.out.print("*");
			
			}	
			
			
		}

		

	}

}
