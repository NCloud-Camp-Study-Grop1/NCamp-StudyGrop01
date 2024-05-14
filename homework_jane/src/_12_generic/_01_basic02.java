package _12_generic;

import java.awt.List;
import java.util.Map;

public class _01_basic02 {
	
//	3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
	
	public static Integer sum(List<?> list) {
		

		int sum = 0;
		for(Object list1 : list) {
			sum += (int)list1;
		}
		
		return sum;
		
		//괄호안에 들어가는 유형을 어떻게 해야하는지..?

	}

		//챗찌 답
		//	public static Integer sum(List<?> list) {
		//	    int sum = 0;
		//	    for (Object obj : list) {
		//	        if (obj instanceof Integer) {
		//	            sum += (Integer) obj;
		//	        }
		//	    }
		//	    return sum;
		//	}
	
//
//	4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
	
	
	public static <T> void  prinArr(T[] Arr) {
	
		int index = 0;
		
		for(int i = 0; i< Arr.length; i++) {
			if(i % 3 == 0) {
				System.out.println(Arr[i]);
				
			}
		}
	}
		
	



	
	
//
//	5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
		
		// 제네릭 타입 T를 상속받은 Number 타입의 배열 tArr을 받아서 최소값을 찾아 반환하는 메소드
		public static <T extends Number> T getMin(T[] tArr) {
			
			// 배열의 첫 번째 요소를 최소값으로 초기화
			T min = tArr[0];
			
					for(int i = 0; i < tArr.length; i++) {
						// 현재 i 값이 현재 최소값보다 작은 경우
						if((int)tArr[i] < min.intValue()) {
							min = tArr[i]; 
									 
						}
						
					}
		
		
		
			return min;
		}
	
		

//
//	6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
//
	public void printOverTen(Map<K,V> map) {
		
		for(V v : map) {
			
			
		}
		
	}

}
