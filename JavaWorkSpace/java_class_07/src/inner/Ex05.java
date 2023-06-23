package inner;

class Outer5{
	
	public void aaa() {
		System.out.println("aaa");
	}
	public void bbb() {
		System.out.println("bbb");
	}
	public void ccc() {
		System.out.println("ccc");
	}
}




public class Ex05 {

	public static void main(String[] args) {
		Outer5  O5 = new Outer5() { // 익명클래스 Outer5의 메소드를 가져와서 수정할 수 있음
									//이 실행 블록은 이름이 없어서 익명 클래스이다.
									//익명클래스, 익명중첩클래스, 익명내부클래스 똑같은 말
			public void bbb() {     //오버라이딩(메소드재정의)
				System.out.println("bbbbb");
			}
			
		}; //세미콜론
		
		O5.aaa();
		O5.bbb();
		O5.ccc();
	}

}
