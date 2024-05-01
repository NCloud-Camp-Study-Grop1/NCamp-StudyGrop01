package homework;

public class _0430_middle {
	
	public static int[] arr(int[] strarr) {
		
		int[] Rarr = new int[strarr.length];
		
		for(int i = strarr.length-1, j=0; i >=0; i--, j++ ) {
			Rarr[i] = strarr[j];
		}
		
		return Rarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};// 예시 배열
		
		
		int[] rarr1 = arr(arr1);
		
		for(int i=0; i < arr1.length; i++) {
			System.out.print(rarr1[i] + " ");
		}

	}

}
