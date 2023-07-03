package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	
	int studentID;
	String name;
	String department;
	
	public Student(int studentID, String name,String department) {
		this.studentID = studentID;
		this.name = name;
		this.department = department;
	}
	
	public void profile() {
		System.out.println("학번:  " + studentID);
		System.out.println("이름:  " + name);
		System.out.println("학과:  " + department);
	}
	
	
	
}





public class Ex04 {

	public static void main(String[] args) {
		//Student 타입의 ArrayList를 생성한 후 Student 객체를 3개 ArrayList에 저장
		//Iterator를 사용하여 ArrayList에  있는 Student 객체의 profile 메소드 호출하기
		
		List<Student> st = new ArrayList<>();
		
		st.add(new Student(202302,"홍길동","컴퓨터공학과"));
		st.add(new Student(202303,"유관순","냉동공조학과"));
		st.add(new Student(202304,"장영실","디지털미디어학과"));
		
		Iterator<Student> iterator = st.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			
			student.profile();
			
			System.out.println();
		}
		
		
	}

}
