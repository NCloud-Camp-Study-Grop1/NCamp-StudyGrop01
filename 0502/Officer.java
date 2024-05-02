package HomeWork;

public abstract class Officer {
	
	public int eno;
	public String name;
	public int pay;
	public int type; // 1:정규직 2:계약직 3:임시직
	
	public Officer() {
		
	}
	
	public Officer(int eno, String name, int pay, int type) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public abstract double getMonthPay(int pay, int bonus);
	
	public void showEmployeeInfo() {
		
		
	}
	
	
	

}
