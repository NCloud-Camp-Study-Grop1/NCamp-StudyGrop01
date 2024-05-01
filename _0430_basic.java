package homework;

public class _0430_basic {
	
	public static int add (int a) {
		
		int sum =0;
		for(int i=1; i <= a; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int a =10;
		
		System.out.println(add(a));
		

	}

}
