package method;

public class Ex02 {

	public static void hello() {
		int i = 0;
		
		while(i < 5) {
			System.out.println("안녕하세요");
			i++;
			
			if(i == 3) {
				//return;
				//return 값이 없는 void  메소드에서
				//return 문을 사용하면 메소드 강종
				System.exit(0);//프로그램 자체를 종료시킴
				//반복문 강제종료 : break;
				//메소드 강제종료: return;
				//프로그램 강제종료 : exit;
				
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("main메소드 시작");
		
		hello();
		
		System.out.println("main메소드 끝");
		
		
	}

}
