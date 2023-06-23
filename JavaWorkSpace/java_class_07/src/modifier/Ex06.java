package modifier;

public class Ex06 {
 
	//메인메소드 
	public static void main(String[] args){
		
		//public : 접근제한자, 모든 패키지에서 접근 가능
		//static : 지정예약어, 메모리에 미리 올린다.
		//void: 반환타입, 반환할 값이 없다.
		//main: 메소드명, 프로그램 시작시 jvm이 main 메소드를 실행
		//String[] args : 매개변수, String형태의 배열로 arguments 값을 처리한다.
		
		for(String str: args) { //향상된 for문 
			System.out.println(str);
			
		}
		
	}

}
