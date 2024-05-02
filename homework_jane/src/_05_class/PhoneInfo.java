package _05_class;

public class PhoneInfo {
	
	//middle
	
	String[] names = new String[100];
	String[] phoneNums = new String[100];

	int index = 0;

	
	
	public void insertPhoneInfo(String name, String phoneNum) {
	    //매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
		this.names[index] = name; 				//순서대로 넣어야 해서? index? 왜
		this.phoneNums[index] = phoneNum;
		index++; 							// 요부분	
		
	}

	public void printAllPhoneInfo() {
	    //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현 
		for(int i = 0; i < names.length; i++) {
			if(names[i] != null) {
				System.out.println("이름 : " + names[i] + "번호 : " + phoneNums[i]);
			}
		}
		
	}

	public void printPhoneInfo(int index) {
	    //매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
		if(names[index] != null) {
			System.out.println("이름 : " + names[index] + ", 번호 :" +phoneNums[index]+"\n");
		} else {
			System.out.println("해당 번호로 저장된 정보가 없습니다.");
		}
		
		
		
	}

}
