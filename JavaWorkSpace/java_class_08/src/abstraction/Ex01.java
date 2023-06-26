package abstraction;


abstract class Animal{//추상클래스
	
	public abstract void sound(); 
		//추상메소드, 실제 구현은 자식메소드에서 구현 
		//선언부만 가짐
	
	
}

class Dog extends Animal{
	
	
	//자식클래스에서 부모의 추상메소드는 강제 오버라이딩
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Cat cat= new Cat();
		
		dog.sound();
		cat.sound();
	}

}
