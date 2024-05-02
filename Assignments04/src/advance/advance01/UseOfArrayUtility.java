package advance.advance01;

public class UseOfArrayUtility {

	public static void main(String[] args) {
		int[] iArr = {1, 2, 3};
		double[] dArr = {1.0, 2.0, 3.0};
		
		ArrayUtility arrUtil = new ArrayUtility();
		
		double[] toDouble = arrUtil.intToDouble(iArr);
		int[] toInt = arrUtil.doubleToInt(toDouble);
		
		System.out.println("정수 배열을 더블 배열로 변환한 값");
		for (double i : toDouble) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("-----------------");

		System.out.println("더블 배열을 더블 배열로 변환한 값");
		for (double i : toInt) {
			System.out.print(i + " ");
		}
	}
}