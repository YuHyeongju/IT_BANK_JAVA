package inheritance;

class parent{
	int parentFiled = 100;
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드 입니다.");
	}
	
}

class Child extends parent{//자식클래스
	
	int childFiled = 200;
	
	public void childMethod() {
		System.out.println("자식클래스 메소드입니다.");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		Child child = new Child(); //자식클래스로부터 객체생성
		
		System.out.println("childFiled: " + child.childFiled);//자식필드
		System.out.println("parentFiled: " + child.parentFiled);//부모필드
		
		System.out.println();
		
		child.childMethod();
		child.parentMethod();
	}

}
