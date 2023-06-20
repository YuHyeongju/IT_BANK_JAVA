package class1.field;

//Person 클래스를 만든다.

//필드는 private String name; private int age;0 private String tel;
//필드에 대한 getter/ setter메소드를 만들어서 필드를 메소드로 접근하도록한다.
//나이를 성인나이 20살부터 60살까지 초기화 할수있도록 setAge메소드를 수정

class Person {

	private String name;
	private int age;
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 20 || age >60) {
			System.out.println("나이는 20살부터 60살까지 초기화합니다.");
			System.out.println("나이는 20살로 초기화합니다.");
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	//우클릭 해서 source에 들어가면 generate setters getters 기능이있다.
		
}

public class Ex05 {

	public static void main(String[] args) {
		Person person = new Person(); //new + 생성자
		
		person.setName("홍길동");
		person.setAge(22);
		person.setTel("010-1234-5678");
		
		System.out.println("이름: "+person.getName());
		System.out.println("나이: "+person.getAge());
		System.out.println("전화번호: "+person.getTel());
		
		
		
		
		
	}

}
