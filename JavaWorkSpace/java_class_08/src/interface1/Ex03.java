package interface1;

class Car{
	
	Tire tire = new HankookTire();
	
	public void run() {
		System.out.println("자동차가 달립니다.");
		tire.roll();
	}
}

interface Tire{
	
	public abstract void roll();
	
}


class HankookTire implements Tire{
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}

class KumhoTire implements Tire{
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}


public class Ex03 {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();
		
		System.out.println();
		
		car.tire = new KumhoTire();  //필드의 다형성
		car.run();
	}

}
