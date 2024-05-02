package _05_class;

public class Rect {
	
	int width;
	int height;
	
	
	public Rect(){
		
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int dul(int width, int height) {
		return (width + height)*2;
	}
	
	public int size(int width,int height) {
		return width * height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
