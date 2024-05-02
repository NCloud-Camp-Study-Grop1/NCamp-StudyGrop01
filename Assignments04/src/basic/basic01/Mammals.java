package basic.basic01;

public class Mammals {
	// field
	boolean baby;
	boolean patella;
	
	// operator
	public Mammals() {
		
	}
	
	public Mammals(boolean baby, boolean patella) {
		this.baby = baby;
		this.patella = patella;
	}
	
	// method
	// baby: 새끼
	public void baby() {
		if (baby = true) {
			System.out.println("새끼를 낳는 동물은 포유류가 맞습니다.");
		} else {
			System.out.println("새끼를 낳지 않는 동물은 포유류가 아닙니다.");
		}
	}
	// patella: 무릎뼈
	public void patella() {
		if (patella = true) {
			System.out.println("무릎뼈를 가지고 있는 동물은 포유류입니다.");
		} else {
			System.out.println("무릎뼈를 가지고 있지 않은 동물은 포유류가 아닙니다.");
		}
	}
}
