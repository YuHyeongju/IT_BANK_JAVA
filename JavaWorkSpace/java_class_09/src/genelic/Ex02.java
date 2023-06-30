package genelic;

class Box <E> {
	private E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}

}

public class Ex02 {

	public static void main(String[] args) {
//		Box box = new Box();
//
//		box.setObj("오늘 좋은 하루되세요");
//		
//		String str =(String)box.getObj();	//반환타입이 obj라 다운캐스팅 필요
//		
//		System.out.println(str);
		
		Box<String> box = new Box<String>();
		//Box클래스에서 사용 할 데이터타입을 인스턴스를 생성할 때 지정.
		//타입의 안정성 추구
		
		box.setObj("주말 잘 보내세용");
		
		String str = box.getObj();
		
		System.out.println(str);
	}

}
