package class1.constructor;

import java.util.Scanner;

//car 클래스 만들기 
//필드 private String color; private int speed
//생성자에서 매개변수로 매개값을 받아서 필드 초기화
//속도가 30미만이거나 200을 초과할경우 속도를 50으로 세팅
// 필드를 출력해주는 carProfile 메소드를 만들어서 객체 생성시 생성자에서 메소드 호출

class Car {
	private String color;
	private int speed;


	public Car(String color, int speed) {//필드초기화
		this.color = color;
		if (speed < 30 || speed > 200) {
			System.out.println("속도는 30 이상이거나, 200 이하여야 합니다.");
			System.out.println("속도를 50으로 초기화 합니다.");
			this.speed = 50;
		} else {
			this.speed = speed;
		}
		carProfile();//메소드 호출
		
	}

	public void carProfile() {
		System.out.println("색상: " + color);
		System.out.println("속도: " + speed);

	}

}

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 자동차의 색상입력: ");
		String color = sc.next();
		
		System.out.println("생성할 자동차의 속도 입력: ");
		int speed = sc.nextInt();
		
		new Car(color,speed);
		

		sc.close();
	}

}
