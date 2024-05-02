package homework.homework4.employee;

public class Permanent extends Employee {
	// 정규직
	int bonus;
	double money;
	

	public Permanent() {
		
	}

	public Permanent(int eno, String name, int pay, int type) {
		super(eno, name, pay, type);
	}

	@Override
	void showEmployeeInfo() {
		
	}
	
	@Override
	public double getMonthPay() {
		money = pay / 12 + bonus/12;
		return 0;
	}

}
