package middle;

public class PhoneInfo {
	// 1. 필드
	// 1-1. String 이름 배열
	public String[] names = new String[100];
	// 1-2. String 전화번호 배열
	public String[] phoneNums = new String[100];
	// 1-3. 인덱스
	int index = 0;
	
	// 2. 기능
	// 2-1. 매개변수로 전달된 이름과 번호를 각각의 배열에 저장
	public void insertPhoneInfo(String name, String phoneNum) {
		names[index] = name;
		phoneNums[index] = phoneNum;
		index ++;
	}
	// 2-2. 배열에 저장된 모든 이름과 번호를 순서대로 출력
	public void printAllPhoneInfo() {
		for (int i = 0; i < index; i++) {
			System.out.println("번호 " + (i + 1) + ". 이름: " + names[i] + ", 전화번호: " + phoneNums[i]);
		}
	}
	
	// 2-3. 매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력
	public void printPhoneInfo(int index) {
		if (index >= 0 || index < names.length) {
			System.out.println((index + 1) +"번. 이름: " + names[index] + ", 전화번호: " + phoneNums[index]);
		}
	}

}
