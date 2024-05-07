package homework;

import java.util.Scanner;

public class _0503_middle {
	
	/*
	 * . 사용자가 입력한 문자열에서 인덱스가 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는 5로 변경하여 출력하세요.
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char[] strchar = str.toCharArray();
		
		int strSize = str.length();
		
		for(int i=0; i <= strSize-1; i++) {
			if((i+1)%3 == 0) {
				strchar[i] = '3';
			}
			else if((i+1)%5 == 0) {
				strchar[i] = '5';
			}
		}
		
		for(int k=0; k< strchar.length; k++) {
			System.out.print(strchar[k]);
		}
		
		

	}

}
