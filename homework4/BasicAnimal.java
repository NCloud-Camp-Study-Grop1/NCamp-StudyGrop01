package homework.homework4;

import homework.homework4.basicAnimal.Animal;
import homework.homework4.basicAnimal.Cat;
import homework.homework4.basicAnimal.Lion;
import homework.homework4.basicAnimal.Tiger;

public class BasicAnimal {

	public static void main(String[] args) {
		Animal animal = new Cat();
		
		animal.eat();
		animal.Characteristic();
		
		System.out.println("----------------------------");
		
		animal = new Tiger();
		
		animal.eat();
		animal.Characteristic();
		
		System.out.println("----------------------------");
		
		animal = new Lion();
		
		animal.eat();
		animal.Characteristic();
	}

}
