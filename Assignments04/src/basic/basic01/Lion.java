package basic.basic01;

public class Lion extends CatFamily {
	// field
	boolean hasMane;
	boolean roundHead;
	
	// operator
	public Lion() {
		
	}
	
	public Lion(boolean hasMane, boolean roundHead) {
		this.hasMane = hasMane;
		this.roundHead = roundHead;
	}
	
	// method
	// hasMane: 갈기
	public void hasMane() {
		if (hasMane = true) {
			System.out.println("갈기가 있는 고양잇과 포유류는 사자일 가능성이 높습니다.");
		}else {
			System.out.println("갈기가 없는 고양잇과 포유류는 사자일 가능성이 낮습니다.");
		}
	}
	// roundHead: 둥근 얼굴형
	public void roundHead() {
		if (roundHead = true) {
		System.out.println("둥근 얼굴형을 가진 고양잇과 포유류는 사자일 가능성이 높습니다.");
	}else {
		System.out.println("둥근 얼굴형을 가진 고양잇과 포유류는 사자일 가능성이 낮습니다.");
	}
	}
}
