package abstraction;

abstract class Worker{
	String name;
	public Worker(String name) {
		this.name = name;
	}
	public abstract void Work();
		
	
}
//Worker 클래스를 상속받는 TaxiDriver 클래스를 만든후 
//work 매소드를 오버라이딩하여 재정의 하기

class TaxiDriver extends Worker{
	

	public TaxiDriver(String name) {
		super(name);
	}

	@Override
	public void Work() {
		System.out.println(name + "이(가) 택시를 운행합니다.");
	}
}


public class Ex02 {

	public static void main(String[] args) {
		TaxiDriver driver = new TaxiDriver("홍길동");
		
		driver.Work();
		
	}

}
