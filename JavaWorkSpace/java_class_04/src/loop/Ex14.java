package loop;

public class Ex14 {

	public static void main(String[] args) {
		
		int x = 0;
		
		while(x < 10) {
			
			
			x++;
			
			
			if(x ==5) {
				continue; //반복문에서 실행흐름이동
				//while문에서는 조건식으로
				//for문에서는 증감식으로 이동
			}
			
			System.out.println(x);
		}
		
	}

}
