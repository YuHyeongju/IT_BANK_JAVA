package modifier;


class Person{
	static final String NATION = "KOREA";
	//정적 불변의 상수(반드시 선언과동시에 초기화)
	final  String SSN;
	//불변의 상수
	//선언과 동시에 초기화, 생성자에서 초기화
	
	String name;
	//인스턴스 멤버변수
	
	
	public Person(String ssn,String name) {
		this.SSN = ssn;
		this.name = name;
	}
	
	
}



public class Ex05 {

	public static void main(String[] args) {
		Person person = new Person("123456-123456","홍길동");
		
		System.out.println("국가: "+ person.NATION);
		System.out.println("주민등록번호: " + person.SSN);;
		System.out.println("이름: " + person.name);;
		System.out.println();
		
		//상수: 한번만 초기화가능 수정불가
//		Person.NATION = "USA";
//		person.SSN = "111111-2222222";
		
		person.name = "홍길순";
		
		System.out.println("국가:"+ person.NATION);
		System.out.println("주민등록번호:" + person.SSN);;
		System.out.println("이름:" + person.name);;
		
		
		//보통 프로그래밍에서 상수는 static final이다.
	}

}
