package interface1;


interface Print{
	
	void printA4(); //public abstract 생략
	void printB4(); //public abstract 생략
	
	
}

interface Scan{
	
	void scanA4();
	void scanB4();
	
}


class Machine implements Print,Scan{ //다중상속가능, 클래스를 통한 다중상속은 미지원
	
	@Override
	public void printA4(){
		System.out.println("A4용지를 프린트합니다.");
	}

	@Override
	public void scanA4() {
		System.out.println("A4용지를 스캔합니다.");
	}

	@Override
	public void scanB4() {
		System.out.println("B4용지를 스캔합니다.");
	}

	@Override
	public void printB4() {
		System.out.println("B4용지를 프린트 합니다.");
	}
}


public class Ex02 {

	public static void main(String[] args) {
		Machine machine = new Machine();
		
		machine.printA4();
		machine.scanA4();
		machine.printB4();
		machine.scanB4();
	}

}
