package class1.constructor;

class Student2{
	
	String school = "IT학교"; 
	int studentID;
	String name;
	int age;
	
	//필드초기화 방법 
	//1.필드를 선언할 때 초기값을 준다. - 동일한 클래스로부터 생성되는 객체들은 객체 생성시점에 모두 같은 값을가짐
	//2.생성자에서 초기값을 준다. - 외부에서 다양한 값을 줄 수 있다.
	/*
	  객체의 필드는 하나가 아니라 여러 개가 있고, 이 필드들을 모두 생성자에서 초기화 한다면 생성자의 매개 변수의 수는 
	  객체의 필드 수 만큼 선언되어야 한다 그러나 실제로는 중요한 몇 개 필드만 매개 변수를 통해 초기화되고 나머지 
	  필드들은 필드 선언시에 초기화하거나 생성자 내부에서 임의의 값 또는 계산된 값으로 초기화 한다 
	  아니면 객체 생성후에 필드값을 별도로 저장하기도 한다
	 */
	
	
	
	//기본생성자 ctrl space쓰면 생성자를 빠르게 만들 수있다.
	public Student2() {
		
	}
	
	//생성자 오버로딩 매개변수의 타입 갯수 순서 중 하나가 달라야함
	public Student2(int studentID) {
		//this.studentID = studentID;
		this(studentID,null,0);//생성자 내에서 다른 생성자를 호출 - 여기서는 기본생성자 호출
		//생성자의 첫 줄에만 올 수 있음
	}
	public Student2(int studentID,String name) {
//		this.studentID = studentID;
//		this.name = name;
		this(studentID, name,0);
	}
	public Student2(int studentID,String name,int age) {
//		this.studentID = studentID;
//		this.name = name;
//		this.age = age;
		
	}
	
	
	
	public void studentProfile() {
		System.out.println("학교: "+ school);
		System.out.println("학번: "+ studentID);
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);

	}
}




public class Ex02 {

	public static void main(String[] args) {
		Student2 student2 = new Student2(202305, "성춘향",22);
	
		student2.studentProfile();
	}

}
