package basic;

public class SmartPhone {
	// 1. 필드
	// 1-1. 브랜드
	public String brand;
	// 1-2. 제품명
	public String productName;
	// 1-3. 배터리용량(Ah)
	public int batteryAh;
	
	// 2. 기능
	// 2-1. 전원을 킨다.
	public void turnOn() {
		System.out.println("휴대폰 전원을 킵니다.");
	}
	// 2-2. 메시지를 보낸다.
	public void sendTextMessage() {
		System.out.println("문자 메시지를 전송합니다.");
	}
	// 2-3. 사진을 전송한다.
	public void sendPhoto() {
		System.out.println("사진을 전송합니다.");
	}
}
