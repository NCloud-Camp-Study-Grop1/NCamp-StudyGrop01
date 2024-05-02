package advance.advance01;

public class ArrayUtility {
	// operator
	
	
	// method
	public static double[] intToDouble(int[] source) {
		double[] result = new double[source.length];
		for (int i = 0; i < source.length; i++) {
			result[i] = (double)source[i];
		}
		return result;
	}
	
	public static int[] doubleToInt(double[] source) {
		int[] result = new int[source.length];
		for (int i = 0; i < source.length; i++) {
			result[i] = (int)source[i];
		}
		return result;
	}
}
