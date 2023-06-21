package class1.constructor;


class Student {
	//필드
	String school = "IT학교"; //선언과 동시에 초기화 - 편리함. 단점: 모든 school이 IT학교가 되버림
	int studentID;
	String name;
	int age;
	
	//생성자
	//1. 생성자를 명시하지 않으면 자바컴파일러는 기본생서자를 자동으로 만들어준다.
	//2. 그러나 생성자를 명시하면 만들지 않는다
	//3. 생성자는 메소드와 비슷하게 생겼지만, 반환타입이 없고, 클래스 이름과 같은 이름이다.
	
	public Student(int studentID, String name, int age) { //생성자는 객체를 생성할 때 호출됨. 역할: 필드초기화
		
		this.studentID = studentID;					      //장점: 외부에서 다양한 값을 줄 수가 있다.
		this.name = name;
		this.age = age;
		
	}
	
	public void studentProfile() { //출력 메소드
		System.out.println("학교: "+ school);
		System.out.println("학번: "+ studentID);
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);

	}
	
	
	
}



public class Ex01 {

	public static void main(String[] args) {
		Student student1 = new Student(202301,"홍길동",20); //객체의 주소값을  student에 저장하고 사용
		//객체를 생성하면 생성자가 호출되고
		//필드초기화와 메소드 호출 등 객체를 사용할 준비를 한다.
		Student student2 = new Student(202302, "성춘향", 22);
		//생성자를 명시하면 컴파일러가 기본생성자를 만들지않아서 빨간줄이 생긴다.
		//->매개값을 넣어서 호출을 해줘야함
		
		student1.studentProfile();
		
		System.out.println();
		
		student2.studentProfile();
	}

}
