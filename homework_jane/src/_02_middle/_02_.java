package _02_middle;

public class _02_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.
		
		int i = 1; 
		
		while (i <= 10) {
			i++;
			if( i %2 == 0) {
				System.out.println("1~10까지의 짝수: " + i);
				
			}
	
		}

	}

}
