package basic.basic01;

public class Tiger extends CatFamily {
	// field
	boolean hasPattern;
	boolean orangeColor;
	
	// operator
	public Tiger() {
		
	}
	
	public Tiger(boolean hasPattern, boolean orangeColor) {
		this.hasPattern = hasPattern;
		this.orangeColor = orangeColor;
	}
	
	// method
	// hasPattern: 무늬
	public void hasPattern() {
		if (hasPattern = true) {
			System.out.println("무늬가 있는 고양잇과 포유류는 호랑이일 가능성이 높습니다.");
		}else {
			System.out.println("무늬가 없는 고양잇과 포유류는 호랑이일 가능성이 낮습니다.");
		}
	}
	// orangeColor: 오렌지색
	public void orangeColor() {
		if (orangeColor = true) {
			System.out.println("오렌지색인 고양잇과 포유류는 호랑이일 가능성이 높습니다.");
		}else {
			System.out.println("오렌지색이 아닌 고양잇과 포유류는 호랑이일 가능성이 낮습니다.");
		}
	}
}
