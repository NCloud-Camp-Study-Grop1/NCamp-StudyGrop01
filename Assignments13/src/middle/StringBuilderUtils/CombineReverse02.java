package middle.StringBuilderUtils;

import java.util.function.BiFunction;

public class CombineReverse02 {
	public static void main(String[] args) {
		// combineStrBuilder Reference Implement
		// Function
		// - 하나의 입력 매개변수를 받아서 다른 타입의 결과를 반환하는 메소드
		// - 예시) Function<String, Integer> : 문자열을 입력으로 받아 정수를 반환하는 함수
		// → 현재는 매개변수로 2개의 StringBuilder 값을 받기 때문에 BiFunction 사용
		// - 예시) BiFunction<매개변수의 타입, 매개변수의 타입, 반환 값의 타입>
		BiFunction<StringBuilder, StringBuilder, StringBuilder> combineAndReverse = (sb1, sb2) ->
                new StringBuilder(sb1).append(sb2).reverse();
		
		StringBuilder sb1 = new StringBuilder("짱구");
       		StringBuilder sb2 = new StringBuilder("흰둥이");

        	// combRev Method
       		StringBuilder combRev = combineAndReverse.apply(sb1, sb2);
        	System.out.println("합친 후 역순으로 리턴한 값: " + combRev);
		}
	
    		// appendSb Method: StringBuilder 값을 합침
    		public static StringBuilder appendSb(StringBuilder sb1, StringBuilder sb2) {
        	return sb1.append(sb2);
    	}
	// reverseSb Method: StringBuilder 값을 역순으로 변경
	public static StringBuilder reverseSb(StringBuilder sb) {
		return sb.reverse();
    	}
}
