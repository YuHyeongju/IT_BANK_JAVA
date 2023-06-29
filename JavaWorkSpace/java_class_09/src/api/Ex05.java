package api;

public class Ex05 {

	public static void main(String[] args) {

		
		int[] numbers = {29, 77, 56, 93, 15, 60};
		
		//numbers 배열에서 Math 클래스의 메소드를 사용하여
		//최대값과 최소값 구하기
		int  max = numbers[0];
		int min = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
			min = Math.max(min, numbers[i]);
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
