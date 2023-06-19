package method;

public class Ex06 {

	public static void sum1(int... nums) { // 매개값을 가변적으로 받는경우

		int sum = 0;

		for (int i : nums) {// 향상된 for문
			
			sum += i;
		
		}
		
		System.out.println("들어온 수의 합: " + sum);
		
	}

	public static void sum2(int[] array) {// 매개값으로 배열을 받는경우

		int sum = 0;
		
		for (int i : array) {
			
			sum += i;
			
		}
		
		System.out.println("배열 요소의 합: " + sum);
	}

	public static void main(String[] args) {
		
		sum1(1, 2, 3);
		
		int[] array = { 1, 2, 3, 4, 5 };
		
		sum2(array);
	}

}
