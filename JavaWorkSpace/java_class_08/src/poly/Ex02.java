package poly;

//다형성: 부모클래스 타입의 변수가 자식객체를 참조하는것.
//1. 부모클래스가 가지고 있는 모든 멤버들에 접근할 수 있다.
// 단 자식클래스에서 메소드 오버라이딩을 했다면 오버라이딩 된 자식의 메소드가 호출된다.
//2. 자식클래스에만 있는 멤버는 오버라이딩된 메소드에 의해서만 접근 할 수 있다.

class Run {
	int speed = 100;

	public void run() {
		System.out.println(speed + "의 속도로 달린다.");
	}
}

class Person extends Run {

	String name = "홍길동";

	public void walk() {
		System.out.println(name + "이 산책을 한다. ");
	}
	
	@Override
	public void run() {
		System.out.println(name + "이 " + speed + "의 속도로 달린다.");
		walk();
		//오버라이딩 된 메소드에서 자식 클래스에만 선언된 멤버에 접근된다.
	}
}

class KiaCar extends Run {

	String model = "k5";

	public void parking() {
		System.out.println(model + " 가 주차를 한다.");
	}

	public void run() {
		System.out.println(model + "가 " + speed + "의 속도로 달린다.");
	}
}

public class Ex02 {

	public static void main(String[] args) {

		Run run = new Person();


		run.run();

		// System.out.println("name : "+ run.name);
		// 자식 멤버 필드 접근 불가
		// run.walk();
		// 자식 멤버메소드 접근안됨

		run = new KiaCar();
		//Run(부모타입 이므로 다른 자식객체를 참조할 수 있다.
		
		run.run();
	}

}
