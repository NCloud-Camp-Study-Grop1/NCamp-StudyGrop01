package homework.homework4.employee;

public class Contract extends Employee {
	// 계약직
	int workDay;
	double money;
	
	public Contract() {
		
	}


	public Contract(int eno, String name, int pay, int type) {
		super(eno, name, pay, type);
	}




	@Override
	public double getMonthPay() {
		money = pay * workDay;
		return 0;
	}

}
