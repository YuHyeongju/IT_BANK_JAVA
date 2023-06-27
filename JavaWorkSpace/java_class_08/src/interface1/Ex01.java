package interface1;


//인터페이스(interface)
// 1.  추상클래스보다 훨신 극단적이고, 제힌적인 성격을 갖는다.
// 2.상수필드와 추상메소드만 정의 할 수 있다.
//3. 상속받으려면  extends 키워드 대신 implements를 사용해야한다.
//4. 다중상속이 가능

interface Animal{
	/*public static final*/  int Max_AGE = 500;
	//생략가능
	/*public abstract*/ void sound();
	//생략가능
	
	//1.모든 멤버변수는 public static final 이어야 하며, 이를 생략가능
	//2.모든 메소드는 public abstract이어야 하며, 이를 생략가능
	//3.단 static 메소드와  default 메소드는 예외로 함 
	
	/*public*/default void defaultMethod() {
	//생략가능
		System.out.println("디폴트메소드");
	}
	
	//default 메소드
	//(JDK 1.8~)이후로 인터페이스에 추가 가능
	// 추상메소드가 아니기 때문에 쿠현클래스에선 재정의 하지 않아도 된다.
	//앞의 키워드 default로 명시해줘야함.
	// 접근제한자는 public 이며 생략 가능
	
	public static void staticMethod() {
		System.out.println("static 메소드");
	}
	//static 메소드
	//(JDK 1.8~)이후로 인터페이스에 추가 가능
	//접근제한자는 public 이며, 생략가능
}

class Cat implements Animal{
	
	
	@Override //구현클래스는 인터페이스에 선언된 추상메소드를 
	//반드시 오버라이딩 하여 재정의 해줘야함
	public void sound() {
		System.out.println("야옹");
	}
	
}

class Dog implements Animal{
	
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		//Animal animal = new Animal();
		//인터페이스는 객체 생성 불가
		//클래스를 설계하는 규격을 알려주는 용도
		
		Animal animal = null; //초기화
		
		animal = new Cat(); //구현객체 참조 , 다형성
		animal.sound();
		
		animal = new Dog(); //객체만 바꿔줘서 실행결과가 다양해짐 -> 인터페이스의 다형성
		animal.sound();
		System.out.println();
		
		Animal[] animals = new Animal[2];
		//길이가 2인 Animal 타입의 객체 배열생성
		
		animals[0] = new Cat();
		animals[1] = new Dog();
		
		animals[0].sound();
		animals[1].sound();
		
		
	}

}
