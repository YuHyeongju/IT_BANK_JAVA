package loop;

public class Ex13 {

	public static void main(String[] args) {

		int x = 0;

		while (x < 10) {

			System.out.println(x);

			if (x == 5) {
				break; // 반복문 실행을 중지 할 때 사용
			}
			
			x++;
		}
	}

}
