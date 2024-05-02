package _06_inherit.animal;

public class Cat extends Animal{
	

	 public Cat(){
		 
	 }


	@Override
	public void eat() {
		System.out.println("고양이가 먹이를 먹습니다.");
		
	}


	@Override
	public void walk() {
		System.out.println("고양이가 걸어갑니다.");
		
	}


	

}
