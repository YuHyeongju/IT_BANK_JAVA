package method;

public class Ex07 {

	// 정수 배열을 매개값으로 받아 배열안의 요소들을
	// 정수 1 ~ 10까지 Math.random()을 사용하여 채워넣기

	public static void randomArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			array[i] =(int)(Math.random() * 10 ) + 1;

		}

	}

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		randomArray(array);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("array[" + i + "] : " + array[i]);
			
		}
	}

}