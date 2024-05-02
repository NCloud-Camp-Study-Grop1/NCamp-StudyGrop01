package homework.homework4.employee;

public abstract class Employee {
	int eno; // 사번
	String name; // 이름
	int pay; // 급여
	int type; // 근무형태 1: 정규직, 2: 계약직, 3. 임시직

	// 기본생성자
	public Employee() {
		
	}
	
	//  생성자(사번, 이름, 급여, 근무형태);
	public Employee(int eno, String name, int pay, int type) {
		super();
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}


	// 추상메서드
	public abstract double getMonthPay();
	
	// 일반메서드
	void showEmployeeInfo() {
		System.out.println(type);
		System.out.println("사번 " + eno);
		System.out.println("이름 " + name);
		System.out.println("급여 " + pay);
		
	}

}
