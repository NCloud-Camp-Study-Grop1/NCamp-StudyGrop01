package prac_space;

public class ArrayUtility2 {
	
//	1. 다음 두 개의 static 메소드를 갖는 ArrayUtility2클래스를 만들어보고 사용하세요
//	  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
//	  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	
//	int[] s1 = new int[];
//	int[] s2 = new int[];
	
	public static int[] concat(int[] s1, int[] s2) {
		int[] result = new int[s1.length + s2.length];
		
		int index = 0 ; 
		
		for(int i = 0; i < s1.length; i++) {
			result[index++] = s1[i];
		}
		
		for(int i = 0; i < s2.length; i++) {
			result[index++] = s2[i];
		}
		return result;
	}
	
	
	public static int[] remove(int[] s1, int[] s2) {
		int[] result = new int[s1.length];
		
		int ind
		
		
	}
	
	
		
//		int[] result;
//		
//		for(int i = 0 ; i < s1.length; i++) {
//			result += s1[i];
//				if(s1[i] == null) {
//					for(int j = 0 ; j < s2.length; j++) {
//					result += s2[i];
//					}
//			}
//		}
//	return result; 
//		
//	}
//
//	public static int[] remove(int[] s1, int[] s2) {
//		
//		for(int i = 0; i < s1.length; i++) {
//			
//			if(i >0) {
//				for(int j = 0; j < s2.length; j++) {
//					if( s1[i]== s2[j]) {
//						i--;
//						
//						break;
//					}
//				}
//			}
//			
//		} return s1;
//		
//		
//	}
	
	
	
//	
//}
