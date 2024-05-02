package homework.homework4.basicParent;

public class Parent {
	// 2. 성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 
	//    Parent를 상속받은 ChildA, ChildB 클래스를 만들어서 
	//    ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.
	
	String firstname;
	String bloodType;
	int cm;
	String skin;
	
	
	public Parent() {
		
	}


	public Parent(String firstname, String bloodType, int cm, String skin) {
		super();
		this.firstname = firstname;
		this.bloodType = bloodType;
		this.cm = cm;
		this.skin = skin;
	}
	
	public void inFo() {
		System.out.println("정보를 출력합니다.");
	}
	
}
