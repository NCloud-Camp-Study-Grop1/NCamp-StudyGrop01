package homework;

import java.util.Scanner;

public class _0430_middle2 {

	public static char[] alpha(char[] doar) {
		char[] str1 = new char[doar.length];
		
		for(int i=0; i < doar.length; i++) {
			if (doar[i] >= 97 && doar[i] <= 122) {
				if(doar[i] == 'z') {
					str1[i] = 'A';
				}
				else if (doar[i] == 'a') {
					str1[i] = 'Z';
				}
				else {
					str1[i] = (char)(doar[i]-32);
				}
			}
			else if(doar[i] <= 90 && doar[i] >= 65) {
				str1[i] = (char)(doar[i]+32);
			}
		}
		
		return str1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr = {'a', 'B', 'F', 'Z'}; 
		
		System.out.println(alpha(arr));
		
		

	}

}
