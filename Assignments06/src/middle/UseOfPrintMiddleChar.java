package middle;

public class UseOfPrintMiddleChar {
	
	public static void main(String[] args){
		
    	PrintMiddleChar printMiddleChar = new PrintMiddleChar();
        
        String input1 = "비트캠프";
        String input2 = "비둘기";
        
        System.out.println("짝수 길이 문자열의 중간 두 문자: " + printMiddleChar.printMiddleChar(input1));
        System.out.println("홀수 길이 문자열의 중간 문자: " + printMiddleChar.printMiddleChar(input2));
		
	}
}
