package homework.homework4.employee;

public class Temporary extends Employee {
	// 임시직
	int hireYear;
	double money;
	
	public Temporary(int eno, String name, int pay, int type) {
		super(eno, name, pay, type);

	}


	@Override
	public double getMonthPay() {
		money = pay / 12;
		return 0;
	}

}
