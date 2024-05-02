package homework.homework4.basicParent;

public class ChildB extends Parent {
	String fingerprint;
	
	public ChildB() {
		
	}

	public ChildB(String firstname, String bloodType, int cm, String skin,
			String fiString) {
		super(firstname, bloodType, cm, skin);
		this.fingerprint = fingerprint;
	}
	
	// 부모클래스 덮어씌우기
	@Override
	public void inFo() {
		System.out.println("성 : " + firstname);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("키 : " + cm);
		System.out.println("피부색 : " + skin);
		System.out.println("지문 : " + fingerprint);
		
	}
}
