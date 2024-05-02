package _06_inherit.animal;

public class Lion extends Animal {
	
	

	 public Lion(){
		 
	 }


	@Override
	public void eat() {
		System.out.println("사자가 먹이를 먹습니다.");
		
	}


	@Override
	public void walk() {
		System.out.println("사자가 걸어갑니다.");
		
	}


}
