package advance.advance02;

public class TemporaryEmployee extends Employee {
	public int hireYear;
	
	public TemporaryEmployee(int eno, int pay, int type, int hireYear) {
		super(eno, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		return pay / 12;
	}

}
