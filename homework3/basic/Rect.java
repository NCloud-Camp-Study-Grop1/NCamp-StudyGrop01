package homework3;

public class Rect {
	int width;
	int height;
	
	public Rect() {
		
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int rectCenter() {
		return (int)((width + height) * 2);
	}
	
	public int rectArea() {
		return (int)(width * height);
	}
	
}
