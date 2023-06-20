package class1.field;

class Car2 {

	private String color;
	private int speed;
	
	//private : 외부접근 허용안됨 

	// 매개변수로 매개값을 받아 필드를 초기화하는 메소드(setter메소드)
	public void setColor(String color) {
		this.color = color; // 자기자신을 가리키는 참조변수
		// 매개변수와 필드의 이름을 동일하기 때문에
		// 메소드 안에서는 해당 필드에 접근 할 수 없다.
		// 따라서 초기화 해줄 필드이름앞에 this.를 붙여준다.
		
	}

	// 필드의 값을 반환하는 메소드(getter메소드)
	public String getColor() {
		return color;

	}

	// speed 필드로 setter / getter 메소드 만들기

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			return; //0으로 초기화 
		}
		this.speed = speed;
	}

	public int getSpeed() {
		if(speed < 30) {
			speed = 30;
		}
		return speed;
	}

}

public class Ex04 {

	public static void main(String[] args) {

		Car2 mycar = new Car2();
		
//		mycar.color = "빨강"; 
//		mycar.speed = 70;
//		
//		System.out.println("내 자동차 색상: " + mycar.color );
//		System.out.println("내 자동차 속도: " + mycar.speed );
		
		System.out.println();
		//필드로 바로 접근하는것은 객체의 무결성이 깨질수 있어 메소드로 접근하는방법을 더 선호
		
		//필드를 메소드로 접근
		mycar.setColor("파랑");
		mycar.setSpeed(100);
		
		System.out.println("내 자동차 색상: " + mycar.getColor());
		System.out.println("내 자동차 속도: " + mycar.getSpeed());
		
	}

}
