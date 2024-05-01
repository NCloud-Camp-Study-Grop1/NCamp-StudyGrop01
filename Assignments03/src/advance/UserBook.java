package advance;

import basic.User;

public class UserBook {
	// 1. 필드 임포트
	// 1-1. User 클래스 배열
	public User[] userBook = new User[100];
	// 1-2. 인덱스
	public int index = 0;
	
	// 2. 메소드
	public void saveUserInfo(String username, String password) {
		userBook[index] = new User(index + 1, username, password);
		index ++;
	}
	
}