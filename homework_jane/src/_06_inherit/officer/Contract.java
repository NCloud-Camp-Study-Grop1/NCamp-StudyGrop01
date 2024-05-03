package _06_inherit.officer;

public class Contract extends Officer{
	
	int workDay; 
	
	public Contract() {
		
	}
	
	
	public Contract(int eno, String name, int pay, String type, int workDay) {
		super(eno, name, pay, type);
		this.workDay = workDay;
	}

	
	public double getMonthPay() {
		return (pay * workDay);
	}
}
