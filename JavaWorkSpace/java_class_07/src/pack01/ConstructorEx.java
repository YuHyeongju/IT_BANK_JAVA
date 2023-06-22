package pack01;

public class ConstructorEx {

	// public 접근제한생성자: 모든 패키지에서 생성자 호출 가능
	public ConstructorEx() {
		System.out.println("public 접근제한 생성자");
	}

	// protected 접근제한생성자: 같은 패키지와 자식클래스에서 생성자 호출 가능
	protected ConstructorEx(int a) {
		System.out.println("protected 접근제한 생성자");
	}

	// default 접근제한생성자: 같은 패키지에서 생성자 호출 가능
	ConstructorEx(int a, int b) {
		System.out.println("default 접근제한 생성자");
	}

	// private 접근제한 생성자: 오로지 클래스 내부에서 접근가능
	private ConstructorEx(int a, int b, int c) {
		System.out.println("private 접근제한 생성자");
	}

	public static void main(String[] args) {
		new ConstructorEx();
		new ConstructorEx(1);
		new ConstructorEx(1, 2);
		new ConstructorEx(1, 2, 3);
	}
}
