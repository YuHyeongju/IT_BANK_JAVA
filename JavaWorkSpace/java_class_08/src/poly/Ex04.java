package poly;

//매개변수의 다양성 

class Vehicle {
	
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Vehicle{
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
	
}

class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	
}

class Driver{
	
	
	public void drive(Vehicle vehicle) { //vehicle타입 객체, 택시 ,버스 객체가 매개변수로 들어올 수 있다.
		
		if(vehicle instanceof Bus) {//instanceof: 객체 타입 확인 연산자 
			
		Bus bus = (Bus)vehicle; //강제타입변환 (다운 캐스팅)
		bus.checkFare();
		
		}
		vehicle.run();
	}
	
	
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //재정의된 자식의 객체가 들어온다.
		System.out.println();
		driver.drive(taxi);
	}

}
