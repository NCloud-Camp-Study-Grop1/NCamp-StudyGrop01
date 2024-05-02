package HomeWork;

public class RegularOfficer extends Officer{
	
	int monthpay;
	

	@Override
	public double getMonthPay(int pay, int bonus) {
		
		monthpay = pay/12 + bonus/12;
		
		return monthpay;
		
	}
	
	@Override
	public void showEmployeeInfo() {
		
		System.out.println("월급은 : " + this.monthpay);
		
	}

	
	
	

}
