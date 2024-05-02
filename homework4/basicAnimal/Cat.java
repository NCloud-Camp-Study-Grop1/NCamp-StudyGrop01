package homework.homework4.basicAnimal;

public class Cat extends Animal {
	
	// 기본생성자 생성
	public Cat() {
		
	}
	
	public void eat() {
		super.eat(); // animal의 eat 
		System.out.println("고양이과는 육식성질이 강한 잡식성입니다.");
	}
	
	public void Characteristic() {
		super.Characteristic(); // animal의 Characteristic
		System.out.println("고양이과의 대표적 특징으로는 혀에 가시돌기가 있다는 점입니다.");
	}
}
