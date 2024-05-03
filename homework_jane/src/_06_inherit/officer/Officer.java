package _06_inherit.officer;

public abstract class Officer {
	
//	2. 추상클래스 회사원
//	  - 사번 => int eno
//	  - 이름 => String name
//	  - 급여 => int pay
//	  - 근무형태 => int type //1: 정규직, 2: 계약직, 3. 임시직
//	 생성자(사번, 이름, 급여, 근무형태);
//	 추상메서드 double getMonthPay();
//	 일반메서드 void showEmployeeInfo();
//
//	위 추상클래스 회사원을 상속받은 아래 세 클래스를 만들고 
//	메서드 getMonthPay와 showEmployeeInfo를 오버라이드하여 구현하세요.
//	정규직 : int bonus, 월급 = pay / 12 + bonus/12
//	임시직 : int hireYear, 월급 = pay / 12;
//	계약직 : int workDay, 월급 = pay * workDay
	
	public int eno; 
	public String name; 
	public int pay; 
	public String type; 
	
	public Officer() {
		
	}
	
	public Officer(int eno, String name, int pay, String type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("사번 :" + eno);
		System.out.println("이름 :" + name);
		System.out.println("급여 :" + pay);
		System.out.println("근무형태 :" + type);
	}
	
	

}
