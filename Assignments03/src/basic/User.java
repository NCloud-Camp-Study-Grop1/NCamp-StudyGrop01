package basic;

public class User {
	// 1. 속성
	// 1-1. 아이디
	private long id;
	// 1-2. 사용자명
	public String username;
	// 1-3. 비밀번호
	private String password;
	
	// 2. 기본 생성자
	public User() {
		
	}
	
	// 3. 모든 필드를 초기화하는 생성자
	public User(long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	// 4. 메소드: getter, setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
