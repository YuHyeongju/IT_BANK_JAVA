package modifier;

public class Ex04 {
	
	static {//스태틱 필드 초기화
		 System.out.println("static블록");
	}
	{//객체 초기황 역할 
		System.out.println("인스턴스 블록");
	}
	public Ex04() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {

		System.out.println("메인메소드시작");
		
		new Ex04();
		System.out.println();
		new Ex04();
		System.out.println("메인메소드 끝");
	}

}
