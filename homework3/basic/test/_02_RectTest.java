package homework3.test;

import homework3.Rect;

public class _02_RectTest {

	public static void main(String[] args) {
		Rect rect = new Rect(5, 7);
		
		System.out.println("사각형의 둘레 : " + rect.rectCenter());
		System.out.println("사각형의 넓이 : " + rect.rectArea());
	}

}
