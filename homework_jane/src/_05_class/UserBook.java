package _05_class;

public class UserBook {
	
	//advanced
//	1. UserBook 클래스를 생성하세요.
//	basic 3번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는 
//	배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
//	매개변수로 username과 password를 받아서 User 객체를 생성하여 //인스턴스화ㄴ
//	배열에 저장하는 메소드 saveUserInfo를 구현하세요. 이 때 User의 id는
//	index + 1로 지정합니다.??무슨말이지 

	User[] users = new User[100];   //클래스를 타입으로 받음.

	int index = 0;
	
	public UserBook() {					//클래스 안에서는 항상 있어야함.??
		
	}
		
	public void saveUserInfo(String username, String password) {
		User users1 = new User();
		users1.setUsername(username);
		users1.setPassword(password);
		users[index++] = users1;
		//users1.setId(index+1);
		//users[index] = users1;
	
	
	}
	
	//출력
	public void printUserInfo(int index) {
		if(users[index] != null) {
			System.out.println("id: " + users[index].getId()
					+ ", username :" + users[index].getUsername()
					+ ", password :" + users[index].getPassword());
		} else {
			System.out.println("해당 인덱스에 저장된 데이터가 없습니다.");
		}
		
		
	}
	
}	


