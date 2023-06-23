package inner;

// 로컬클래스 예제

class LocalEx {
	public void method() {

		class LocalInner { // 로컬클래스

			// 로컬클래스는 접근제한자를 선언할 필요가 없고(이 메소드 안에서만 사용가능)
			// static 멤버는 선언 불가
			int x = 100;
			// static int y = 200;

			public void disp() {
				System.out.println("methodInner x: " + x);
			}//로컬클래스
		}
			
		LocalInner Li = new LocalInner();
		Li.disp();
			
		    
	}//method 블록
}

public class Ex04 {

	public static void main(String[] args) {
		LocalEx ex = new LocalEx();
		ex.method();
	}

}
