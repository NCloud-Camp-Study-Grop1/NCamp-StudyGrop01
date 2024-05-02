package _06_inherit;

import _06_inherit.animal.Animal;
import _06_inherit.animal.Cat;
import _06_inherit.animal.Lion;
import _06_inherit.animal.Tiger;

public class _01_Animal {
	
	public static void main(String[] args) {
		
		Animal animal = new Cat();
		animal.eat();
		animal.walk();
		
		animal = new Lion();
		animal.eat();
		animal.walk();
		
		animal = new Tiger();
		animal.eat();
		animal.walk();
		


	
	}
	

}
