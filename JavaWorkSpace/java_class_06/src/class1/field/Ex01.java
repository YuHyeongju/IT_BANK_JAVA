package class1.field;

class Student{
	//field : class 에 선언된 변수(맴버변수)
	int studentID = 202301;
	String name = "홍길동";
	
	public void study() {
		// 지역변수
		String place = "도서관";
		int time = 2;
		System.out.println(place+ "에서"+time+"시간동안 공부합니다.");
	}
	
	public void profile() {
		//System.out.println(place);
		//System.out.println(time);
		System.out.println("학번 : "+studentID);
		System.out.println("이름 : "+name);
	}
		
}

public class Ex01 {


	public static void main(String[] args) {
		Student student = new Student();
		//객체생성
		
		//객체사용 > 객체이름.필드
		System.out.println(student.studentID);
		System.out.println(student.name);
		
		System.out.println();
		
		//객체사용 > 객체이름.메소드명();
		student.study();
		System.out.println();
		student.profile(); 
	}

}
