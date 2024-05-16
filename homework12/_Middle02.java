package homework12;

import homework12.middle.StringBuilderUtils;

public class _Middle02 {

	public static void main(String[] args) {
		// 2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 
		// 역순으로 변경하는 메소드 reverseSb를 각각 선언하고 
		// StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
		
		StringBuilder ap = appendSb((sb1, sb2) ->{
			return sb1.append(sb2);
		});
		System.out.println(ap);
		
		StringBuilder re = reverseSb((sb1, sb2) ->{
			return sb1.append(sb2).reverse();
		});
		System.out.println(re);
		
	}

	public static StringBuilder combineStrBuilder(StringBuilderUtils stringBuilderUtils) {
		StringBuilder st1 = new StringBuilder("안녕하세요.");
		StringBuilder st2 = new StringBuilder("반가워요.");

		return stringBuilderUtils.combineStrBuilder(st1,st2);
	}
	
	public static StringBuilder appendSb(StringBuilderUtils stringBuilderUtils) {
		StringBuilder st1 = new StringBuilder("안녕하세요.");
		StringBuilder st2 = new StringBuilder("반가워요.");
		StringBuilder result = st1.append(st2);
		return result;
	}
	
	public static StringBuilder reverseSb(StringBuilderUtils stringBuilderUtils) {
		StringBuilder st1 = new StringBuilder("안녕하세요.");
		StringBuilder st2 = new StringBuilder("반가워요.");
		StringBuilder result = st1.append(st2);
		return result.reverse();
	}
	

	
	
}
