package _06_inherit.officer;

public class Temporary extends Officer{
	
	int hireYear; 
	
	public Temporary() {
		
	}
	
	public Temporary(int eno, String name, int pay, String type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		return pay / 12;
	}

}
