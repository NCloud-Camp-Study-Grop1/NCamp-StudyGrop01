package basic;

public class Rect {
	// 1. 필드
	// 1-1. 가로 길이
	public int width;
	// 1-2. 세로 길이
	public int height;

	
	// 2. 메소드
	// 2-1. 사각형의 둘레를 리턴하는 메소드
	public int perimeter() {
		return 2 * (width + height);
	}
	// 2-2. 사각형의 넓이를 리턴하는 메소드
	public int area() {
		return width * height;
	}

}
