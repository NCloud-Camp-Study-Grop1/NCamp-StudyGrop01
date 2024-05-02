package advance.advance02;

public class ContractEmployee extends Employee {
	public int workDay;
	
	public ContractEmployee(int eno, int pay, int type, int workDay) {
		super(eno, pay, type);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		return pay * workDay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
	}
}
