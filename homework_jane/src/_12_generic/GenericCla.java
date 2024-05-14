package _12_generic;

import java.awt.List;
import java.util.Map;

public class GenericCla<T> {
	
	
//	1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.

	private T t; 
	
	public T getT() {
		return t;
	}
	
	public T setT() {
		return t;
	}


//	2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서
//	스트링값으로 리턴하도록 만드세요.
	
	
	public static <T> String add(T t1, T t2) {
			
		//String str1 = String.valueOf(t1) ;
		//String str2 = String.valueOf(t2) ;

		//result = String valueOf(t1) + valueOf(t2) ;
		
		return t1.toString() + t2.toString();	
		}
//

	public static void main(String[] args) {
		
	
		
		
		
		System.out.println(add("안", "냥"));
		
		
	}
	
	

	
	
	
	
	
	
}
