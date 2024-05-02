package advance.advance02;

public abstract class Employee {
	// field
	public int eno;
	public String name;
	public int pay;
	public int type;
	
	// operator
	public Employee(int eno, int pay, int type) {
		super();
		this.eno = eno;
		this.pay = pay;
		this.type = type;
	}
	// function: 근무형태
	public String typeString() {
		switch (type) {
		case 1:
			return "정규직";
		case 2:
			return "계약직";
		case 3:
			return "임시직";
		default:
			return " - ";
		}
	}
	
	// method
	public abstract double getMonthPay();
	
	public void showEmployeeInfo() {
		System.out.println("사번: " + eno);
		System.out.println("이름: " + name);
		System.out.println("급여: " + pay);
		System.out.println("근무형태: " + typeString());
		System.out.println("월급: " + getMonthPay());
	}
	
}
