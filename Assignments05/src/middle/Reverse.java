package middle;

public class Reverse {
	// method
	public String reverseString(String str) {
		String reverseResult = "";
		
		for (int i = (str.length() - 1) ; i >= 0; i--) {
			reverseResult += str.charAt(i);
		}
		return reverseResult;
	}
}
