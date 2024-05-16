package homework12;

import homework12.middle.StringBuilderUtils;

public class _Middle01 {

	public static void main(String[] args) {
		// 1. 두 개의 StringBuilder 값을 매개변수로 받아 
		// 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 
		// 람다식으로 구현하세요.
		// StringBuilder 함수형 인터페이스 선언, 
		// StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언
		
		
		StringBuilder sb =  combineStrBuilder((sb1, sb2) -> {
			return sb1.append(sb2).reverse();
		});
		System.out.println(sb);
	}
	
	public static StringBuilder combineStrBuilder(StringBuilderUtils stringBuilderUtils) {
		StringBuilder st1 = new StringBuilder("안녕하세요.");
		StringBuilder st2 = new StringBuilder("반가워요.");
		
		// return에 뭘 넣어야 할지 이해가 안가서 잘 몰랐다.
		return stringBuilderUtils.combineStrBuilder(st1,st2);
	}
}
