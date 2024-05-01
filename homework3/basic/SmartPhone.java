package homework3;

public class SmartPhone {
	// 1. SmartPhone 클래스를 생성하고 속성 세 개와 기능 세개를 자유롭게 만들어보세요.
	String name;
	int password;
	String model;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String name, int password, String model) {
		this.name = name;
		this.password = password;
		this.model = model;
	}
	
	public void phoneInfoPrint() {
		System.out.println("이름 : " + name);
		System.out.println("비밀번호 : " + password);
		System.out.println("폰 기종 : " + model);
	}
	
	public void turnOnLight() {
		System.out.println("손전등이 켜졌습니다.");
	}
	
	public void turnOffLight() {
		System.out.println("손전등이 꺼졌습니다.");
	}
}
