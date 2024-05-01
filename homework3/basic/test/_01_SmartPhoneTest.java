package homework3.test;

import homework3.SmartPhone;

public class _01_SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("오유빈", 1234, "갤럭시 S23");
		
		phone.phoneInfoPrint();
		phone.turnOnLight();
		phone.turnOffLight();
		

	}

}
