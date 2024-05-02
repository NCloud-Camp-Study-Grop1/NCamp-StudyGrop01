package _06_inherit.animal;

public class Tiger extends Animal{

	 public Tiger(){
		 
	 }


	@Override
	public void eat() {
		System.out.println("호랑이가 먹이를 먹습니다.");
		
	}


	@Override
	public void walk() {
		System.out.println("호랑이가 걸어갑니다.");
		
	}


}
