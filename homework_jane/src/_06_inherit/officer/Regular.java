package _06_inherit.officer;

public class Regular extends Officer {
	
//	위 추상클래스 회사원을 상속받은 아래 세 클래스를 만들고 
//	메서드 getMonthPay와 showEmployeeInfo를 오버라이드하여 구현하세요.
//	정규직 : int bonus, 월급 = pay / 12 + bonus/12
//	임시직 : int hireYear, 월급 = pay / 12;
//	계약직 : int workDay, 월급 = pay * workDay
	public int bonus; 
	
	
	public Regular() {
		
	}
	


	public Regular(int eno, String name, int pay, String type, int bonus) {
		super(eno, name, pay, type);
		this.bonus = bonus;
		
	}
	
	
	@Override
	public double getMonthPay() {
		return (pay / 12 + bonus / 12);
	
	}
	
	//showinfo 메서드 월급에 override도 해야함 보너스 포함.
//	void showEmployeeInfo();
	

}
