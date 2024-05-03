package homework.Homework05;

import homework.Homework05.reverse.Reverse;

public class _Middle01_ReverseTest {

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		String origin = "ABCDE";
		String reverseStr = reverse.reverseString(origin);
		
		System.out.println("기본 : " + origin);
		System.out.println("뒤짚은 후 : " + reverseStr);
	}

}
