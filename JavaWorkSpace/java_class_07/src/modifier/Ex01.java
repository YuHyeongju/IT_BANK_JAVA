package modifier;

class Box{
	static int boxID = 0;  //
	//static 맴버변수 :메모리상에 정적이다.
	//프로그램 시작 시 메모리의 메소드[ 클래스, static] 영역에 할당
	//공유되는 전역 변수로 사용
	
	int idNum = 0;
	//인스턴스변수: 객체 생성시 객체가 가지고있는 맴버
	//객체 생성시 힙 메모리에 할당됨
	
    public void increase() {
    	boxID++;
    	idNum++;
    	
    }
}


public class Ex01 {

	public static void main(String[] args) {
		Box box1 = new Box(); //힙 영역에 올라감 
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("boxID: "+ box1.boxID);
		System.out.println("idNum: "+ box1.idNum);
		System.out.println();
		
		box2.increase();
		System.out.println("boxID: "+ box2.boxID);
		System.out.println("idNum: "+ box2.idNum);
		System.out.println();
		
		box3.increase();
		System.out.println("boxID: "+ box3.boxID);
		System.out.println("idNum: "+ box3.idNum);
		System.out.println();
		
		//인스턴스 멤버변수는 객체마다 공유되지않음
		//static 멤버변수는 모든 객체가 공유된다.
		System.out.println("boxID는 : "+Box.boxID);
		//정적 필드는 원칙적으로 클래스명으로 접근함
	}

}
