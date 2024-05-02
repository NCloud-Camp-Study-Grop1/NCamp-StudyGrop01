package HomeWork;

public class ArrayUtility {
	
	public static int[] iSource;
	public static double[] dSource;
	
	public void ArrayUtility() {
		
	}
	
	
	
	static double[] intToDouble(int[] source) {
		
		for(int i = 0; i < source.length; i++) {
			dSource[i] = (double)source[i];
		}
		return dSource;
		
	}
	
	static int[] doubleToInt(double[] source) {
		
		for(int i = 0; i < source.length; i++) {
			iSource[i] = (int)source[i];
		}
		return iSource;
		
	}

}
