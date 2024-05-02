package basic.basic02;

public class ChildA extends Parent {
	//field
	String name;
	
	public ChildA(String firstName, String bloodType, int height, String skin, String name) {
		super(firstName, bloodType, height, skin);
		this.name = name;
	}
}
