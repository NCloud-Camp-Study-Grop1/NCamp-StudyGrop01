package advance.advance02;

public class RegularEmployee extends Employee {
	public int bonus;

	public RegularEmployee(int eno, int pay, int type, int bonus) {
		super(eno, pay, type);
		this.bonus = bonus;
	}


	@Override
	public double getMonthPay() {
		return (pay / 12) + (bonus / 12);
	}

}
