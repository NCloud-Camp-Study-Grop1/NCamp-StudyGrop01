package homework.homework4.basicAnimal;

public class Tiger extends Cat{
	public Tiger() {
		
	}
	
	public void eat() {
		super.eat(); // cat의 eat
		System.out.println("호랑이는 육식입니다.");
	}
	
	public void Characteristic() {
		super.eat();
		System.out.println("호랑이도 혀에 가시돌기가 있습니다.");
	}
}
