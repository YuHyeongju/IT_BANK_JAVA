package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		Integer obj = 100; // 자동박싱
		//100이 객체로 생성된다.
		//100의 주소값이 obj에 저장된다
		
		int intValue = obj + 100;// obj객체내에있는 100을 빼서 intValue에 저장
		//100을 더하면 200 이라는값이 저장
		
		System.out.println(intValue);
		
		printDouble(new Double(3.14));
		
		printDouble(3.14); //자동박싱
	}

	public static void printDouble(Double obj) {
		System.out.println(obj.doubleValue());
		
	}
	
	
}
