package inner;

//Outer 클래스에서 Inner 클래스 멤버 접근 예제

class Outer2{
	private int x = 100;
	
	public void disp() {
	
		System.out.println("Outer x : "+ x);
		//System.out.println("Inner y : "+ y);
		
		Inner2 inner = new Inner2(); //객체를 생성해준 후 접근
		System.out.println("Inner y : "+ inner.y);
		inner.innerMethod1();
		inner.innerMethod2();
	}
	
	class Inner2{
		private int y = 200;
		public void innerMethod1() {
			System.out.println("public 안쪽 클래스 메소드");
		}
		private void innerMethod2() {
			System.out.println("private 안쪽 클래스 메소드");
		}
	}
}




public class Ex02 {

	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		outer2.disp();
	}

}
