package middle.StringBuilderUtils;

public class CombineReverse01 {
	public static void main(String[] args) {
		// combineStrBuilder Lambda Expression
		StringBuilderUtils combineStrBuilder = (sb1, sb2) -> {
            	StringBuilder result = new StringBuilder();
            	result.append(sb1).append(sb2);
           	 return result.reverse();
		};
		
		StringBuilder sb1 = new StringBuilder("짱구");
		StringBuilder sb2 = new StringBuilder("흰둥이");
		
		StringBuilder combRev = combineStrBuilder.combineStrBuilder(sb1, sb2);
        	System.out.println("합친 후 역순으로 리턴한 값: " + combRev);
	}

}
