package _12_generic;

import java.util.Scanner;

public enum Country {
	
//	7. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고 첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다.
//	public void notifyFood(String country) 메소드를 만들고 country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요.
//	country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요. (각 국의 음식은 한국=불고기, 중국=짜장면, 일본=초밥, 미국=햄버거)
//	
	
	KOR("한국", "불고기"),
	CHI("중국", "마라탕"),
	JAP("일본", "스시"),
	USA("미국", "햄버거");
	
	
	private String[] strArr = new String[2];
	
	Country(String country, String menu) {
		strArr[0] = country;
		strArr[0] = menu;
	}
	
	public String[] getStrArr() {
		return strArr;
	}
	
	public void notifyFood(String country) {
		
		
	
		
	}
	
//	//1. enum 에 static 메소드 선언 
//		public static void printMonths() {
//			MethodMonth[] methodMonthArr = MethodMonth.values();
//			
//			for(MethodMonth methodMonth : methodMonthArr) {
//				System.out.println(methodMonth + "는(은)" + methodMonth.getMonthValue() + "월입니다.");
//			}
//		}
//		
//		//2. enum에 일반(인스턴스) 메소드 선언
//		public void printMonth(int month) {
//			MethodMonth[] methodMonthArr = MethodMonth.values();
//			
//			for(MethodMonth methodMonth : methodMonthArr) {
//				if(methodMonth.getMonthValue() == month) {
//					System.out.println("입력한 달은 " + methodMonth.getMonthValue() +"월입니다.");
//				}
//			}
//		}
	
	
	public static void main(String[] args) {
	
		
		Country cty = Country.KOR;
		
		cty.notifyFood("중국");
		
		
	}
}

	
//	private String countryName; 
//	private String menu;
//	
//	Country(String countryName, String menu) {
//		this.countryName = countryName;
//		this.menu = menu;
//		
//	}
//	
//	public String getCountryName() {
//		return this.countryName;
//	}
//	
//	public String getMenu() {
//		return this.menu;
//	}
//	
//	
//	public void notifyFood(String country) {
//		
//		
//		if(country.equalsIgnoreCase(countryName)) {
//			System.out.println(countryName +"의 대표음식은" + menu +"입니다.");
//			
//		}
//		
//		
//	}
	
	
	

//	public static void main(String[] args) {
//		
//		
//		Scanner sc = new Scanner(System.in);
//		String country = sc.nextLine();
//		Country cty = Country.;
//		
//		cty.notifyFood();
		
	
//	
//	}
//}


