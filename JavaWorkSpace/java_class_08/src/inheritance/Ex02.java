package inheritance;


class Sedan{
	
	public String color;
	
	public Sedan(String color) {
		
		this.color = color; //필드초기화
		
		System.out.println("Sedan 클래스 생성자 입니다.");
		
	}
}

class Sonata extends Sedan{
	
	public Sonata(String color) {
		
		super(color); //부모생성자 호출 
		//super() 매개변수를 명시하지 않으면 
		//부모클래스의 기본생성자를 호출 
		//첫 줄에만 올 수 있음
		//부모생성자에 매개변수가 있는경우 자식생성자에서 부모의 매개변수 있는 생성자를 명시해야한다.
		
		System.out.println("Sonata 클래스 생성자 입니다.");
		
	}
}


public class Ex02 {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata("빨강");
		
		System.out.println("쏘나타 색상: " + sonata.color);
	}

}
