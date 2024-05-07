package homework;

import java.util.Scanner;

public class _0503_middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a  a  b  a  b  b  c  c  c  c
		// 1  2  3  4  5  6  7  8  9  10
		
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		int inputsize = 0;
		
		
		System.out.print("문자열을 입력해 주세요 : ");
		
		input = sc.nextLine();
		
		inputsize = input.length();
		char[] test = new char[inputsize];
		
		for(int i =0; i< inputsize; i++) {
			test[i] = input.charAt(i);
		}
		
		
		for(int i=0; i<inputsize-1; i++) {
			int count = 0;
			for(int j=inputsize-1; j>=i+1; j--) {
				if(test[i]==test[j]) {
					++count;
				}
			}
			if(count == 0) {
				System.out.print(test[i]);
			}
		}
		
		System.out.println(test[inputsize-1]);
		

	}



}
