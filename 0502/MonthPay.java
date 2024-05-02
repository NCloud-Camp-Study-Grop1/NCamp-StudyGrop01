package HomeWork;

public class MonthPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Officer officer = new RegularOfficer();
		
		officer.eno = 123;
		officer.name = "마태림";
		officer.pay = 500000000;
		officer.type = 1;
		
		officer.getMonthPay(500000000, 50000000);
		officer.showEmployeeInfo();
		
		System.out.println("화이팅...!");

	}

}
