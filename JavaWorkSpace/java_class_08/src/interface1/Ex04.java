package interface1;

//매개변수의 다형성

interface Vehicle{
	public/*abstract 생략*/void run();
}

class Bus implements Vehicle{
	
	@Override
	public void run() { 
		System.out.println("버스가 달립니다.");
	}
	 public void checkFare() {
		 System.out.println("승차요금을 체크합니다.");
	 }
}
class Taxi implements Vehicle{
	
	@Override
	public void run() { 
		System.out.println("택시가 달립니다.");
	}
	
	
}
 
class Driver{
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {//객체타입확인 연산자
			
			Bus bus =(Bus)vehicle;//강제타입변환
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
		
		driver.drive(bus);
		System.out.println();
		driver.drive(taxi);
	}	

}
