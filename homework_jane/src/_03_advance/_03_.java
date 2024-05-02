package _03_advance;

public class _03_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 다음과 같이 출력하세요.
//	    *
//	   ** *
//	  *** **
//	 **** ***
//	***** ****
		

		
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			
				
			}
			
			
			 for(int k =1; k<5 ; k++) {
				 if(i >= k)
				 System.out.print("*");
			 }
			 System.out.println();
			
		} 
		
//		for (int i = 0; i < 5; i++) {
//	        for (int j = 4; j >= 0; j--) {
//	        	if(i >= j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//	        }
//	        for(int k = 0; k < i; k++) {
//	        	System.out.print("*");
//	        }
//	        System.out.println();
//	    }	
//		
		
	
		
	}

}
