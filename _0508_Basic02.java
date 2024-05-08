package homework;

import java.util.Scanner;

public class _0507_basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		int inputsize = 0;
		
		// Pattern.matches(test[i],'가')
		
		System.out.print("문자열을 입력해 주세요 : ");
		
		input = sc.nextLine();
		
		inputsize = input.length();
		char[] test = new char[inputsize];
		
		for(int i =0; i< inputsize; i++) {
			test[i] = input.charAt(i);
		}
		
		for(int i= 0; i < inputsize; i++) {
			if((Character.compare(test[i], 'a')) == 0) {
				test[i] = ' ';
			}
			else if((Character.compare(test[i], 'e')) == 0) {
				test[i] = ' ';
			}
			else if((Character.compare(test[i], 'i')) == 0) {
				test[i] = ' ';
			}
			else if((Character.compare(test[i], 'o')) == 0) {
				test[i] = ' ';
			}
			else if((Character.compare(test[i], 'u')) == 0) {
				test[i] = ' ';
			}
			
			
		}
		
		System.out.println(test);

	}

}
