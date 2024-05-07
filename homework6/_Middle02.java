package homework6;

public class _Middle02 {

	public static void main(String[] args) {
		// 2. 길이가 12인 char 배열을 선언하고 
		//    {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}
		//    로 초기화합니다.
		//    단어를 bit, com, sql, int로 만들어서 모두 출력하세요.
		//    bit => 0, 4, 8 com => 1, 5, 9 sql => 2, 6, 10 int => 3, 7, 11
		
		char[] chr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
		
		System.out.println(chr[0] + chr[4] + chr[8]); // bit
		System.out.println(chr[1] + chr[5] + chr[9]); // bit
		System.out.println(chr[2] + chr[6] + chr[10]); // bit
		System.out.println(chr[3] + chr[7] + chr[11]); // bit
	}

}
