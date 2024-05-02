package homework.homework4.basicAnimal;

public class Lion extends Cat{
	
	// 기본생성자 생성
	public Lion() {
		
	}
	
	public void eat() {
		super.eat(); // cat의 eat
		System.out.println("사자는 육식입니다.");
	}
	
	public void Characteristic() {
		super.eat();
		System.out.println("사자도 혀에 가시돌기가 있습니다.");
	}
}
