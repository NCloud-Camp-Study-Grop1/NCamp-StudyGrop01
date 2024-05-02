package basic.basic01;

public class CatFamily extends Mammals {
	// field
	boolean obligateCarnivores;
	boolean preferSolitary;
	
	// operator
	public CatFamily() {
		
	}
	
	public CatFamily(boolean obligateCarnivores, boolean preferSolitary) {
		this.obligateCarnivores = obligateCarnivores;
		this.preferSolitary = preferSolitary;
	}
	
	// method
	// obligateCarnivores: 육식
	public void obligateCarnivores() {
		if (obligateCarnivores = true) {
			System.out.println("고양잇과 동물들 중 대부분은 육식을 합니다.");
		}else {
			System.out.println("육식을 하지 않는 동물은 고양잇과 동물이 아닐 가능성이 높습니다.");
		}
	}
	// preferSolitary: 단독생활 선호
	public void preferSolitary() {
		if (preferSolitary = true) {
			System.out.println("고양잇과 동물들 중 대부분은 단독생활을 선호합니다.");
		} else {
			System.out.println("암수 모두가 무리생활을 선호하는 동물이라면 고양잇과 동물이 아닐 가능성이 높습니다.");
		}
	}
}
