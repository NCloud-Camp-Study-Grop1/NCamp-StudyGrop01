package homework.homework4.basicParent;

public class ChildA extends Parent {
	String name;
	
	// 기본생성자 생성
	public ChildA() {
		
	}

	public ChildA(String firstname, String bloodType, int cm, String skin,
			String name) {
		super(firstname, bloodType, cm, skin);
		this.name = name;
	}
	
	@Override
	public void inFo() {
		System.out.println("성 : " + firstname);
		System.out.println("이름 : " + name);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("키 : " + cm);
		System.out.println("피부색 : " + skin);
		
	}
	
	
}
