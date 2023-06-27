package interface1;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String tel;
	
	//생성자의 매개변수로 매개값을 받아 필드 초기화
	public Person(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	
	// 필드를 출력해주는 profile 메소드 만들기
	
	public void profile() {
		System.out.println("======================");
		System.out.println("이름: " +name);
		System.out.println("나이 : " +age);
		System.out.println("전화번호: " +tel);
		System.out.println("======================");
	}
}

interface PersonService{
	public void personList(Person[] persons);
	//person 배열을 매개값으로 받아 배열 안에 person객체의 
	//이름 나이 전화번호 출력
	
	public Person[] personInsert(int personNumber);
	//정수 하나를 매개변수로 받아서 그수만큼의 Person 배열을 생성한후 
	// 반복문을 사용하여 이름 나이 전화번호를 입력받아 person 객체를 생성후 
	//배열의 각 요소에 저장
	
	
}

class PersonServiceImpl implements PersonService{
	
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void personList(Person[] persons) {
		
		for(int  i = 0; i < persons.length; i++) {
			persons[i].profile();
		}
	
		
	}
	
	@Override
	public Person[] personInsert(int personNumber) {
		
		Person[] persons = new Person[personNumber];
		
		for(int i = 0; i <persons.length; i++) {
			
			System.out.println(i+1+"번째 사람의 이름: ");
			String name =sc.next();
			
			System.out.println(i+1+"번째 사람의 나이: ");
			int age = sc.nextInt();
			
			System.out.println(i+1+"번째 사람의 전화번호: ");
			String tel =sc.next();
			
			
			persons[i] = new Person(name,age, tel);
				
		}
		return persons;
	}
}




public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("등록할 사람 수를 입력: ");
		int su = sc.nextInt();
		
		PersonService service = new PersonServiceImpl();
		
		Person[] persons = service.personInsert(su);
		
		service.personList(persons);
		
		sc.close();
		
	}

}
